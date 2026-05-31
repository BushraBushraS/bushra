class example{
    private int a,b;
      private example(int x,int y){
            a=x;
            b=y;
     System.out.println("i am private");

     }

      public static example newObject(int x,int y){
             return new example(x,y);
     }
         public void print(){
        System.out.println(a+" "+b);
                    }
}
     class con11{
        public static void main(String args[]){
           example ex=example.newObject(10,20);
              ex.print();
                 }
   }       