import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> isLongerThan3 = str -> str.length() > 3;
        Predicate<String> isShortThan10 = str -> str.length() < 10;
        Predicate<String> lengthBetween3and10 = isLongerThan3.or(isShortThan10);
        System.out.println(lengthBetween3and10.test("123"));
    }
}
