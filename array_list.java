import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<> ();
        
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        
        data.add(5);
        data.add(4);
        data.add(3);
        
        System.out.println(data);
    }
    
}
