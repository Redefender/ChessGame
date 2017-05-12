public class Piece {
    private String color;
    private String symbol;
    public Piece(String color,String symbol)
    {
      this.color = color;
      this.symbol = symbol;
    }
    public boolean movement(){return true;} //takes in coordinates,boolean is able
    public boolean isTaken(){return true;}
    public String getSymbol(){return symbol;}
}