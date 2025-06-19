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
        int deliveryDistance = 50;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + deliveryDays);

        // Задача 5
        System.out.println("\nЗадача 5");
        int monthNumber = 12;
        String season = getSeason(monthNumber);
        System.out.println("Сезон: " + season);
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static String getSeason(int monthNumber) {
        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Неверный номер месяца";
                break;
        }

        return season;
    }
}