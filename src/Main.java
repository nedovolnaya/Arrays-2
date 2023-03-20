public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] everyDaySpend = generateRandomArray();
        int totalSpend = 0;
        for (int element : everyDaySpend) {
            totalSpend += element;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpend + " рублей");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] everyDaySpend = generateRandomArray();
        int maxSpend = 0;
        int minSpend = 0;
        for (int i = 0; i < everyDaySpend.length; i++) {
            if (everyDaySpend[i] > maxSpend) {
                maxSpend = everyDaySpend[i];
            }
            if (everyDaySpend[i] < minSpend) ;
            minSpend = everyDaySpend[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSpend + " рублей");
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] everyDaySpend = generateRandomArray();
        double averageSpend = 0;
        int totalSpend = 0;
        for (int element : everyDaySpend) {
            totalSpend += element;
            averageSpend = totalSpend / 30d;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSpend + " рублей");
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}