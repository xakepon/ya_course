package ru.practicum;

import java.util.Scanner;

/*
Вам нужно запрограммировать робота, который должен познакомиться с пользователем, поздороваться с ним в зависимости от времени суток и поздравить с успехами в программировании. Для этого нужно объявить и реализовать такие методы:
Метод welcomeUserByName() должен спрашивать у пользователя имя, а потом сообщать, что рад знакомству.
Метод sayHelloByTime() должен спрашивать у пользователя время и в зависимости от ответа печатать приветствие:
начиная с 22 часов вечера и до 6 часов утра не включительно — "Доброй ночи!";
начиная с 6 до 12 не включительно — "Доброе утро!";
начиная с 12 до 18 не включительно — "Добрый день!";
начиная с 18 до 22 не включительно — "Добрый вечер!".
Третий метод printSuccess() должен печать только одну строку — "У вас уже неплохо получается программировать!".
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Робот-помощник v1.0.");
        sayHelloByTime();
    }

    public static void welcomeUserByName() { // Объявите метод welcomeUserByName
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();  // Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() { // Объявите метод sayHelloByTime
        System.out.println("Который час"); // Спросите у пользователя "Который час?" и сохраните ответ в переменную currentHour
        Scanner scanner = new Scanner(System.in);// В зависимости от времени предусмотрите печать приветствий
        int currentHour = scanner.nextInt();
            if (currentHour >= 22 || currentHour < 6 ) {
                System.out.println("Доброй ночи!");
            } else if (currentHour >= 6 && currentHour < 12) {
                System.out.println("Добрый утро!");
            } else if (currentHour >= 12 && currentHour < 18) {
                System.out.println("Добрый день!");
            } else if (currentHour >= 18 && currentHour < 22) {
                System.out.println("Добрый вечер!");
            }
            else {
                System.out.println("Кажется, вы ввели некорректное время.");
            }
    }

    public static void printSuccess() { // Объявите метод printSuccess
        System.out.println("У вас уже неплохо получается программировать!"); // Он должен печатать строку: У вас уже неплохо получается программировать!
    }
}