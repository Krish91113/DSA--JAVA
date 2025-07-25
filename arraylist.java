import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(10);
        aa.add(20);
        aa.add(40);
        aa.add(50);
        for(int i=0;i<aa.size();i++){
            System.out.print(aa.get(i) + " ");
        }
    }
}
