package BasicTTT;

import java.util.ArrayList;

public class Node {
	
	Player player;
	int utilityVal;
	State currState;
	Node parent;
	ArrayList<Node> children;
	
	public Node(){
		parent = new Node();
		children = new ArrayList<Node>();
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getUtilityVal() {
		return utilityVal;
	}

	public void setUtilityVal(int utilityVal) {
		this.utilityVal = utilityVal;
	}

	public State getCurrState() {
		return currState;
	}

	public void setCurrState(State currState) {
		this.currState = currState;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public ArrayList<Node> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Node> children) {
		this.children = children;
	}
	
	public String toString(){
		
		return currState.toString();
	}
	
	
	//utility func
	public int UtilityVal (Player opp){
		
		
		if(player.won == true && opp.won == false){
			return utilityVal = 1;
		}else if(player.won == false && opp.won == true){
			return utilityVal = -1;
			
		}else if(player.won == false && opp.won == false){
			return utilityVal = 0;
		}
		
		return utilityVal;
	}
	
	
	//result func
	
	
	
	//miniMax method
	
	
	
	

}
