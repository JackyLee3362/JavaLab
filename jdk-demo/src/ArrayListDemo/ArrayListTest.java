package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(2);
        a.add(3);

        a.sort((o1, o2)->o1-o2);
        a.stream().forEach(System.out::println);
    }
}
