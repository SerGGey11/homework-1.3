package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Андроид");
        } else if (clientOs == 0) ;
        {
            System.out.println("Установите версию прижения для IOS");
        }
        int clientDeviceYear = 2015;
        if (clientDeviceYear > 2015) {
            System.out.println("Приложение будет работать корректно");
        } else if (clientDeviceYear < 2015) ;
        {
            System.out.println("Советуем установить новую облегчённую версию для IOS по ссылке");
        }

        int year = 2021;
        {
            System.out.println("2021 не год является високосным");
        }

        int deliveryDistance = 95;
        if (deliveryDistance > 60 && deliveryDistance < 100) ;
        System.out.println("Курьерская доставка составит трое суток");


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