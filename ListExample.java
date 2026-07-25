import java.util.*;
class ListExample 
{
    public static void main(String args[])
    {
        List<String> weekdays = new ArrayList<String>();
        weekdays.add("monday");
        weekdays.add("tuesday");
        weekdays.add("wednesday");
        weekdays.add("thursday");
        weekdays.add("friday");
        weekdays.add("saturday");
        weekdays.add("sunday");

        List<String> months = new LinkedList<String>();
        months.add("january");
        months.add("february");
        months.add("march");
        months.add("april");
        months.add("may");
        months.add("june");
        months.add("july");
        months.add("august");
        months.add("september");
        months.add("october");
        months.add("november");
        months.add("december");

        System.out.println("weekdays:" + weekdays);
        System.out.println("months:" + months);
    }
}