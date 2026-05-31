 class first{
       protected int a;
              public void read(){
                       a=10;
                 System.out.println("first class read");
                                }
               public void ding(){
                System.out.println("i am ding");
               }
           }
class second extends first
     {
        private int b;
            public void read(){
                    b=20;
               System.out.println("second class read");
                        }
         public void print(){
            System.out.println(a+" "+b);
             }
}
    class ov1{
             public static void main(String args[]){
                first f= new first();
                second s=new second();
                  first ref;
                  ref=f;
               ref.read();
               ref.ding();    
               ref=s;
               ref.read();
              s.print();
}
}