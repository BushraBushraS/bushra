class example
{
    byte b;
    short s;
    int i;
    long l;
    float x;
    double y;
    char ch;
    boolean bb;
              public void print(){
		System.out.println(b+" "+s+" "+i+" "+l+" "+x+" "+y+" "+ch+" "+bb);
				}
}
    class con1{
        public static void main(String args[]){
      	example ex=new example();
	ex.print();
}
}