public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int theOperatingSystem = 0;
        if (theOperatingSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (theOperatingSystem == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача 2
        System.out.println("\nЗадача 2");
        theOperatingSystem = 1;
        int clientDeviceYear = 2015;
        if (theOperatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (theOperatingSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (theOperatingSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (theOperatingSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
        // Задача 3
        System.out.println("\nЗадача 3");

    }
}