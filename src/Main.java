public class Main {
    public static void main(String[] args) {

        // Задача 2

        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2014) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2014) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

        // Задача 3

        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4

        int deliveryDistance = 100;
        int days = 1;
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + days);
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            int day = days + 1;
            System.out.println("Потребуется дней " + day);
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            int day = days + 2;
            System.out.println("Потребуется дней " + day);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}