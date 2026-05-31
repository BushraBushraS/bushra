class example{
   	private int a, b;
            private example(){
              a=10;
              b=20;
    System.out.println("i am bush bush bushra ding ding");
                 }
        public static example newObject(){
            return new example();
               }
       public void print(){
      System.out.println(a+" "+b);
          }

    }
      class con10{
         public static void main(String args[]){
            example ex=example.newObject();
               ex.print();
      }
} 