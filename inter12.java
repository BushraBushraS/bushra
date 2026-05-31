interface myinter{
          public void wish();
}
    class inter12{
       public static void main(String args[]){
          myinter m=new myinter(){
                public void wish(){
                     System.out.println("i am wish");
                               }
                       };
                  m.wish();
               }
}

                            