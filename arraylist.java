import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(10);
        aa.add(20);
        aa.add(40);
        aa.add(50);
        aa.add(2,11);
        System.out.println(aa);
        // Collections.sort(aa);
        // System.out.println(aa);
        System.out.println(aa.size());
        // range - 0 to size()-1
        System.out.println(aa.get(3));
    }
}
