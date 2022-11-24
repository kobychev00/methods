public class Main {

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " является невисокосным");
        }
    }
    public static void mdOsClient (int clientOS, int clientDeviceYear) {
        int updateYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= updateYear) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
        else if (clientOS == 0 && clientDeviceYear < updateYear) {
        System.out.println("Установите версию облегченную приложения для iOS по ссылке");
    }
        else if (clientOS == 1 && clientDeviceYear >= updateYear) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }
        else if (clientOS == 1 && clientDeviceYear < updateYear) {
        System.out.println("Установите версию облегченную приложения для Android по ссылке");
    }
}

    public static void deliveryCalc(int delieveryDistance) {
        int firstBorder = 20;
        int secondBorder = 60;
        int thirdBorder = 100;
        if (delieveryDistance < firstBorder) {
            System.out.println("Потребуется сутки");
        }
        if (delieveryDistance > firstBorder && delieveryDistance < secondBorder) {
            System.out.println("Потребуется двое суток");
        }
        if (delieveryDistance > secondBorder && delieveryDistance < thirdBorder) {
            System.out.println("Потребуется трое суток");
        }
    }

    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        int Year = 2020;
        checkYear(Year);

        // задача 2
        System.out.println("задача 2");
        int clientDeviceYear = 2016;
        int clientOS = 0;
        mdOsClient(clientOS, clientDeviceYear);

        // задача 3
        System.out.println("задача 3");
        int delieveryDistance = 30;
        deliveryCalc(delieveryDistance);



        // конспект
        System.out.println("Конспект");
        int[] issusesByMonth = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issusesByMonth.length; i++) {
            printIssues(issusesByMonth[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issusesByMonth);
        printIssues(total);
    }

    public static void printSeparator() {
        System.out.println("+++++++++++++++++");
        System.out.println("-----------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}