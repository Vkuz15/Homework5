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
    }
}