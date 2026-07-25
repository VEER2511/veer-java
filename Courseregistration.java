import java.util.*;
public class Courseregistration 
{
    public static void main(String[] args) {
        ArrayList<String> courses= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do
        {
            System.out.println("\n 1. Add course : ");
            System.out.println("\n2. Remove course : ");
            System.out.println("\n 3. View course :");
            System.out.println("\n4. Exit :");
            System.out.println("\nEnter choice :");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    System.out.println("\nEnter course name :");
                    String course=sc.nextLine();
                    courses.add(course);
                    System.out.println("course added .");
                    break;
                case 2:
                    System.out.println("\nenter course name to remove \n");
                    String remove=sc.nextLine();
                    if(courses.remove(remove))
                    {
                    System.out.println("course removed .");
                    }
                    else
                    {
                        System.out.println("course not found .");
                    }
                    break;
                case 3 :
                    System.out.println("Registerd courses :");
                    StringBuffer str = new StringBuffer();
                     for(int i = 0; i < courses.size(); i++)
                     {
                                 str.append((i + 1) + ". ");
                                    str.append(courses.get(i));
                            str.append("\n");
                        }
                    System.out.println(str);

                    break;
                case 4: 
                    System.out.println("exited..");
                    break;
                default:
                    System.out.println("Invalid choice .");
                    break;
            }

        }while(choice!=4);
        sc.close();
    }
}
