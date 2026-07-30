public class Wrapperdemo {

    public static void main(String[] args) {

        int num = 100;
        Integer intObj = num; 

        double value = 25.75;
        Double doubleObj = value; 

        int primitiveInt = intObj; 
        double primitiveDouble = doubleObj; 

        Integer number = Integer.valueOf("200");
        Double decimal = Double.valueOf("45.5");

        String str1 = intObj.toString();
        String str2 = doubleObj.toString();

        int sum = intObj + number;
        double product = doubleObj * decimal;

        System.out.println("Primitive Int : " + primitiveInt);
        System.out.println("Primitive Double : " + primitiveDouble);

        System.out.println("Integer Object : " + intObj);
        System.out.println("Double Object : " + doubleObj);

        System.out.println("Converted from String (Integer) : " + number);
        System.out.println("Converted from String (Double) : " + decimal);

        System.out.println("String value of Integer : " + str1);
        System.out.println("String value of Double : " + str2);

        System.out.println("Sum : " + sum);
        System.out.println("Product : " + product);
    }
}



