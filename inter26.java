import java.util.function.*;
 class inter26{
       public static void main(String args[]){
            Predicate<Integer>p=year->year%4==0;
               System.out.println("the year is"+p.test(2004));
               }
}