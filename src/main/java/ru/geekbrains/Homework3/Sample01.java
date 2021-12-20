package ru.geekbrains.Homework3;

import java.util.Scanner;

public class Sample01 {
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
        int min = 0;
        int max = 9;

        getNumberFromScanner("Угадайте число от 0 до 9. У вас 3 попытки", 0, 9, 3);
        sc.close();
    }

        public static void getNumberFromScanner(String message, int min, int max, int maxTryCount) {

            System.out.println(message);
            int randomNumber = (int)(Math.random() * (max + 1));

          for (int tryCount = 1; tryCount <= maxTryCount; tryCount++){
              int number = sc.nextInt();
              if (number == randomNumber){
                  System.out.println("Вы угадали! Попробуете еще раз? Введите 1, если хотите проддолжить и 0, если хотите выйти: ");
                  aNewAttempt();
              }else if (number > randomNumber){
                      System.out.println("Вы ввели слишком большое число");
              }else if (number < randomNumber){
                 System.out.println("Вы ввели слишком маленькое число");
              }
              if (tryCount == maxTryCount) {
                  System.out.println("Вы проиграли. Правильный ответ: " + randomNumber + " Попробуете снова? Введите 1, если хотите проддолжить и 0, если хотите выйти: ");
                  aNewAttempt();
              }
          }
        }
    public static void aNewAttempt () {
        int options = sc2.nextInt();
        switch (options){
            case 1:
                getNumberFromScanner("Угадайте число от 0 до 9. У Вас 3 попытки.", 0, 9, 3);
                break;
            case 0:
                System.out.println("Спасибо за игру!");
                break;
        }
        sc2.close();
    }
}
