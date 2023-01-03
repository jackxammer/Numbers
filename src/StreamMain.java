import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

    public static StreamMain apiRealisation(List<Integer> intList) {
        Stream<Integer> stream = intList.stream();
        Stream<Integer> stream1 = stream.filter(x -> x > 0);
        Stream<Integer> stream2 = stream1.filter(x -> x % 2 == 0);
        Stream<Integer> stream3 = stream2.sorted(Comparator.naturalOrder());
        stream3.forEach(System.out::println);
        return null;
    }
}
