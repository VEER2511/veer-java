import java.util.HashSet;
class HashSetExample
{
    public static void main(String args[])
    {
        HashSet<String> colors = new HashSet<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");

        System.out.println("colors in HashSet:");
        for (String color : colors)
        {
            System.out.println(colors);
        }
    }
}