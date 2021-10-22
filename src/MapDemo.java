import com.sun.crypto.provider.HmacPKCS12PBESHA1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String args[]) {

        // map -> HashMap, TreeMap ...
        // rollNo -> student

        Map<String, Student> studentMap = new TreeMap<>();

        // map1, map2 , case1: map1 == map2, map1.equals(map2)
        studentMap.put("r01", new Student("r01", "Vedant", 91));
        studentMap.put("r02", new Student("ro2", "Vishnu", 99));
        studentMap.put("r03", new Student("r03", "ram", 90));

//        for(String rollNo: studentMap.keySet()){
//            Student student = studentMap.get(rollNo);
//            System.out.println("RollNo: "+rollNo+" , student: "+student.toString());
//        }
//
//        for(Student student: studentMap.values()) {
//            System.out.println("RollNo: "+student.rollNo+" , student: "+student.toString());
//
//        }

        //System.out.println(studentMap.containsValue(new Student("ro2", "Vishnu", 95)));

        studentMap.remove("r05");

        if(studentMap.containsKey("r05")){

        }

        for(String rollNo: studentMap.keySet()){
            Student student = studentMap.get(rollNo);
            System.out.println("RollNo: "+rollNo+" , student: "+student.toString());
        }


        // Treemap





    }
}

class Student{
    String name;
    String rollNo;
    int marks;

    Student(String rollNo, String name, int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String toString(){
      return "Name: "+name+" Roll: "+rollNo+" Marks: "+marks;
    }

}
