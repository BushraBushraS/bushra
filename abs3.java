   abstract class example{
               public void show(){
                 System.out.println("i am bush show");
                       }
}
    class katre extends example
         {
              public void ding(){
               System.out.println("i am ding");
			}
}   
      class abs3{
             public static void main(String args[]){
               katre k=new katre();
                      k.show();
                      k.ding();
                  }
}