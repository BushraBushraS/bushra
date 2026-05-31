class string8{
        public static void main(String args[]){
             String s="rama";
             String x="rama";
             String s1="Rama";
             boolean b=s.equals(s1);
             System.out.println("bbot r equal"+b);
             b = s.equalsIgnoreCase(s1);
             System.out.println("both r equal" +b);
            b = s.matches(s1);
            System.out.println("both matches" +b);
            System.out.println(s.hashCode());
            System.out.println(s1.hashCode());
            System.out.println(x.hashCode());
            if(s==x){
              System.out.println("same object ref like hash code");
                   }
              else{
               System.out.println("both r diff");
                  }
     }
}