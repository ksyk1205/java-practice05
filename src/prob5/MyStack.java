package prob5;

public class MyStack {
	private int top = -1;
	private String[] buffer;
	
	public MyStack(int i) {
		buffer=new String[i];
		
	}
	public void push(String s) {
		if(buffer.length>top+1) {
			buffer[++top]=s;
		}else {
			String[] buffer2 = new String[buffer.length+1];
			for(int i=0;i<buffer.length;i++) {
				buffer2[i]=buffer[i];
			}
			buffer2[++top]=s;
			buffer=buffer2;
		}
	}

	public boolean isEmpty() {
		return top== -1;
	}
	
	public String pop() throws MyStackException{
		if(!isEmpty()) {	
			return buffer[top--];
		}else {
			throw new MyStackException("stak is empty");
			
		}
	}
}