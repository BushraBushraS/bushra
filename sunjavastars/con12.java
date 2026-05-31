class example{
    private int a,b;
          private example(){
              a=10;
              b=20;
    System.out.println("i am bush bush bushra ding ding");
                 }
      private example(int x,int y){
            a=x;
            b=y;
     System.out.println("i am private");

     }
 public static example newObject(){
            return new example();
               }

      public static example newObject(int x,int y){
             return new example(x,y);
     }
         public void print(){
        System.out.println(a+" "+b);
                    }
}
     class con12{
        public static void main(String args[]){
            example ex = example.newObject();
          ex.print();
           example ex1=example.newObject(10,20);
              ex1.print();
                 }
   }       