class example{
     int a[];
         public example(){
           a=new int[5];
 	}
     public example(int k[]){
   	  a=k;
     }
     public void print(){
        for( int i=0;i<a.length;i++){
      System.out.println(a[i]+" ");
       }
        }
}
   class con9{
   public static void main(String args[]){
     example ex= new example();
      ex.print();
   int x[]={10,20,30,40,50};
    example ex1= new example(x);
      ex1.print();
}
}