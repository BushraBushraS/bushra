class first{
  protected int a;
	public void reada(){
    		a=10;	
       }
	}
    class second extends first{		
    private int b;
         public void readb(){
		b=20;
		}
      public void print(){
   System.out.println(a+" "+b);
}
}
    class third extends first{		
    private int c;
         public void readc(){
		c=30;
		}
      public void print(){
   System.out.println(a+" "+c);
}
}



class inheri5{
   public static void main(String args[]){
   second s = new second();
     s.reada();
      s.readb();
    s.print();
third t = new third();
     t.reada();
      t.readc();
    t.print();
}
}

