package SpliteratorsDemo;

import java.util.Spliterator;
import java.util.Spliterators;

public class ArraySpliteratorTest {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "Dave", "Eve" };

        // 创建一个 ArraySpliterator
        Spliterator<String> spliterator = Spliterators.spliterator(names,
                Spliterator.ORDERED | Spliterator.IMMUTABLE);

        // 遍历并输出每个元素
        spliterator.forEachRemaining(System.out::println);
    }
}
