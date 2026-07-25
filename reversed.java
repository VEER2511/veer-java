public class reversed {

    public static void main(String[] args) {
        int num=1234;
        int res=0;
        while (num!=0) 
        {
            int digit=num%10;
            res=res * 10 + digit;
            num=num/10;
            
        }
        System.out.println(res);
    }
}
