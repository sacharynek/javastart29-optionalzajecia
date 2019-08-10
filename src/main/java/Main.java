import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {

        List<Integer> lista = Stream
                .iterate(8, a -> a + 1)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer > 100 && integer % 5 == 0;
                    }
                })
                .map(s -> s * 3)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(lista);

    }

}
