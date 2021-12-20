import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr) {

        List<String> filteredArr = arr.stream().filter(x -> x.matches("[0-9]+")).collect(Collectors.toList());

        return filteredArr.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
