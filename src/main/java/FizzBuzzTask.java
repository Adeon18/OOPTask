import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(int n) {
        return IntStream.range(0, n).boxed().map(x -> {
            if (x % 15 == 0 && x != 0) {
                return "Fizz Buzz";
            } else if (x % 5 == 0 && x != 0) {
                return "Buzz";
            } else if (x % 3 == 0 && x != 0) {
                return "Fizz";
            }
            return x.toString();
        }).collect(Collectors.toList());
    }
}