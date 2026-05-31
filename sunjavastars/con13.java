class example{
     private int a,b;
           private example(){
               a=10;
               b=20;
             }
            public static example createObject(){
              return new example();
                }
     public void print(){
       System.out.println(a+" "+b);
      }
}
    class con13{
       public static void main(String args[]){
          example ex= example.createObject();
              ex.print();
           example ex1= example.createObject();
              ex1.print();
            example ex2= example.createObject();
              ex2.print();
        example ex3= example.createObject();
              ex3.print();
  System.out.println(ex.hashCode());
System.out.println(ex1.hashCode());
System.out.println(ex2.hashCode());
}
}

