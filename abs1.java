abstract class first{
   protected int a;
        public abstract void read();
           public void print(){
		System.out.println("I am ding");
             }
}
       class second extends first{
         private int b;
              public void read()
                {
                  a=10;

                  b=20;
                 }
            public void print(){
        System.out.println(a+" "+b);
    }
}
class abs1{
      public static void main(String args[]){
             second s=new second();
            s.read();
             s.print();
}
}
                    
