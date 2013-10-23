
public class Stack {

	private int[] nAray;
	private int tos=-1;
	
	public Stack(int size){
		nAray=new int[size];
		//tos=-1;
	}
public boolean isEmpty(){
	return (tos==-1);
}
public boolean isFull(){
	return (tos==nAray.length-1);
}
public void push(int  c){
	tos++;
	nAray[tos]=c;
	
}
public int pop(){
	int i=nAray[tos];
	tos--;
	return i;
}
}
