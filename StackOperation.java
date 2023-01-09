package logicPros;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class StackOperation {

	public static void main(String args[]) {
	
		List<Integer> stk = new ArrayList<>();
		System.out.println("stack: " + stk);
		
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);
		
		popelmnt(stk);
		popelmnt(stk);
		
		try {
			popelmnt(stk);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

	
	static void pushelmnt(List stk, int x) {
	
		stk.add(new Integer(x));
		System.out.println("push -> " + x);
		
		System.out.println("stack: " + stk);
	}

	
	static void popelmnt(List stk) {
		System.out.print("pop -> ");
	
		Integer x = (Integer) stk.remove(stk.size() - 1);
		System.out.println(x);

		System.out.println("stack: " + stk);
	}
}
