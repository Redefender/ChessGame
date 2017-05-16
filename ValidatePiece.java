/* Class validates coordinate in range, assigns piece
*/
public  class  ValidatePiece {

   private Piece testPiece;
   public static boolean inBoard()
   {
      return false;
   }

   public static boolean testInBoard(String positionTested)
   {
      char column = Character.toUpperCase(positionTested.charAt(0)); //get first char convert toUpperCase
      int row = Character.getNumericValue(positionTested.charAt(1));


      //test column
      switch(column)
      {
         case 'A':
         case 'B':
         case 'C':
         case 'D':
         case 'E':
         case 'F':
         case 'G':
         case 'H':
            break;
         default:
            return false;

      }
      //test row
      if(row<1 || row>8)
      {
         return false;
      }
      else
      {
         return true;
      }
   }
   public static int convertRowToIndice(String notation)
   {
      int row = Character.getNumericValue(notation.charAt(1));
      switch(row)
      {
         case 8: return 0;
         case 7: return 1;
         case 6: return 2;
         case 5: return 3;
         case 4: return 4;
         case 3: return 5;
         case 2: return 6;
         case 1: return 7;
      }
      return -99;

   }
   public static int convertColToIndice(String notation) 
   {

      char column = Character.toUpperCase(notation.charAt(0));
      switch(column)
      {
         case 'A': return 0;

         case 'B': return 1;

         case 'C': return 2;

         case 'D': return 3;

         case 'E': return 4;

         case 'F': return 5;

         case 'G': return 6;

         case 'H': return 7;

         default:
            return -99;
      }

   }
   

}
