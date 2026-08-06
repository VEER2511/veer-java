class College {

    String collegeName = "SIT Pune";

    
    class Student {

        void display() {
            System.out.println("Student belongs to : " + collegeName);
        }
    }
}


interface Greeting {
    void Hello();
}


public class anonymous {

    public static void main(String args[]) {

        
        College college = new College();
        College.Student student = college.new Student();
        student.display();

        
        Greeting g = new Greeting() {

            public void Hello() {
                System.out.println("Hello from Anonymous class");
            }
        };

        g.Hello();
    }
}