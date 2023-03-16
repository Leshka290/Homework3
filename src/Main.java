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

        int intValue = 5;
        byte byteValue = 1;
        short shortValue = 3;
        long longValue = 1000;
        float floatValue = 5.5f;
        double doubleValue = 11.2222;

        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        System.out.println("Значение переменной byteValue с типом int равно " + byteValue);
        System.out.println("Значение переменной shortValue с типом int равно " + shortValue);
        System.out.println("Значение переменной longValue с типом int равно " + longValue);
        System.out.println("Значение переменной floatValue с типом int равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом int равно " + doubleValue + "\n");
    }

    public static void task2() {

        float floatValue = 27.12f;
        long longValue = 987678965549l;
        double doubleValue = 2.786;
        int intValue = 569, intValue2 = 27897;
        short shortValue1 = -159;
        byte byteValue = 67;
    }

    public static void task3() {

        int studentsInTheClass1 = 23, studentsInTheClass2 = 27, studentsInTheClass3 = 30;
        int totalPaper = 480;

        double paperForEachStudent = (double) totalPaper/(studentsInTheClass1 + studentsInTheClass2
                + studentsInTheClass3);
        //double использовал потому вдруг пару листочков учителя решили себе забрать
        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги" + "\n");
    }

    public static void task4() {

        int machinePerformanceIn2Minutes = 16;
        int machinePerformanceIn1Minutes = machinePerformanceIn2Minutes / 2;
        int machinePerformanceIn20Minutes = machinePerformanceIn1Minutes * 20;
        int machinePerformanceIn1Day = machinePerformanceIn1Minutes * 24 * 60;
        int machinePerformanceIn3Days = machinePerformanceIn1Day * 3;
        int machinePerformanceIn1month = machinePerformanceIn1Day * 30;

        System.out.println("За 20 минут машина произвела " + machinePerformanceIn20Minutes + " штук бутылок");
        System.out.println("За одни сутки машина произвела " + machinePerformanceIn1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformanceIn3Days + " штук бутылок");
        System.out.println("За один месяц машина произвела " + machinePerformanceIn1month + " штук бутылок" + "\n");
    }

    public static void task5() {

        int cansOfPaint = 120;
        int consumptionWhitePaint = 2;
        int consumptionBrownPaint = 4;

        int numberOfClasses = cansOfPaint / (consumptionWhitePaint + consumptionBrownPaint);
        int cansOfWhitePaint = numberOfClasses * consumptionWhitePaint;
        int cansOfBrownPaint = numberOfClasses * consumptionBrownPaint;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно "
                + cansOfWhitePaint + " банок белой краски и " + cansOfBrownPaint + " банок коричневой краски" + "\n");
    }

    public static void task6() {

        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakfastWeightInGrams = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + eggWeight * 4;
        double breakfastWeightInKilograms = (double) breakfastWeightInGrams / 1000;
        System.out.println("Вес завтрака в граммах - " + breakfastWeightInGrams + "\n"
                + "Вес завтрака в килограммах - " + breakfastWeightInKilograms + "\n");
    }

    public static void task7() {

        int loseWeight = 7;
        int loseWeightInDayMin = 250;
        int loseWeightInDayMax = 500;

        int daysForWeightLossMin = loseWeight * 1000 / loseWeightInDayMin;
        int daysForWeightLossMax = loseWeight * 1000 / loseWeightInDayMax;
        int daysForWeightLossAverage = (daysForWeightLossMin + daysForWeightLossMax) / 2;
        System.out.println("Если будет худеть по 250 грамм в день, то похудеет на 7 кг за "
                + daysForWeightLossMin + " дней");
        System.out.println("Если будет худеть по 500 грамм в день, то похудеет на 7 кг за "
                + daysForWeightLossMax + " дней");
        System.out.println("В среднем понадобиться  " + daysForWeightLossAverage + " дней, чтобы похудеть на 7 кг\n");
    }

    public static void task8() {

        int salaryMashaBefore = 67760;
        int salaryDenisBefore = 83690;
        int salaryKristinaBefore = 76230;

        int salaryMashaInYearBefore = salaryMashaBefore * 12;
        int salaryDenisInYearBefore = salaryDenisBefore * 12;
        int salaryKristinaInYearBefore = salaryKristinaBefore * 12;

        int salaryIncrease = 10;
        double salaryMashaAfter = salaryMashaBefore + ((double)salaryMashaBefore / 100 * salaryIncrease);
        double salaryDenisAfter = salaryDenisBefore + ((double)salaryDenisBefore / 100 * salaryIncrease);
        double salaryKristinaAfter = salaryKristinaBefore + ((double)salaryKristinaBefore / 100 * salaryIncrease);

        double salaryMashaInYearAfter = salaryMashaAfter * 12;
        double salaryDenisInYearAfter = salaryDenisAfter * 12;
        double salaryKristinaInYearAfter = salaryKristinaAfter * 12;

        double salaryDifMashaInYears = salaryMashaInYearAfter - salaryMashaInYearBefore;
        double salaryDifDenisInYears = salaryDenisInYearAfter - salaryDenisInYearBefore;
        double salaryDifKristinaInYears = salaryKristinaInYearAfter - salaryKristinaInYearBefore;

        System.out.println("Маша теперь получает " + salaryMashaAfter + " рублей. Годовой доход вырос на "
                + salaryDifMashaInYears + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisAfter + " рублей. Годовой доход вырос на "
                + salaryDifDenisInYears + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaAfter + " рублей. Годовой доход вырос на "
                + salaryDifKristinaInYears + " рублей");

    }
}