interface myinter{
         public void wish();
             }
 class myclass implements myinter{
           public void wish(){
             System.out.println("i am wish");
                   }
}
              class inter1{
                        public static void main(String args[]){
                              myclass m=new myclass();
                                         m.wish();
                                       }
}