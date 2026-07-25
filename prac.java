import java.util.HashMap;

public class StudentHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "vijay");
        students.put(102, "mohan");
        students.put(103, "akshay");
        students.put(104, "krish");
        students.put(105, "vinay");

        System.out.println("students: " + students);
        System.out.println("keys: " + students.keySet());
        System.out.println("values: " + students.values());
    }
}