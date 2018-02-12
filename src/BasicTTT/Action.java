package BasicTTT;

public class Action {
	
	
	
	private Player currentPlayer;
	private int loc;
	
	
	public Action(int loc, Player currentPlayer){
		
		this.loc = loc;
		this.currentPlayer = currentPlayer;
		
	}


	public Player getCurrentPlayer() {
		return currentPlayer;
	}


	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}


	public int getLoc() {
		return loc;
	}


	public void setLoc(int loc) {
		this.loc = loc;
	}
	
	
	public String toString(){
		
		return "I am "+currentPlayer+ " and I placed my symbol at spot "+loc;
	}
	
	
	
	

}
