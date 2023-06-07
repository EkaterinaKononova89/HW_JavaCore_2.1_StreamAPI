import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list1 = new ArrayList<>();
        for( int x : intList) {
            if (x <= 0) {
                continue;
            }
            if (x % 2 != 0) {
                continue;
            }
            list1.add(x);
            Collections.sort(list1);
        }
        System.out.println(list1);
    }
}