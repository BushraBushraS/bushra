   class example{
       public void sum(int x,int y){
		System.out.println("The sum is"+(x+y));
      }
  public void sum(double x,int y){
		System.out.println("The sum is"+(x+y));
      }
  public void sum(int x,double y){
		System.out.println("The sum is"+(x+y));
      }
  public void sum(double x,double y){
		System.out.println("The sum is"+(x+y));
      }
}
    class methov1{

      public static void main(String args[]){
      example ex= new example();
        ex.sum(10,20);
      	ex.sum(10.0,20);
 	ex.sum(10,20.0);
	ex.sum(10.0,20.0);
}}

 