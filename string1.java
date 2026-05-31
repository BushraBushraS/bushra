class string1{
    public static void main(String args[]){
       String s=new String();
           System.out.println("THE OBJECT IS "+s);
           System.out.println("the length is" +s.length());
           System.out.println("is it empty"+ s.isEmpty());
           
           
           System.out.println();
              char x[]= {'r','a','m','a','r','a','o'};
            String s1=new String(x);
           System.out.println("THE OBJECT IS "+s1);
           System.out.println("the length is" +s1.length());
           System.out.println("is it empty"+ s1.isEmpty());
           System.out.println("the char is at index1"+ s1.charAt(1));
           System.out.println();
             
            
           String s2=new String(x,1,4);
           System.out.println("THE OBJECT IS "+s2);
           System.out.println("the length is" +s2.length());
           System.out.println("is it empty"+ s2.isEmpty());
           System.out.println("the char is at index1"+ s2.charAt(1));
           System.out.println();
           
            String s3=new String(x);
           System.out.println("THE OBJECT IS "+s3);
           System.out.println("the length is" +s3.length());
           System.out.println("is it empty"+ s3.isEmpty());
           System.out.println("the char is at index1"+ s3.charAt(1));
           System.out.println();

           
}
}
      