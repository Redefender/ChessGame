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

}
