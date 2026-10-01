
import java.util.ArrayList;
public class test {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();       
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (int i = 0;i < list.size();i++){
            String src = list.get(i);
            System.out.println(src);
        }
    }

}