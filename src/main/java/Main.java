import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Human student = new Human() {
            @Override
            public void process() {
                System.out.println("Student is dead");
            }
        };
        student.process();

        List<String> arr = Arrays.asList("123", "jdshf", "dsad");
        System.out.println(GroupWordsTask.groupIt(arr));
    }
}
