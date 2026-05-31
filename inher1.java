class student{
       protected int sno,m1,m2,m3,tot;
       String sname;
protected double avg;
   			public void read(){
                        sno=101;
                        m1=63;
                        m2=65;
			m3=66;
			sname="bush";
			}
}
  class marks extends student{
          public int findtot(){
         return m1+m2+m3;
			}
  		public double findavg(){
		return tot/3.0;
			}

      public void print(){
        tot = findtot();
        avg = findavg();
System.out.println(sno+" "+sname+" "+m1+" "+m2+" "+m3);
}
}   class inher1{
        public static void main(String args[]){
   marks m= new marks();
m.read();
m.print();
}
}
                  
			