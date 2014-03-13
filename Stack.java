
public class Stack {
	
	private StackElement data;
	private Stack pointer;
	
	

	public StackElement getData() {
		return data;
	}

	public void setData(StackElement data) {
		this.data = data;
	}

	public Stack getPointer() {
		return pointer;
	}

	public void setPointer(Stack pointer) {
		this.pointer = pointer;
	}

	

	public final static Stack EMPTY = new Stack();
	
	private Stack() {
		this.data = null;
		this.pointer = this;
	}
	
	public boolean isEmpty() {
		return this == Stack.EMPTY;
	}
	
	public void Push (StackElement nextItem, Stack myStack) {
	}
	
	public StackElement Pop(Stack myStack){
		return data;
	}
}
