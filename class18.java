class example{
     private int a,b;
        public void read(int x,int y)
        {
            a=x;
            b=y;

        }
        public int add(){
            return a+b;
        }
        public int prod(){
            return a*b;
        }
        public void print(){
            System.out.println(a+" "+b);
        }
}
class class18{
    public static void main(String args[]){
          example ex = new example();
          ex.read(10,20);
         int res= ex.add();
System.out.println("bfoqh" +res);
          ex.prod();
          ex.print();

    }
}