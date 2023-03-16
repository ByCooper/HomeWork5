public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача №1" + "\n");
        //Код операционной системы (clientOS) для iOS = 0, для Android = 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;

        }
    }

    public static void task2() {
        System.out.println("\n" + "Задача №2" + "\n");
        int clientOS = 0;
        int clientDeviceYear = 2018;
        int yearOfMake = 2015;

        if (clientOS == 0 && clientDeviceYear < yearOfMake) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (clientOS == 0 && clientDeviceYear >= yearOfMake) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1 && clientDeviceYear < yearOfMake) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= yearOfMake) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("\n" + "Задача №3" + "\n");
        //Является год високосным или нет
        int year = 2021;
        int everyFour = 4;
        int everyHundred = 100;
        int every4Hundred = 400;

        if ((year % everyFour == 0 && year % everyHundred != 0) || year % every4Hundred == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("\n" + "Задача №4" + "\n");
        int deliveryDistance = 95;
        boolean oneDelivery = deliveryDistance < 20;
        boolean twoDelivery = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean threeDelivery = deliveryDistance >= 60 && deliveryDistance < 100;

        if (oneDelivery) {
            int timeOfDelivery = 1;
            System.out.println("Потребуется дней: " + timeOfDelivery);
        } else if (twoDelivery) {
            int timeOfDelivery = 2;
            System.out.println("Потребуется дней: " + timeOfDelivery);
        } else if (threeDelivery) {
            int timeOfDelivery = 3;
            System.out.println("Потребуется дней: " + timeOfDelivery);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void task5 () {
        System.out.println("\n" + "Задача №5" + "\n");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц (январь) принадлежит к сезону ЗИМА");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц (февраль) принадлежит к сезону ЗИМА");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц (март) принадлежит к сезону ВЕСНА");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц (апрель) принадлежит к сезону ВЕСНА");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц (май) принадлежит к сезону ВЕСНА");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц (июнь) принадлежит к сезону ЛЕТО");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц (июль) принадлежит к сезону ЛЕТО");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц (август) принадлежит к сезону ЛЕТО");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц (сентябрь) принадлежит к сезону ОСЕНЬ");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц (октябрь) принадлежит к сезону ОСЕНЬ");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц (ноябрь) принадлежит к сезону ОСЕНЬ");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц (декабрь) принадлежит к сезону ЗИМА");
                break;
            default:
                break;
        }
    }
}