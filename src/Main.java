public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int clientOS = 0;
        int clientDeviceYear = 2016;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
            }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        int year = 2024;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день");
            }else if (deliveryDistance >20 && deliveryDistance <=60) {
                System.out.println("Потребуется два дня");
            } else if (deliveryDistance >60 && deliveryDistance <=100) {
                System.out.println("Потребуется три дня");
            } else {
            System.out.println("Доставки нет");
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь. Принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль. Принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март. Принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель. Принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май. Принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь. Принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль. Принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август. Принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь. Принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь. Принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь. Принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь. Принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
