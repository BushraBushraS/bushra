        class string7{
                public static void main(String args[]){
                  String s="bushra";
                  String s1="Bushra";
                  boolean b=s.equals(s1);
                   System.out.println("both r equal"+b);  
                   b=s.equalsIgnoreCase(s1);
                  System.out.println("both r equal"+b);
                 b=s.matches(s1);
                  System.out.println("both r equal"+b);
}
}