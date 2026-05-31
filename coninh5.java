class first
    {
      protected int a;
          public first(){
            a=10;
    System.out.println("i am first class");
                   }
}
 class second extends first
    {
      protected int b;
          public second(){
            b=20;
    System.out.println("i am second class");
                   }
}
class third extends second
    {
      private int c;
          public third(){
            c=30;
    System.out.println("i am third class");
                   }
     public void print(){
       System.out.println(a+" "+b+" "+c);
           }
}
  class conin5{
     public static void main(String args[]){
        third t=new third();
           t.print();
      }
}