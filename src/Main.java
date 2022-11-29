import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задание 4.1

        System.out.println("Задание 4.1");
        System.out.println();
        int clientOs = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        }

        System.out.println();

        //Задание 4.2
        System.out.println("Задание 4.2");
        System.out.println();
        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию прилодения для Android по ссылке: ");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOs по ссылке: ");
        }

        System.out.println();

        //Задание 4.3
        System.out.println("Задание 4.3");
        System.out.println();
        int year = 2022;
            if (year % 4 ==0 && year % 100 ==0 && year % 400 ==0) {
                System.out.println("Год высокосный!");
            } else if (year % 4 !=0) {
                System.out.println("Год не высокосный!");
            }
        System.out.println();

        //Задание 4.4
        System.out.println("Задание 4.4");
        System.out.println();
        int deliveryDistance = 95;
         if (deliveryDistance > 1 && deliveryDistance <20) {
             System.out.println("Срок доставки один день");
         } else
         if (deliveryDistance >= 20 && deliveryDistance < 60) {
             System.out.println("Срок доставки два дня");
         } else
         if (deliveryDistance >=60 && deliveryDistance < 100) {
             System.out.println("Срок доставки три дня");
         }
        System.out.println();

         //Задание 4.5
        System.out.println("Задание 4.5");
        System.out.println();
        int dayOfWeekNumber = 3;
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень.");
                break;
            default:
                System.out.println("Такого месяца не существует!");
            }
        }
    }

