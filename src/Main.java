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
    }
}