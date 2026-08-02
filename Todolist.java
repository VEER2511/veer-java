import java.util.*;
public class Todolist 
{
   public static void main (String[] args)
   {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number of tasks : ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter task "+(i+1)+":");
            tasks.add(sc.nextLine());
        }

        StringBuffer sb = new StringBuffer();
        sb.append("to do list \n");
        
        for(int i=0; i<tasks.size(); i++)
        {
            sb.append(i+1+"."+tasks.get(i)+"\n");
        }

        System.out.println(sb);
        



        ArrayList<String> courses= new ArrayList<>();
     

        int choice;

        do
        {
            System.out.println("\n 1. Add course : ");
            System.out.println("\n2. Remove course : ");
            System.out.println("\n 3. View course :");
            System.out.println("\n4. remove task from the todo list :");
            System.out.println("\n5. view the tasks :");
            System.out.println("\n6. Exit :");
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
                    System.out.println("enter the task to remove :");
                    String r=sc.nextLine();
                    if(tasks.remove(r))
                    {
                        System.out.println("task removed .");
                    }
                    else
                    {
                        System.out.println("task not found .");
                    }
                    break;
                case 5:
                    System.out.println("total tasks :");
                    StringBuffer str1 = new StringBuffer();
                    for(int i = 0; i < tasks.size(); i++)
                     {
                                 str1.append((i + 1) + ". ");
                                    str1.append(tasks.get(i));
                            str1.append("\n");
                        }
                    System.out.println(str1);
                    break;
                case 6: 
                    System.out.println("exited..");
                    break;
                default:
                    System.out.println("Invalid choice .");
                    break;
            }

        }while(choice!=6);
        sc.close();
   } 
}
