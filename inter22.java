interface myinter{
       public default void show(){
           System.out.println("i am show");
                   myinter.ding();
}
     private static void ding(){
          System.out.println("i am ding");
                  }
}
  class inter22{
        public static void main(String args[]){
               myinter m=new myinter(){
                   };
               m.show();
                 }
              }