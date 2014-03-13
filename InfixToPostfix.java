
public class InfixToPostfix {

	//static int number;
	static int length;
	static String equation;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equation = "r+m-t";
//		length = equation.length();
		char[] infix = equation.toCharArray();
		
		
		symbolToNumber(infix);
//		System.out.println(infix[0]);
//		System.out.println(infix[1]);
//		System.out.println(infix[2]);
//		System.out.println(infix.length);
//		String printChars = new String(infix);
//		System.out.println(printChars);
		// invokes an new instance of Stack(). 
		Stack myStack = Stack.EMPTY;
	
	}

	public static char[] symbolToNumber(char[] infix) {
		for (int i=0; i<equation.length(); i++) {
			System.out.print(infix[i]);
			
			if (infix[i] == '(' ) {
				infix[i] = '0';
			}
			else if (infix[i] == ')' ){
				infix[i] = '1';
			}
			else if (infix[i] == '+'){
				infix[i] = '2';
			}
			else if (infix[i] == '-'){
				infix[i] = '3';
			}
			else if (infix[i] == '*'){
				infix[i] = '4';
			}
			else if (infix[i] == '/'){
				infix[i] = '5';
			}
			else if (infix[i] == '$'){
				infix[i] = '6';
			}
			System.out.println(infix[i]);
		}
//		System.out.println(new String(infix).indexOf[i]);
		System.out.println();
		String printChars = new String(infix);
		System.out.println(printChars);
	
		return infix;
	}

}
