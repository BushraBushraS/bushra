class first{
  protected int a;
	public void reada(){
    		a=10;	
       }
	}
class second extends first{
  protected int b;
	public void readb(){
    		b=20;	
       }
	}

class third extends second{
  private int c;
	public void readc(){
    		c=30;	
       }

      public void print(){
   System.out.println(a+" "+b+" "+c);
}

	}
class inheri4{
   public static void main(String args[]){
   
third t = new third();
     t.reada();
     t.readb();
      t.readc();
    t.print();
}
}