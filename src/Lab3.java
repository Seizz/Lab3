import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.util.Precision;
public class Lab3
{
    private static record City(String city, long population) {
        private City(String city, long population) {
            this.city = city;
            this.population = (long) Precision.round(population, -6);
        }

        @Override
        public String toString() {
            return city + " " + population;
        }
    }
    public static Double[] otherSides(Double side)
    {
        return new Double[] {  side + side, Precision.round(side * Math.sqrt(3D),2) };
    }
    public static String rps(String p1, String p2)
    {
            if (p1.equals(p2))
                return "TIE";
            else if (p1.equals("paper"))
                return p2.equals("scissors") ? "P2 Wins" : "P1 Wins";
            else if (p1.equals("rock"))
                return p2.equals("paper") ? "P2 Wins" : "P1 Wins";
            else if (p1.equals("scissors"))
                return p2.equals("rock") ? "P2 Wins" : "P1 Wins";
            return "TIE";
    }
    public static Integer warOfNumbers(int[] nums)
    {
        List<Integer> list = new ArrayList<>()
        {{
            for (int i : nums) add(i);
        }};
        int[] a = list.stream().map(n -> n % 2 == 0 ? new int[] {n, 0} : new int[] {0, n}).reduce(new int[] {0, 0}, (x, y) -> new int[] {x[0] + y[0], x[1] + y[1]});
        return Math.abs(a[1] - a[0]);
    }
    public static String reverseCase(String str)
    {
        return StringUtils.swapCase(str);
    }
    public static String inatorInator(String str)
    {
        return "AEIOUaeiou".indexOf(str.toCharArray()[str.toCharArray().length - 1]) != -1 ? str+"-inator " +str.length()+"000" : str+"inator "+str.length()+"000";
    }
    public static boolean doesBrickFit(Integer a, Integer b, Integer c, Integer d, Integer l)
    {
        return (b <= d) && (c <= l) || (a <= d) && (c <= l) || (a <= d) && (b <= l);
    }
    public static double totalDistance(double oil, double consume, Integer passengers, boolean vent)
    {
        return vent ?
                Precision.round(oil / (consume + consume * passengers * 0.05D + (consume + consume * passengers * 0.05D) * 0.1D) * 100D, 2) :
                Precision.round(oil / (consume + consume * passengers * 0.05D) * 100D, 1);
    }
    public static double mean(Integer[] list)
    {
        return Precision.round((double)Arrays.asList(list).stream().mapToInt(Integer::intValue).sum() / (double)list.length, 2);
    }
    public static boolean parityAnalysis(Integer value)
    {
        List<Integer> list = new ArrayList<>()
        {{
            for (char i : value.toString().toCharArray()) add(i - '0');
        }};
        return (value % 2 == 0 && list.stream().mapToInt(Integer::intValue).sum() % 2 == 0) || (value % 2 == 1 && list.stream().mapToInt(Integer::intValue).sum() % 2 == 1);
    }
    public static void main(String[] args)
    {
        System.out.println("([[\"Nice\", 942208],[\"Abu Dhabi\", 1482816],[\"Naples\", 2186853],[\"Vatican City\", 572]]) => " +
                new ArrayList<>(Arrays.asList(
                new City("Nice",942208L),new City("Abu Dhabi",1482816L),
                new City("Naples",2186853L),new City("Vatican City",572L))));
        System.out.println("([[\"Manila\", 13923452],[\"Kuala Lumpur\", 7996830],[\"Jakarta\", 10770487]]) => " +
                new ArrayList<>(Arrays.asList(
                        new City("Manila",13923452L),new City("Kuala Lumpur",7996830L),
                        new City("Jakarta",10770487L))));
        System.out.println("otherSides(1) ➞ " + Arrays.toString(otherSides(1D)));
        System.out.println("otherSides(12) ➞ " + Arrays.toString(otherSides(12D)));
        System.out.println("otherSides(2) ➞ " + Arrays.toString(otherSides(2D)));
        System.out.println("otherSides(3) ➞ " + Arrays.toString(otherSides(3D)));
        System.out.println("rps(\"rock\", \"paper\") ➞ " + rps("rock", "paper"));
        System.out.println("rps(\"paper\", \"rock\") ➞ " + rps("paper", "rock"));
        System.out.println("rps(\"paper\", \"scissors\") ➞ " + rps("paper", "scissors"));
        System.out.println("rps(\"scissors\", \"scissors\") ➞ " + rps("scissors", "scissors"));
        System.out.println("rps(\"scissors\", \"paper\") ➞ " + rps("scissors", "paper"));
        System.out.println("warOfNumbers([2, 8, 7, 5]) ➞ " + warOfNumbers(new int[]{2, 8, 7, 5}));
        System.out.println("warOfNumbers([12, 90, 75]) ➞ " + warOfNumbers(new int[]{12, 90, 75}));
        System.out.println("warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ " + warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
        System.out.println("reverseCase(\"Happy Birthday\") ➞ " + reverseCase("Happy Birthday"));
        System.out.println("reverseCase(\"MANY THANKS\") ➞ " + reverseCase("MANY THANKS"));
        System.out.println("reverseCase(\"sPoNtAnEoUs\") ➞ " + reverseCase("sPoNtAnEoUs"));
        System.out.println("inatorInator(\"Shrink\") ➞ " + inatorInator("Shrink"));
        System.out.println("inatorInator(\"Doom\") ➞ " + inatorInator("Doom"));
        System.out.println("inatorInator(\"EvilClone\") ➞ " + inatorInator("EvilClone"));
        System.out.println("doesBrickFit(1, 1, 1, 1, 1) ➞ " + doesBrickFit(1, 1, 1, 1, 1));
        System.out.println("doesBrickFit(1, 2, 1, 1, 1) ➞ " + doesBrickFit(1, 2, 1, 1, 1));
        System.out.println("doesBrickFit(1, 2, 2, 1, 1) ➞ " + doesBrickFit(1, 2, 2, 1, 1));
        System.out.println("totalDistance(70.0, 7.0, 0, false) ➞ " + totalDistance(70.0, 7.0, 0, false));
        System.out.println("totalDistance(36.1, 8.6, 3, true) ➞ " + totalDistance(36.1, 8.6, 3, true));
        System.out.println("totalDistance(55.5, 5.5, 5, false) ➞ " + totalDistance(55.5, 5.5, 5, false));
        System.out.println("mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) ➞ " + mean(new Integer[] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
        System.out.println("mean([2, 3, 2, 3]) ➞ " + mean(new Integer[] {2, 3, 2, 3}));
        System.out.println("mean([3, 3, 3, 3, 3]) ➞ " + mean(new Integer[] {3, 3, 3, 3, 3}));
        System.out.println("parityAnalysis(243) ➞ " + parityAnalysis(243));
        System.out.println("parityAnalysis(12) ➞ " + parityAnalysis(12));
        System.out.println("parityAnalysis(3) ➞ " + parityAnalysis(3));
    }
}
