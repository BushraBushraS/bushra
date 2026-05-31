class example{
   int a[];
        public example(){
         a= new int[5];
        }
  public void print(){
     for(int i=0;i<a.length;i++){
       System.out.println(a[i]+" ");
     }
}
}
    class con4{
public static void main(String args[]){
    example ex= new example();
   ex.print();
}
}