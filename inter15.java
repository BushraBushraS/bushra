interface myinter{
     public void show();
     public default void greet(){
       System.out.println("i am greet");
}
}
  class inter15{
          public static void main(String args[]){
              myinter m=()->
                             {
                        System.out.println("i am show");
                                  };
                     
               m.show();
               m.greet();
}
}