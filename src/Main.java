public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке. ");
        } else {
            System.out.println(" Установите версию приложения для IOS по ссылке. ");
        }

        // Задание 2
        System.out.println("Задание 2");
        int OS = 0;
        int deviceYear = 2019;
        if (OS == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }

        if (OS == 1) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }

        // Задание 3
        System.out.println("Задание 3");
        int a = 46;
        int b = 29;
        int c = 79;
        if (a > b) {
            if (a > c) {
                System.out.println("Наибольшим числом является " + a);
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("Наибольшим числом является " + b);
            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println("Наибольшим числом является " + c);
            }
        }

        // Задание 4
        System.out.println("Задание 4");
        int year = 2020;
        if (year % 4 == 0 && year % 100 == 0) {
            System.out.println("Год " + year + " является високосным.");
        } else {
            System.out.println("Год " + year + " не является високосным.");
        }

        // Задание 5
        System.out.println("Задание 5");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println(" Для доставки потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Для доставки потребуется дней: " + (deliveryTime + 1));
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println(" Для доставки потребуется дней: " + (deliveryTime + 2));
        }

        // Задание 6
        System.out.println("Задание 6");
        int monthNumber = 15;
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
                System.out.println("Нет такого периода: " + monthNumber);

        }
    }
}

