package Day1;

import java.util.ArrayList;

public class Run {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(20.20);
		a.add("True");
		a.add("False");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("-------------");
		for (int i = a.size() - 1; i > 0; i--) {
			System.out.println(a.get(i));
		}
		System.out.println("-------------");
		for (Object o : a) {
			System.out.println(o);
		}
	}
}
