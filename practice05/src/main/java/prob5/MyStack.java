package prob5;

public class MyStack {
	
	int num=0;
	String[] stack;
	public MyStack(int i) {
		stack=new String[i];
	}

	public void push(String string) {
		if(num<5) {
			stack[num++]=string;			
		}
	}

	public boolean isEmpty() {
		if(num >= 1) {
			return false;
		}else {
			return true;
		}
	}

	public String pop() throws MyStackException {
		if(num>0) {
			return stack[--num];
		}else {
			throw new MyStackException("stack is empty");
		}
		
	}
}