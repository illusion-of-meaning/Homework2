public class Main {
    public static void main(String[] args) {
        //1
        byte byteType = 13;
        short shortType = 31289;
        int intType = 9;
        long longType = 3298L;

        float floatType = 13.928f;
        double doubleType = 9.54585126;

        //2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        System.out.println("Общий вес обоих боксёров: " + (firstBoxer + secondBoxer));
        System.out.println("Разница в весе боксеров " + (firstBoxer < secondBoxer ? secondBoxer - firstBoxer : firstBoxer - secondBoxer) + " кг.");

        //3
        short weightBananas = 5 * 80;
        short weightMilk = 2 * 105;
        short weightIceCream = 2 * 100;
        short weightEagle = 4 * 70;
        int totalWeight = weightBananas + weightMilk + weightIceCream + weightEagle;

        System.out.println("Вес завтрака " + totalWeight + " гр.");
        System.out.println("Вес завтрака " + totalWeight / 1000 + " кг " + totalWeight % 1000 + " гр.");

        //4
        short excessWeight = 7000;
        System.out.println("При потере 250гр в день, похудение займет " + excessWeight / 250 + " дней.");
        System.out.println("При потере 500гр в день, похудение займет " + excessWeight / 500 + " дней.");

        //5
        int countMasha = 67_760;
        int countDenis = 83_690;
        int countChristina = 76_230;
        int newCountMasha = countMasha + (countMasha / 10);
        int newCountDenis = countDenis + (countDenis / 10);
        int newCountChristina = countChristina + (countChristina / 10);
        System.out.println("Маша теперь получает " + newCountMasha + " рублей. Годовой доход вырос на " + ((newCountMasha * 12) - (countMasha * 12)) + " рублей");
        System.out.println("Денис теперь получает " + newCountDenis + " рублей. Годовой доход вырос на " + ((newCountDenis * 12) - (countDenis * 12)) + " рублей");
        System.out.println("Кристина теперь получает " + newCountChristina + " рублей. Годовой доход вырос на " + ((newCountChristina * 12) - (countChristina * 12)) + " рублей");
    }
}