interface myinter
{
     public default void show(){
         System.out.println("i am show");
           }
       public static void ding(){
           int a=10;
           int b=10;
        System.out.println(a+" "+b);
           }
}   

 class myclass implements myinter{   
       public void show(){
               System.out.println(" i am my class show");
               }
            public void ding(){
                   System.out.println("i am myclass ding");
                           }
}
     

  class inter23{
      public static void main(String args[]){
        myclass m=new myclass();
             m.show();
            m.ding();
           myinter.ding();
        }
}