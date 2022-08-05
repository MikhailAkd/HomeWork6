import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задача 1

        int[] accountingBook = new int[] {186823,185988,139779,189756,129339,186526,156887,186804,103403,110241,161590,176116,190060,122634,191505,135234,112615,137904,152744,143749,121136,150106,152750,160676,194439,124266,121945,140876,179051,183639};
        System.out.println(Arrays.toString(accountingBook));
        System.out.println();

        int amount = 0;
        for (int i : accountingBook) {
            amount += i;
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей");
        System.out.println();

        //Задача 2

        int costsPerDayMin = accountingBook[0];
        int costsPerDayMax = accountingBook[0];
        for (int i : accountingBook) {
            if (costsPerDayMin > i) {
                costsPerDayMin = i;
            }
            if (costsPerDayMax < i) {
                costsPerDayMax = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + costsPerDayMin + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + costsPerDayMax + " рублей.");
        System.out.println();

        //Задача 3

        int daysInMonth = accountingBook.length;
        float averageCosts = (float) amount / daysInMonth;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей.");
        System.out.println();

        //Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}