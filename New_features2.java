// assertion

import java.util.*;

public class New_features2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number between 1 and 10 : ");
        int a = sc.nextInt(); //it will all the number not between 1 to 10 because we don't give conditonto print number between 1 to 10
        assert ((a > 0) && (a <= 10)); //it will also do the same thing beacause by default assertion are disabled 
        System.out.println(a);
    }
}
