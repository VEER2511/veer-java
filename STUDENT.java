class STUDENT 
{
    
    String studentName;
    int rollNumber;

    
    public STUDENT() {
        studentName = "veer";
        rollNumber = 508;
    }

    
    public STUDENT(String n, int r) {
        studentName = n;
        rollNumber = r;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + studentName + ", Roll No: " + rollNumber);
    }

    
    public static void main(String[] args) 
    {
        STUDENT s1 = new STUDENT();
        STUDENT s2 = new STUDENT("VEER", 508);

        s1.displayDetails();
        s2.displayDetails();
    }
}