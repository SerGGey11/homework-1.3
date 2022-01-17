package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int clientOs = 0; //0 - для IOS; 1 - для Android default - ос телефона не распознана
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Андроид");
        } else if (clientOs == 0) {
            System.out.println("Установите версию прижения для IOS");
        } else {
            System.out.println("Ос телефона не распознана");
        }
        int clientOS = 1;
        int clientDeviceYear = 2015;

        boolean isLiteNeded = clientDeviceYear < 2015;
        if (clientOS == 0) {
            if (isLiteNeded) {
                System.out.println("Установите Lite-версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {
            if (isLiteNeded) {
                System.out.println("Установите Lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        int year = 2021;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "-- високосный год.");
        } else {
            System.out.println(year + "-- не является високосным годом.");
        }


        int deliveryDistance = 95;
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        }
        System.out.println("Потребуется дней: " + result);

        int mounthInYear = 12;
        switch (mounthInYear) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }}