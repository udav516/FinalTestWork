package org.example;

import org.example.Pets.Cat;
import org.example.Pets.Dog;
import org.example.Pets.Hamster;
import org.example.Pets.Pets;

import java.time.LocalDate;
import java.util.*;

public class Menu {
    public void showMenu() {
        ArrayList<Pets> pets = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Реестр домашних животных\n");
            System.out.println("1. Добавьте нового питомца");
            System.out.println("2. Дрессировать питомца");
            System.out.println("3. Просмотр команд питомца");
            System.out.println("4. Выход");
            System.out.print("\nВведите свой выбор: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        try (Counter counter = new Counter()) {
                            System.out.print("Введите тип питомца (cat/dog/hamster/horse/camel/donkey): ");
                            String type = sc.nextLine();
                            System.out.print("\nВведите имя питомца: ");
                            String name = sc.nextLine();
                            System.out.print("Введите дату рождения питомца(гг-мм-дд): ");
                            LocalDate birthDate = LocalDate.parse(sc.nextLine());
                            Pets pet;
                            if (type.equalsIgnoreCase("cat")) {
                                pet = new Cat(name, birthDate, null);
                            } else if (type.equalsIgnoreCase("dog")) {
                                pet = new Dog(name, birthDate, null);
                            } else if (type.equalsIgnoreCase("hamster")) {
                                pet = new Hamster(name, birthDate, null);
                            } else if (type.equalsIgnoreCase("horse")) {
                                pet = new Hamster(name, birthDate, null);
                            } else if (type.equalsIgnoreCase("camel")) {
                                pet = new Hamster(name, birthDate, null);
                            } else if (type.equalsIgnoreCase("donkey")) {
                                pet = new Hamster(name, birthDate, null);
                            } else {
                                System.out.println("Неверный тип питомца!");
                                continue;
                            }
                            pets.add(pet);
                            System.out.println("Питомец успешно добавлен!\n");
                            counter.increment();
                        } catch (IllegalStateException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }
                        break;
                    case 2:
                        if (pets.size() == 0) {
                            System.out.println("\nДомашних животных в реестре нет.!\n");
                            continue;
                        }
                        System.out.print("\nВведите индекс домашнего животного: ");
                        int index = Integer.parseInt(sc.nextLine());
                        Pets selectedPet = pets.get(index);
                        System.out.print("Введите новую команду: ");
                        String command = sc.nextLine();
                        selectedPet.addCommand(command);
                        System.out.println("Команда успешно добавлена!\n");
                        break;
                    case 4:
                        System.out.println("\nВыход из программы...");
                        break;
                    default:
                        System.out.println("\nНеверный выбор! Попробуйте еще раз.\n");
                        break;
                    case 3:
                        if (pets.size() == 0) {
                            System.out.println("\nДомашних животных в реестре нет.!\n");
                            continue;
                        }
                        System.out.print("\nВведите индекс домашнего животного: ");
                        index = Integer.parseInt(sc.nextLine());
                        selectedPet = pets.get(index);
                        selectedPet.showCommands();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nНеверный выбор! Попробуйте еще раз.\n");
            }
        } while (choice != 4);
        sc.close();
    }
}
