import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args){

        // set -> unique items
        // HashSet, TreeSet, LinkedTreeSet, SortedSet
        Set<Integer> set1 = new TreeSet<>();
        set1.add(17);
        set1.add(3);
        set1.add(9);
        set1.add(11);
        set1.add(9);
        set1.add(3);
        set1.add(5);
        set1.add(9);
        set1.remove(3);
        //  9, 11, 5, 17

      //  System.out.println(set1.toString());
        Integer[] inteArr = set1.toArray(new Integer[set1.size()]);
        System.out.println(Arrays.asList(inteArr));



       // System.out.println(Arrays.asList(set1.toArray(new Integer(new Integer(set1.size())))));




    }
}
