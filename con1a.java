  class first{
       protected int a;
             public first(){
                  a=10;
                    }
}
 class second extends first{
       private int b;
            public second(){
                  b=20;
               }
            public void print(){
        System.out.println(a+" "+b);
}
}
    class con1a{
        public static void main(String args[]){
            second s=new second();
                s.print();
			}
} 
                          