import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Lab2
{
    private static Integer oppositeHouse(Integer houseN, Integer streetL)
    {
        return streetL * 2 - houseN + 1;
    }
    private static String nameShuffle(String name)
    {
        //ArrayList<String> arr = new ArrayList<>(Arrays.asList(name.split(" ")));
        //Collections.reverse(arr);
        //return String.join(" ", arr);
        return name.split(" ")[1] + " " + name.split(" ")[0];
    }
    private static double discount(double price, double percent)
    {
        return price - price * percent / 100;
    }
    private static Integer differenceMaxMin(Integer[] list)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(list));
        return Collections.max(arr) - Collections.min(arr);
    }
    private static Long equal(Integer a, Integer b, Integer c)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(a,b,c));
        Map<Integer, Long> counted = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(counted.keySet().toArray()[0] + " " + counted.values().toArray()[0]);
        return (Long)counted.values().toArray()[0];
    }
    private static String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
    private static Integer programmers(Integer a, Integer b, Integer c)
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(a, b, c));
        return Collections.max(arr) - Collections.min(arr);
    }
    private static boolean getXO(String xo)
    {
        return xo.toLowerCase().chars().filter(ch -> ch == 'x').count() == xo.toLowerCase().chars().filter(ch -> ch == 'o').count();
    }
    private static String bomb(String xo)
    {
        return xo.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }
    private static boolean sameAscii(String a, String b)
    {
        return a.chars().sum() == b.chars().sum();
    }
    public static void main(String[] args)
    {
        System.out.println("oppositeHouse(1, 3) => " + oppositeHouse(1, 3));
        System.out.println("oppositeHouse(2, 3) => " + oppositeHouse(2, 3));
        System.out.println("oppositeHouse(3, 5) => " + oppositeHouse(3, 5));
        System.out.println("oppositeHouse(5, 46) => " + oppositeHouse(5, 46));

        System.out.println("nameShuffle(Donald Trump) => " + nameShuffle("Donald Trump"));
        System.out.println("nameShuffle(Rosie O'Donnell) => " + nameShuffle("Rosie O'Donnell"));
        System.out.println("nameShuffle(Seymour Butts) => " + nameShuffle("Seymour Butts"));

        System.out.println("discount(1500, 50) => " + discount(1500, 50));
        System.out.println("discount(89, 20) => " + discount(89, 20));
        System.out.println("discount(100, 75) => " + discount(100, 75));

        System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) => " +
                differenceMaxMin(new Integer[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("differenceMaxMin([44, 32, 86, 19]) => " +
                differenceMaxMin(new Integer[] {44, 32, 86, 19}));

        System.out.println("equal(3, 4, 3) => " + equal(3, 4, 3));
        System.out.println("equal(1, 1, 1) => " + equal(1, 1, 1));
        System.out.println("equal(3, 4, 1) => " + equal(3, 4, 1));

        System.out.println("reverse(Hello World) => " + reverse("Hello World"));
        System.out.println("reverse(The quick brown fox.) => " + reverse("The quick brown fox."));
        System.out.println("reverse(Edabit is really helpful!) => " + reverse("Edabit is really helpful!"));

        System.out.println("programmers(147, 33, 526) => " + programmers(147, 33, 526));
        System.out.println("programmers(33, 72, 74) => " + programmers(33, 72, 74));
        System.out.println("programmers(1, 5, 9) => " + programmers(1, 5, 9));

        System.out.println("getXO(ooxx) => " + getXO("ooxx"));
        System.out.println("getXO(xooxx) => " + getXO("xooxx"));
        System.out.println("getXO(ooxXm) => " + getXO("ooxXm"));
        System.out.println("getXO(zpzpzpp) => " + getXO("zpzpzpp"));
        System.out.println("getXO(zzoo) => " + getXO("zzoo"));

        System.out.println("bomb(There is a bomb.) => " + bomb("There is a bomb."));
        System.out.println("bomb(Hey, did you think there is a BOMB?) => " + bomb("Hey, did you think there is a BOMB?"));
        System.out.println("bomb(This goes boom!!!) => " + bomb("This goes boom!!!"));

        System.out.println("sameAscii(a, a) => " + sameAscii("a", "a"));
        System.out.println("sameAscii(AA, B@) => " + sameAscii("AA", "B@"));
        System.out.println("sameAscii(EdAbIt, EDABIT) => " + sameAscii("EdAbIt", "EDABIT"));
    }
}
