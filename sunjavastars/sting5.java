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

}
}