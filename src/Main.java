public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println();

        //Задача 2
        System.out.println("Задача 2");
        short clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        int year = 1601;
        boolean isYearLeap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && year > 1584);
        if (isYearLeap) {
            System.out.println(year + " год являтся високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance < 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println();

        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 150;
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
                System.out.println("Ошибка в номере месяца");
        }
    }
}