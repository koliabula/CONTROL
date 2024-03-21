import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import animals.Aanimals;
import animals.PaclAnimals.Camel;
import animals.PaclAnimals.Donkey;
import animals.PaclAnimals.Hourses;
import animals.pets.Cat;
import animals.pets.Dog;
import animals.pets.Homster;

public class controller {

    // 1 - cat
    // 2 dog
    // 3 homster
    // 4 hourses
    // 5 camel
    // 6 donkey

    public void myProgram() {

        testData();

        HashMap<Integer, String> mapAn = createMapAn();
        System.out.println("----Привет давай поиграем!-----");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nХочешь создать животное --- набери '1' ");
            System.out.println("Хочешь просмотреть список животных --- набери '2' ");
            System.out.println("чтобы выбрать животное --- набери имя этого животного \n"
                    + "(например: гаражик) ");
            System.out.println("Чтобы завершить программу --- набери 'q'\n");

            String nav = scanner.nextLine();

            if (nav.equals("1")) {
                addAnimals(mapAn);
            } else if (nav.equals("q")) {
                break;
            } else if (nav.equals("2")) {
                viewAnimals();
            } else if (!nav.isEmpty()) {
                editAnimal(searchAnimal(nav));
            } else {
                System.out.println("\nПопробуй ещё раз \n");
            }

        }
        // scanner.close();

    }

    void testData() {
        Cat.createAnimal("myrzic", 2020, "барс", "сидеть, бежать");
        Cat.createAnimal("garazhik", 2018, "хз", "псик, спать");

        Dog.createAnimal("bim", 2021, "такса", "sidet, bezhat");
        Dog.createAnimal("lake", 2011, "дворняга", "аппорт, фас");

        Homster.createAnimal("homka", 2022, "хз", "бежать");
        Homster.createAnimal("kriska", 2019, "хз", "спать");

        Camel.createAnimal("gorbatii", 2014, "хз", "вперёд, стой");
        Camel.createAnimal("sluntiai", 2016, "хз", "вперёд, стой");

        Donkey.createAnimal("ушастый", 2018, "хз", "вперёд, стой");
        Donkey.createAnimal("тягач", 2004, "хз", "вперёд, стой");

        Hourses.createAnimal("красавчик", 2005, "пони", "вперёд, стой");
        Hourses.createAnimal("спиди", 2010, "норм", "вперёд, стой");

    }

    HashMap createMapAn() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "cat");
        map.put(2, "dog");
        map.put(3, "homster");
        map.put(4, "hourses");
        map.put(5, "camel");
        map.put(6, "donkey");
        return map;
    }

    void addAnimals(HashMap<Integer, String> mapAn) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        while (true) {

            System.out.println("Какое животное хотите создать?");
            System.out.println("1 - Кот");
            System.out.println("2 Собака");
            System.out.println("3 Хомяк");
            System.out.println("4 Лошадь");
            System.out.println("5 Верблюд");
            System.out.println("6 Осёл");
            System.out.println("Введиде цифру от 1 до 6");

            int an = scanner.nextInt();

            if (an > 0 && an < 7) {
                createAnimals(mapAn.get(an));
                break;
            } else {
                System.out.println("Попробуем ещё раз!");
            }
        }
        // scanner.close();
    }

    void createAnimals(String str) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите имя животного");
        String name = scanner.nextLine();

        System.out.println("порода");
        String breed = scanner.nextLine();

        System.out.println("команды");
        String command = scanner.nextLine();

        System.out.println("год рождения");
        int age = scanner.nextInt();

        if (str.equals("cat")) {
            Cat.createAnimal(name, age, breed, command);
        } else if (str.equals("dog")) {
            Dog.createAnimal(name, age, breed, command);
        } else if (str.equals("homster")) {
            Homster.createAnimal(name, age, breed, command);
        } else if (str.equals("hourses")) {
            Hourses.createAnimal(name, age, breed, command);
        } else if (str.equals("camel")) {
            Camel.createAnimal(name, age, breed, command);
        } else if (str.equals("donkey")) {
            Donkey.createAnimal(name, age, breed, command);
        }
        System.out.println("    Животное добавлено!   \n");
        // scanner.close();
    }

    void viewAnimals() {
        for (Aanimals s : Aanimals.getAnList()) {
            s.getInfo();
        }

    }

    Aanimals searchAnimal(String nameAndType) {

        String nameAn = nameAndType.trim().toLowerCase();

        for (Aanimals c : Aanimals.getAnList()) {

            if (c.getName().equals(nameAn)) {
                return c;
            }
        }
        return null;

    }

    void editAnimal(Aanimals a) {
        if (a == null) {
            System.out.println("Такого животного нет!");
        } else {
            Scanner sc = new Scanner(System.in);
            while (true) {
                a.getInfo();
                System.out.println("\nВведи команду, которую хочешь удалить или добавить \nили q для выхода...\n");
                String comand = sc.nextLine();
                if (comand.equals("q")) {
                    return;
                } else {
                    editComand(a, comand);
                    a.getInfo();
                }
            }

        }
    }

    void editComand(Aanimals a, String comand) {
        String[] c = a.getCommands().trim().toLowerCase().split(",");
        for (String s : c) {
            if (s.equals(comand.trim().toLowerCase())) {
                String str = a.getCommands().trim().toLowerCase();
                str = str.replace(comand.trim().toLowerCase(), "");
                a.setCommands(str);
                System.out.println("\n Команда " + comand + " удалена!!!\n");
                return;
            }
        }
        a.setCommands(a.getCommands() + ", " + comand);
        System.out.println("\n Команда " + comand + " добавлена!!!\n");
    }
}
