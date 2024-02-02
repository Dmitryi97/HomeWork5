public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Задание1
        System.out.println("Задание1");
        int clientOS = 0;
        System.out.println(clientOS == 0 ? "Установиите версию приложения для IOS по ссылке." : "Установите версию приложения для Android по ссылке.");
        //Задание2
        System.out.println("Задание2");
        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2015) {
            System.out.println(clientOS == 0 ? "Установиите версию приложения для IOS по ссылке." : "Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println(clientOS == 0 ? "Установиите облегченную версию приложения для IOS по ссылке." : "Установите облегченную версию приложения для Android по ссылке.");
        }
        //Задание3
        System.out.println("Задание3");
        int year = 2021;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        //Задание4
        System.out.println("Задание4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет.");
        }
        //Задание5
        System.out.println("Задание5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println(monthNumber + " зимний месяц.");
            case 3, 4, 5 -> System.out.println(monthNumber + " весенний месяц.");
            case 6, 7, 8 -> System.out.println(monthNumber + " летний месяц.");
            case 9, 10, 11 -> System.out.println(monthNumber + " осенний месяц.");
            default -> System.out.println(monthNumber + " такого месяца нет.");
        }
    }
}
