public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Задача 1

        float amount =0f;
        for (int i = 0; i < generateRandomArray().length; i++) {
            amount = amount + generateRandomArray()[i];
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей");
        System.out.println();

        //Задача 2

        int costsPerDayMin = generateRandomArray()[0];
        int costsPerDayMax = generateRandomArray()[0];
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (costsPerDayMin > generateRandomArray()[i]) {
                costsPerDayMin = generateRandomArray()[i];
            }
            if (costsPerDayMax < generateRandomArray()[i]) {
                costsPerDayMax = generateRandomArray()[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + costsPerDayMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + costsPerDayMax + " рублей.");
        System.out.println();

        //Задача 3

        byte daysInMount = 30;
        float averageCosts = amount / daysInMount;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей.");
        System.out.println();

        //Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}