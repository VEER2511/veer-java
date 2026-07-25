class Student {
    int id;
    String name;

    Student( String name) {
        
        this.name = name;
    }

    // Overriding hashCode
    @Override
    public int hashCode() {
        return   name.hashCode();
    }
}

public class hashcode {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul");
        Student s2 = new Student( "Priya");
        Student s3 = new Student( "Rahul"); // same data as s1

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());
        System.out.println("HashCode of s3: " + s3.hashCode());
    }
}

