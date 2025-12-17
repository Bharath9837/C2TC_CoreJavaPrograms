package project;

public class Nestedif {

	public static void main(String[] args) {
		int j = 30;
		int k = 20;
		int l = 10;
		if(j>k) {
			if(j > l) {
				System.out.println("j is Greater");
			}
			else {
				System.out.println("l is Greater");
			}
		}
		else {
			if (k > l) {
				System.out.println("k is Greater");
			}
			else {
				System.out.println("l is Greater");
			}
		}
	}

}
