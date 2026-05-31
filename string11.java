   class string11{
          public static void main(String args[]){
              String s="bush bush bush bush";
               int x=s.indexOf('u');
              System.out.println("the result is "+x);   
             x=s.indexOf('u',5);
             System.out.println("we found u after 5th indexat index "+x);   
               x=s.indexOf('u',5,10); 
                 System.out.println("we found u between 5th and 10th index at position  "+x);  
             x=s.lastIndexOf('h');
               System.out.println("we found h at last index is "+x); 
             x=s.lastIndexOf('h',5);
            System.out.println("we first go to index5 and look backward where is h now his at index  "+x); 
            x=s.indexOf("bush");
            System.out.println("the index of bush  "+x);
            x=s.lastIndexOf("bush");
             System.out.println("the last index of bush  "+x);
                      x=s.indexOf("bush",5);
                         System.out.println("the index ofbush after 5 index is"+x);
            
            
            
         
}
}              