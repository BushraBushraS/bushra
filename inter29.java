import java.util.function.*;
  class inter29{
        public static void main(String args[]){
      BiPredicate<Integer,Integer>p=(x,y)->(x>y);
  System.out.println("the first number is"+p.test(4,5));
}
}