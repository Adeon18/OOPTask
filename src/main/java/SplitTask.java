import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitTask {

    public static List<String> splitting(List<String> arr) {
        return arr.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
    }
}
