   class string9{
         public static void main(String args[]){
            String s="notepad";
            String s1="Padma";
           boolean res=s.regionMatches(4,s1,0,3);
           System.out.println("case is not ignored"+res);
           res = s.regionMatches(true,4,s1,0,3);
           System.out.println("case is ignored" +res);

                     }
}
           