public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача1: ");
        int contribution = 15_000;
        int amountOfSavings = 0;
        int numberOfMonths = 1;
        while (amountOfSavings < 2_459_000) {
            amountOfSavings += contribution;
            System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + amountOfSavings + " рублей.");
            numberOfMonths++;
        }
    }

    public static void task2() {
        System.out.println("Задача2: ");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача3: ");
        int population = 12_000_000;
        int mortalityPer1000 = 8;
        int birthRatePer1000 = 17;
        int year = 1;
        while (year <= 10) {
            population += (population / 1000) * (birthRatePer1000 - mortalityPer1000);
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача4: ");
        int summ = 15_000;
        for (int numberOfMonths = 1; summ <= 12_000_000; numberOfMonths++) {
            summ *= 1.07;
            System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + summ + " рублей.");
        }
    }

    public static void task5() {
        System.out.println("Задача5: ");
        int summ = 15_000;
        for (int numberOfMonths = 1; summ <= 12_000_000; numberOfMonths++) {
            summ *= 1.07;
            if (numberOfMonths % 6 == 0) {
                System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + summ + " рублей.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача6: ");
        int summ = 15_000;
        int years = 9;
        for (int numberOfMonths = 1; numberOfMonths <= 12 * years; numberOfMonths++) {
            summ *= 1.07;
            if (numberOfMonths % 6 == 0) {
                System.out.println("Месяц " + numberOfMonths + ", сумма накоплений равна " + summ + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача7: ");

        int firstFriday = 2;
        for (int reportDay = firstFriday; reportDay <= 31; reportDay += 7) {
            System.out.println("Сегодня пятница, " + reportDay + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println("Задача8: ");
        int yearNow = 2022;
        int point1 = yearNow - 200;
        int point2 = yearNow + 100;

        for (int year = 0; year <= point2; year += 79) {
            if (year >= point1) {
                System.out.println(year);
            }
        }
    }
}
