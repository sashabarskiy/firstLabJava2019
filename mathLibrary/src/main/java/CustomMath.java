public class CustomMath {

    static long factorial(int number) throws Exception {
        if (number < 0)
            throw new Exception("Number less than 0");
        return number == 0 ? 1 : number * factorial(number - 1);
    }

    static float pow(float number, int power) {
        if (power == 0)
            return  1;
        if (power % 2 == 0)
            return pow(number * number, power / 2);
        else
            return number * pow(number, power - 1);
    }

    // кодить вычисление логарифма - не
    static double log(int base, int number){

        return Math.log(number)/Math.log(base);

    }



}
