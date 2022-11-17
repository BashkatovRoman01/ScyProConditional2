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
        int OS = 1;
        int deviceYear = 2014;
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
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
    }
}

