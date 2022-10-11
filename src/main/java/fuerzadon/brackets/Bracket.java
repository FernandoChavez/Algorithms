package fuerzadon.brackets;

public class Bracket {
	
	String message;

	public Bracket(String message) {
		this.message = message;
	}
	
	public boolean isBalanced(String message) {
		
		String openBrackets="({[";
		String closeBrackets=")}]";
		String brackets1="()";
		
		
		int size = message.length();
		
		if((size%2) != 0) {
			return false;
		}
			
		
		
		//Couples brackets
		for(int i=0; i<size; i++) {
			char bracket = message.charAt(i);
			
		}
		
		
		//open brackets - Close brackets
		
		
		//Mix
		
		return true;
	}

}
