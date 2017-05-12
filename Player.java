import java.util.Scanner;

public class Player
{
	private String	posChosen;
	private String	name;
	private String	color;
   private String pieceType;
	public Player(){}
	public Player(String	name,	String color)
	{
   this.name =	name;
		this.color = color;
	}
	public void	setPos()
	{
		String testPos="";
		Scanner stdin = new Scanner(System.in);
		
		
		//validate same color, in board
		boolean isValidPos=false;
		while(!isValidPos)
		{
			try
			{
			  System.out.print("Enter position: ");
			  testPos =	stdin.nextLine();
			  if(testPos.length() != 2)
			   throw new Exception("Error! Enter only rank and file: ");
				
			  if(!ValidatePiece.testInBoard(testPos))	//must be a-h,	1-8
			  {
			   throw	new Exception("Error! not in board!");
			  } 
			  isValidPos=true;
			}
			catch(Exception e)
			{
				System.out.print(e.getMessage());
				
			}
		}
  
	  
		posChosen =	testPos;
		
	}
   public void checkpieceType(String board[][])
   {
      pieceType = board[this.convertColToIndice()][this.convertRowToIndice()];
      
   }
   public int convertColToIndice() //gets from posChosen
   {
      
      char column = Character.toUpperCase(posChosen.charAt(0));
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
   public int convertRowToIndice()
   {
      int row = Character.getNumericValue(posChosen.charAt(1));
      return row-1;
   }
}