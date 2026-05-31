class first
    {
      protected int a;
          public first(int x){
            a=x;
    System.out.println("i am first class");
                   }
}
 class second extends first
    {
      protected int b;
           
          public second(int x,int y){
           super(x);
            b=y;
    System.out.println("i am second class");
                   }
}
class third extends second
    {
      private int c;
          public third(int x,int y,int z){
             super(x,y);
            c=z;
    System.out.println("i am third class");
                   }
     public void print(){
       System.out.println(a+" "+b+" "+c);
           }
}
  class coninh6{
     public static void main(String args[]){
        third t=new third(10,20,30);
           t.print();
      }
}