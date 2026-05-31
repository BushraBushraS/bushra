class example{
	private int a,b;
	   public example(int x,int y){
                  a=x;
		  b=y;
           }

        public example(){
         

         }


	public void read(){
         a=1000;
         b= 2000;
         }
        public void print(){
       System.out.println(a+" "+b);
        }
}

class con7{
   public static void main(String args[]){
     example ex = new example(10,20);
      ex.print();
     example ex1= new example();
       ex.read();
       ex.print();
}
}              