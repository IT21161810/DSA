package Stack;

public class bracektcheck {
	
	private String inputstr;
	
	public bracektcheck(String str) {
		
		inputstr = str;
	}
	
	public void checkB() {
		int size = inputstr.length();
		Array ar = new Array(size);
		

		for(int i=0;i<size;i++) {
			
			if(inputstr.charAt(i) == '(') {//The Java String charAt(int index) method returns the character at the specified index in a string.
				ar.push('(');
			}else if(inputstr.charAt(i) == ')'){
				ar.pop();
			}
		}
		
		if(!ar.isEmpty()) {
			System.out.println("Invalid String");
		}else {
			System.out.println("Valid string");
		}
		  
	}

}
