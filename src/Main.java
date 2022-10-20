public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 3");

        //Task 1
        System.out.println("Task 1");
        int i = 1_000;
        byte b = 10;
        short s = 100;
        long l = 10_000L;
        float f = 2.14F;
        double d = 10.124;
        System.out.println("Значение переменной i c типом int равно " + i);
        System.out.println("Значение переменной b c типом byte равно " + b);
        System.out.println("Значение переменной s c типом short равно " + s);
        System.out.println("Значение переменной l c типом long равно " + l);
        System.out.println("Значение переменной f c типом float равно " + f);
        System.out.println("Значение переменной d c типом double равно " + d);

        //Task 2
        System.out.println("Task 2");
        double d2 = 27.12;
        long l1 = 987_678_965_549L;
        float f1 = 2.786F;
        boolean b1 = false;
        short s1 = 569;
        int i1 = -159;
        int i2 = 27_897;
        byte b2 = 67;

        //Task3
        System.out.println("Task 3");
        int teacher1students = 23;
        int teacher2students = 27;
        int teacher3Students = 30;
        int paperSheetsTotal = 480;
        int paperSheetForOneStudent = paperSheetsTotal / (teacher1students + teacher2students + teacher3Students);
        System.out.println("На каждого ученика рассчитано " + paperSheetForOneStudent + " листов бумаги");

        //Task4
        System.out.println("Task 4");
        int outBottles = 16;
        int outTime = 2;
        int outBottlesPerMinute = outBottles / outTime;
        int outTime2 = 20;
        int outBottlesPerTwentyMinutes = outBottlesPerMinute * outTime2;
        System.out.println("За " + outTime2 + " минут машина произвела бутылок " + outBottlesPerTwentyMinutes + " штук");
        int outTime3 = 1;
        int outTimeOneDay = 60 * 24;
        int outBottlesPerOneDay = outBottlesPerMinute * outTimeOneDay;
        System.out.println("За " + outTime3 + " день машина произвела бутылок " + outBottlesPerOneDay + " штук");
        int outTime4 = 3;
        int outBottlesPerThreeDays = outBottlesPerOneDay * 3;
        System.out.println("За " + outTime4 + " дня машина произвела бутылок " + outBottlesPerThreeDays + " штук");
        int outTime5 = 1;
        int outTimeMonth = outTime5 * 30;
        int outBottlesPerMonth = outBottlesPerOneDay * outTimeMonth;
        System.out.println("За " + outTime5 + " месяц машина произвела бутылок " + outBottlesPerMonth + " штук");

        //Task 5
        System.out.println("Task 5");
        int cansPaintTotal = 120;
        int cansWhitePaintPerOneClass = 2;
        int cansBrownPaintPerOneClass = 4;
        int classesTotal = cansPaintTotal / (cansWhitePaintPerOneClass + cansBrownPaintPerOneClass);
        int cansWhitePaintTotal = 2 * classesTotal;
        int cansBrownPaintTotal = 4 * classesTotal;
        System.out.println("В школе, где " + classesTotal + " классов, нужно " + cansWhitePaintTotal + " банок белой краски и " + cansBrownPaintTotal + " банок коричневой краски");

        //Task 6
        System.out.println("Task 6");
        int banana = 5;
        int weightOneBanana = 80;
        int weightBanaTotal = weightOneBanana * banana;
        int milk = 200;
        int weightMilk = 105;
        int weightMilkTotal = (weightMilk * milk) / 100;
        int iceCream = 2;
        int weightIceCream = 100;
        int weightIceCreamTotal = weightIceCream * iceCream;
        int eggs = 4;
        int weightEggs = 70;
        int weightEggsTotal = weightEggs * eggs;
        int weightBreakfastTotal = weightBanaTotal + weightMilkTotal + weightIceCreamTotal + weightEggsTotal;
        System.out.println("Вес спорт-завтрака " + weightBreakfastTotal + " грамм");
        float weightBreakfastTotalKg = weightBreakfastTotal / 1_000F;
        System.out.println("Вес спорт-завтрака " + weightBreakfastTotalKg + " килограмм");

        //Task 7
        System.out.println("Task 7");
        int weightLossTotal = 7 * 1_000;
        int weightLoss1 = 250;
        int weightLossDays1 = weightLossTotal / weightLoss1;
        System.out.println("Если спортсмен будет терять каждый день по " + weightLoss1 + " грамм, то на похудение уйдет " + weightLossDays1 + " дней");
        int weightLoss2 = 500;
        int weightLossDays2 = weightLossTotal / weightLoss2;
        System.out.println("Если спортсмен будет терять каждый день по " + weightLoss2 + " грамм, то на похудение уйдет " + weightLossDays2 + " дней");
        int averegeNumberDays = (weightLossDays1 + weightLossDays2) / 2;
        System.out.println("Потребуется в среднем " + averegeNumberDays + " день, чтобы добиться результата похудения");

        //Task 8
        System.out.println("Task 8");
        int salaryMasha = 67_760;
        int salaryMashaPerYear = salaryMasha * 12;
        int salaryIncrementMasha = (salaryMasha * 10) / 100 + salaryMasha;
        int salaryIncremetMashaPerYear = salaryIncrementMasha * 12;
        System.out.println("Маша теперь получает " + salaryIncrementMasha + " рублей. Годовой доход вырос на " + (salaryIncremetMashaPerYear - salaryMashaPerYear) + " рублей");
        int salaryDenis = 83_690;
        int salaryDenisPerYear = salaryDenis * 12;
        int salaryIncrementDenis = (salaryDenis * 10) / 100 + salaryDenis;
        int salaryIncrementDenisPerYearUp = salaryIncrementDenis * 12;
        System.out.println("Денис теперь получает " + salaryIncrementDenis + " рублей. Годовой доход вырос на " + (salaryIncrementDenisPerYearUp - salaryDenisPerYear) + "рублей");
        int salaryKristina = 76_230;
        int salaryKristinaPerYear = salaryKristina * 12;
        int salaryIncrementKristina = (salaryKristina * 10) / 100 + salaryKristina;
        int salaryKristinaPerYearUp = salaryIncrementKristina * 12;
        System.out.println("Кристина теперь получает " + salaryIncrementKristina + " рубля. Годовой доход вырос на " + (salaryKristinaPerYearUp - salaryKristinaPerYear) + "рублей");
    }
}