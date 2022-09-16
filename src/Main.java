public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //task1
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила - " + sum + " руб.");

        //task2
        int max = 0, min = 200000;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила - " + min + " руб.");
        System.out.println("Максимальная сумма трат за день составила - " + max + " руб.");

        //task3
        sum = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила - " + sum + " руб.");

        //task4
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
