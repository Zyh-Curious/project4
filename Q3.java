import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach( integer -> System.out.println(integer) );
    }
}