//Mystery1.java
public class Mystery1
{
   public static void main(String[] args)
   {
      int row = 10;

      while (row >= 1) 
      {
         int column = 1;

         while (column <= 3) 
         {
            System.out.print(row % 2 == 1 ? "<" : ">");
            ++column;
         }

         --row;
         System.out.println();
      } 
   } 
} // end class
