package task1;
public class CreateNamedloop {
    
   public static void main(String args[]) {
     
      first: // The label for the first loop 
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j< 3; j++){
               if(i == 1){
                  continue first; // continue the first loop after skiping the statement if i=1
               }      
               System.out.print(" [i = " + i + ", j = " + j + "] ");
            }
         }
     
         System.out.println();

      second: // The label for the second loop
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j< 3; j++){
               if(i == 1){
                  break second; //Breaks out of the second loop
               }
 
               System.out.print(" [i = " + i + ", j = " + j + "] ");
            }
         }
   }
}

