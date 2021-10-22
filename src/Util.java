import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Util {


    public static void main(String[] args){

        int[] arr = new int[10];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;

        ArrayList<Integer> list1 = new ArrayList<>(10);


        list1.add(3);
        list1.add(2);
        list1.add(3);
        // list1 -> 3, 2, 3
        list1.add(1, 5);

        //list1 -> 3, 5, 2, 3

        ArrayList<Integer> list2 = new ArrayList<>(10);

        list2.add(10);
        list2.add(20);
         Integer element = list2.get(1);

        boolean hasTwo  = list2.contains(2);


        // combine two lists
        list1.addAll(list2);
        // list1-> 5, 4, 3, 5, 2, 3, 10 ,20

        // conversion to arr
       Integer[] intArr =  list1.toArray(new Integer[list1.size()]);



        System.out.println(list1.toArray(new Integer[list1.size()]));
        //content
        System.out.println(Arrays.asList(list1));
        System.out.println(hasTwo);

        Person vishnu = new Person(30, "Vishnu");
        Person vedant = new Person(22, "Vedant");

        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(vishnu);
        personArrayList.add(0, vedant);

        Person lastPerson = personArrayList.get(personArrayList.size() - 1);
        int ageLastPerson = lastPerson.age;


        // linkedlist,7->4->1->3->4->5->6->9->11

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.add(5);
        linkedList.addLast(11);
        linkedList.add(9);

        // 1->5->11
        System.out.println("LinkedList: "+Arrays.asList(linkedList));


        Integer[] integerArr = list1.toArray(new Integer[list1.size()]);
        Arrays.sort(integerArr);
        System.out.println(Arrays.asList(integerArr));


    }


}

/*

{
    key: value, key : Object, value -> Object

} -> object

[] -> list is colelctions of objects




 */


class Person{
    String name;
    int age;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

}