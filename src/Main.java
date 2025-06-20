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
        int year = 2024;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        System.out.println("\nЗадача 4");
        int deliveryDistance = 101;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка занимает 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка занимает 3 дня");
        } else {
            System.out.println("Доставки нет");
        }

        // Задача 5
        System.out.println("\nЗадача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
        }
    }
}