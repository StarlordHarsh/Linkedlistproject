import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
                list1.add(2);
                list1.add(5);
        Iterator itr = list1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
