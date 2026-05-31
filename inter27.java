import java.util.function.*;
 class inter27{
       public static void main(String args[]){
      Function<Integer,Integer>f=x->x*x;
       System.out.println("the double of the value is"+f.apply(5));
            Function<Integer,Integer>f1=x->x*x;
       System.out.println("the area of square  is"+f1.apply(5));
              Function<Integer,Double>f2=r->Math.PI*r*r;
       System.out.println("the area of circle is"+f2.apply(5));
       
               }
}