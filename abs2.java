abstract class first{
        protected int a,b,c;
             public void read(){
                 a=5000;
                 b=5;
                 c=5;
                }
               public abstract void action();
}
   class big extends first{
            public void action(){
               System.out.println(((a>b)&&(a>c))?"a is big":(b>c)?"b is big":"c is big");
                  }
            }
     class sum extends first{
               public void action(){
                 System.out.println("the sum is"+(a+b+c));
                           }}   
      class simple extends first{
            public void action(){
              System.out.println("the simple interst is"+(a*b*c)/100);
                       }
}
   class abs2{
            public static void main(String args[]){
                                       simple s= new simple();
                           
                         s.read();
                         s.action();
                    sum ss=new sum();
                        ss.read();
                        ss.action();
                         
}
} 