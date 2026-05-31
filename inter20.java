interface myinter{
            public int wish(int x,int y);
}
 class inter20{
          public static void main(String args[]){

        myinter m=(x,y)->x+y;
         int k=m.wish(20,40);
   System.out.println("The resultis"+k);
       }
}