  class string6{
      public static void main(String args[]){
         char x[]={'r','a','m','a','r','a','o'};
        String s= new String(x);
        char y[]= new char[4];
        s.getChars(1,5,y,0);
            for(int i=0;i<y.length;i++)
             {
            System.out.println(y[i]+" ");
              }
         byte b[]={65,66,67,68,69,70};
       String s1=new String(b);
      byte bb[] = new byte[4];
      s1.getBytes(1,5,bb,0);
      for(int i=0;i<bb.length;i++){
        System.out.println(bb[i]+" ");
      }
             
}

}