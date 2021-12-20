import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public static Map<Character, List<String>> groupIt(List<String> arr) {
        return arr.stream().collect(Collectors.groupingBy(x -> x.charAt(0), HashMap:: new, Collectors.toList()));
    }
}
