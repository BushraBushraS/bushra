   class example{
  public void sum(){
		System.out.println("The sum is"+0);
      }
       public void sum(int x){
		System.out.println("The sum is"+x);
      }
  public void sum(int x,int y){
		System.out.println("The sum is"+(x+y));
      }
  public void sum(int x,int y,int z){
		System.out.println("The sum is"+(x+y+z));
      }
}
    class methov2{

      public static void main(String args[]){
      example ex= new example();
       ex.sum();
        ex.sum(10);
      	ex.sum(10,20);
 	ex.sum(10,20,30);
	
}}