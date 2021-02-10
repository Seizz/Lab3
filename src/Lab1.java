public class Lab1
{
    private static Integer convert(Integer minutes)
    {
        return minutes * 60;
    }
    private static Integer points(Integer twices, Integer thrices)
    {
        return twices * 2 + thrices * 3;
    }
    private static Integer footballPoints(Integer wins, Integer withdraws, Integer losses)
    {
        return wins * 3 + withdraws;
    }
    private static boolean divisibleByFive(Integer value)
    {
        return value % 5 == 0;
    }
    private static boolean and(boolean a, boolean b)
    {
        return a && b;
    }
    private static Integer howManyWalls(Integer n, Integer w, Integer h)
    {
        return n / (w * h);
    }
    public static int squared(int a)
    {
        return a * a;
    }
    private static boolean profitableGamble(float prob, Integer prize, Integer pay)
    {
        return prob * prize > pay;
    }
    private static Integer frames(Integer minutes, Integer fps)
    {
        return 60 * minutes * fps;
    }
    private static Integer mod(Integer value, Integer divideby)
    {
        return value - value / divideby * divideby;
    }
    public static void main(String[] args)
    {
        System.out.println("convert(5) => " + convert(5));
        System.out.println("convert(3) => " + convert(3));
        System.out.println("convert(2) => " + convert(2));

        System.out.println("points(13, 12) => " + points(13, 12));
        System.out.println("points(17, 12) => " + points(17, 12));
        System.out.println("points(38, 8) => " + points(38, 8));

        System.out.println("footballPoints(3, 4, 2) => " + footballPoints(3, 4, 2));
        System.out.println("footballPoints(5, 0, 2) => " + footballPoints(5, 0, 2));
        System.out.println("footballPoints(0, 0, 1) => " + footballPoints(0, 0, 1));

        System.out.println("divisibleByFive(5) => " + divisibleByFive(5));
        System.out.println("divisibleByFive(-55) => " + divisibleByFive(-55));
        System.out.println("divisibleByFive(37) => " + divisibleByFive(37));

        System.out.println("and(true, false) => " + and(true, false));
        System.out.println("and(true, true) => " + and(true, true));
        System.out.println("and(false, true) => " + and(false, true));
        System.out.println("and(false, false) => " + and(false, false));

        System.out.println("howManyWalls(54, 1, 43) => " + howManyWalls(54, 1, 43));
        System.out.println("howManyWalls(46, 5, 4) => " + howManyWalls(46, 5, 4));
        System.out.println("howManyWalls(100, 4, 5) => " + howManyWalls(100, 4, 5));
        System.out.println("howManyWalls(10, 15, 12) => " + howManyWalls(10, 15, 12));
        System.out.println("howManyWalls(41, 3, 6) => " + howManyWalls(41, 3, 6));

        System.out.println("squared(5) => " + squared(5));
        System.out.println("squared(9) => " + squared(9));
        System.out.println("squared(100) => " + squared(100));

        System.out.println("profitableGamble(0.2, 50, 9) => " + profitableGamble(0.2F, 50, 9));
        System.out.println("profitableGamble(0.9, 1, 2) => " + profitableGamble(0.9F, 1, 2));
        System.out.println("profitableGamble(0.9, 3, 2) => " + profitableGamble(0.9F, 3, 2));

        System.out.println("frames(1, 1) => " + frames(1, 1));
        System.out.println("frames(10, 1) => " + frames(10, 1));
        System.out.println("frames(10, 25) => " + frames(10, 25));

        System.out.println("mod(5, 2) => " + mod(5, 2));
        System.out.println("mod(218, 5) => " + mod(218, 5));
        System.out.println("mod(6, 3) => " + mod(6, 3));

    }
}