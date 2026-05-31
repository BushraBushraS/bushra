       class string3{
           public static void main(String args[]){
                 byte b[]={65,66,67,68,69,70};
                    String s = new String(b);
                   System.out.println("The object is " +s);
                   System.out.println("The length is " +s.length());
                   System.out.println("The isempty is " +s.isEmpty());
                   System.out.println("the char at index1 is "+s.charAt(1));
                      String s1 = new String(b,1,4);
                   System.out.println("The object is " +s1);
                   System.out.println("The length is " +s1.length());
                   System.out.println("The isempty is " +s1.isEmpty());
                   System.out.println("the char at index1 is "+s1.charAt(1));
                                              }
    }
                   