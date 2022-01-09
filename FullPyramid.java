
public class FullPyramid {
	public static void main(String[] args) {
		int f, g,h;
		for (f=1;f <=5 ; f++) {
			for (g=5; g>f; g--) {
				System.out.print(" ");
			}
			for (h=1;h<(2*f) ; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
