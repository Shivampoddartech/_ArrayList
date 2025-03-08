package Day1;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(2020.20);
		al.add("true");
		al.add("False");
		System.out.println(al);
		System.out.println("--------------");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("--------------");
		for (int i = al.size() - 1; i > 0; i--) {
			System.out.println(al.get(i));
		}
		System.out.println("--------------");

		for (Object o : al) {
			System.out.println(o);
		}
	}
}
