package vectorsAndStacks;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(12);  // push(e)
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();  // pop() -> e
		
		System.out.println(popped);
		
        int peeked = stack.peek();  // peek() -> e
		
		System.out.println(peeked);
		
//		Vector<Integer> v = new Vector<>();
//		
//		v.add(12);
//		v.add(0);
//		
//		System.out.println(v);

	}

}
