import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    protected static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    protected static int[] input = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

    public static void main(String[] args) {
        System.out.println("From Collections:");

        List<Integer> result = new ArrayList<>();
        for (int x : input) {
            if (x > 0 && x % 2 == 0)
                result.add(x);
        }
        result.sort(Comparator.naturalOrder());

        for (Integer i : result) {
            System.out.println(i);
        }

        System.out.println("\nFrom StreamAPI:");

        StreamMain.apiRealisation(intList);


    }
}