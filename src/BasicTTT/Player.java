package BasicTTT;

public class Player {
	
	
	
	private String symbol;
	boolean won = false;

	public Player(String symbol){
		this.symbol = symbol;
		
	}
	
	
	public boolean getWon() {
		return won;
	}


	public void setWon(boolean won) {
		this.won = won;
	}


	public String getSymbol(){
		return this.symbol;
	}
	
	public void setSymbol(String symbol){
		this.symbol = symbol;
	}
	
	public String toString(){
		return "My symbol is "+symbol; 
	}
	
	

}
