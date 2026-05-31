abstract class first{
            protected int a;
            public first(){
                 a=10;
              System.out.println("i am first class");
                    }
}
     class second extends first{
            private int b;
                    public second(){
                          b=20;
                    System.out.println("i am second");
                                }
                     public void print(){
                         System.out.println(a+" "+b);
                              }
         }
   class abs4{
           public static void main(String args[]){
                     second s=new second();
                           s.print();
                        }
}
               