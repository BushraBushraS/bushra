import java.util.function.*;
class inter28{
    public static void main(String args[]){
           BiFunction<Integer,Integer,Integer>f=(x,y)->2*(x+y);
   System.out.println("the area of rectangle is"+f.apply(4,5));
   }}