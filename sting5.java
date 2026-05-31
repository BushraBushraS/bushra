     class sting5{
           public static void main(String args[]){
          char x[]= {'r','a','m','a','r','a','o'};
            String s1=new String(x);
           System.out.println("THE OBJECT IS "+s1);
           System.out.println("the length is" +s1.length());
           System.out.println("is it empty"+ s1.isEmpty());
           System.out.println("the char is at index1"+ s1.charAt(1));
           System.out.println();
          char y[]=s1.toCharArray();
           for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
            }
           byte b[]={65,66,67,68,69,70};
           String s2= new String(b);
           System.out.println("THE OBJECT IS "+s2);
           System.out.println("the length is" +s2.length());
           System.out.println("is it empty"+ s2.isEmpty());
           System.out.println("the char is at index1"+ s2.charAt(1));
           System.out.println();
           byte bb[]=s2.getBytes();
           for(int i=0;i<bb.length;i++){
           System.out.println(bb[i]+" ");
             }

          
}
}