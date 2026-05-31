  interface myinter{
         public void wish();
          public default void show(){
                System.out.println("i am show");
                                  }
}
   class inter13{
        public static void main(String args[]){
              myinter m=new myinter(){
                   public void wish(){
                      System.out.println("i am show");
                             }
                     };
            m.wish();
}
}         