import java.util.HashSet;
import java.util.Set;

public class Multiples {

    public static void main(String[] args) {
        Set<Integer> s = findMultiples();
        System.out.println(s.size());
    }

    private static Set<Integer> findMultiples() {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                s.add(i);
            }
        }
        return s;
    }
}
