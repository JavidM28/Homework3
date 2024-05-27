public class Main {
    public static void main(String[] args)
    {
        // TASK 1
        int firstTask1 = 1500000;
        byte firstTask2 =  125;
        short firstTask3 = 30000;
        long firstTask4 = 99999999;
        float firstTask5 = 3.44214f;
        double firstTask6 = 3.14159265359;
        System.out.println("Значение переменной firstTask1 с типом int равно " + firstTask1);
        System.out.println("Значение переменной firstTask2 с типом byte равно " + firstTask2);
        System.out.println("Значение переменной firstTask3 с типом short равно " + firstTask3);
        System.out.println("Значение переменной firstTask4 с типом long равно " + firstTask4);
        System.out.println("Значение переменной firstTask5 с типом float равно " + firstTask5);
        System.out.println("Значение переменной firstTask6 с типом double равно " + firstTask6);

        // TASK 2
        float secondTask1 = 27.12f;
        long secondTask2 = 987678965549L;
        double secondTask3 = 2.786;
        short secondTask4 = 569;
        short secondTask5 = -159;
        int secondTask6 = 27897;
        byte secondTask7 = 67;

        // TASK 3
        byte studentsOfLyudmila = 23;
        byte studentsOfAnna = 27;
        byte studentsOfEkaterina = 30;
        byte totalStudents = (byte) (studentsOfLyudmila + studentsOfAnna + studentsOfEkaterina);
        short totalPapers = 480;
        byte paperPerStudent = (byte) (totalPapers / totalStudents);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // TASK 4
        byte bottlesPerMinute = 16/2;
        System.out.println("За 20 минут машина произвела " + bottlesPerMinute*20 + " штук бутылок"); //SHORT
        System.out.println("За сутки машина произвела " + bottlesPerMinute*(24*60) + " штук бутылок"); //SHORT
        System.out.println("За 3 дня машина произвела " + bottlesPerMinute*(24*60*3) + " штук бутылок"); //SHORT
        System.out.println("За месяц машина произвела " + bottlesPerMinute*(24*60*30) + " штук бутылок"); //INT

        // TASK 5
        byte totalBuckets = 120;
        byte bucketsNeededPerClass = 4 + 2;
        byte numOfClasses = 120/6;
        byte whiteBuckets = (byte) (numOfClasses * 2);
        byte brownBuckets = (byte) (numOfClasses * 4);
        System.out.println("В школе, где " + numOfClasses + " классов, нужно " + whiteBuckets + " банок белой краски и " + brownBuckets + " банок коричневой краски.");

        // TASK 6
        short bananaWeightGrams = 80;
        short milkWeightGrams = 105;
        short iceCreamWeightGrams = 100;
        short eggWeightGrams = 70;
        short totalWeightGrams = (short) (bananaWeightGrams*5 + milkWeightGrams*2 + iceCreamWeightGrams*2 + eggWeightGrams*4);
        double totalWeightKilograms = (double) totalWeightGrams/1000;
        System.out.printf("Total weight in grams %d. Total weight in kilograms %.3f%n", totalWeightGrams, totalWeightKilograms);

        // TASK 7
        short totalWeightLossNeededGrams = 7000;
        short totalDays250 = (short) (totalWeightLossNeededGrams/250);
        short totalDays500 = (short) (totalWeightLossNeededGrams/500);
        System.out.println("Days needed to lose weight in the rate of 250 grams per day: " + totalDays250 );
        System.out.println("Days needed to lose weight in the rate of 500 grams per day: " + totalDays500 );

        // TASK 8
        int oldSalaryMasha = 67760;
        int oldSalaryDenis = 83690;
        int oldSalaryKristina = 76230;
        int newSalaryMasha = (int) (oldSalaryMasha * 1.1);
        int newSalaryDenis = (int) (oldSalaryDenis * 1.1);
        int newSalaryKristina = (int) (oldSalaryKristina * 1.1);
        int yearlySalaryDifferenceMasha = (newSalaryMasha * 12) - (oldSalaryMasha * 12);
        int yearlySalaryDifferenceDenis = (newSalaryDenis * 12) - (oldSalaryDenis * 12);
        int yearlySalaryDifferenceKristina = (newSalaryKristina * 12) - (oldSalaryKristina * 12);
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearlySalaryDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearlySalaryDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearlySalaryDifferenceKristina + " рублей.");
    }
}