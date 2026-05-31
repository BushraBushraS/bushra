import java.util.*;
import java.util.function.*;
    class inter25{
           public static void main(String args[]){
                 int n;
            Scanner s=new Scanner(System.in);
            System.out.println("enter the name");
            n=s.nextInt();
            Predicate<Integer>p=k->k%2==0;
            System.out.println("given number is"+p.test(n));
                              }
}