import java.util.InputMismatchException;
import java.util.Scanner;

public class StarFormation {

	public static void main(String[] args) {
		int rows = 0;
		int z = 0, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		try{
			rows = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.err.println("Please Enter whole numbers only");
		}
		if (rows < 1) {
			System.err.println("Number of rows should be more than 1");
			System.exit(0); // DON'T USE System.exit(0) unnecessarily. if alone is enough as else will not be executed
		} else {
			x = 2 * rows - (rows / 2);
			int flag = rows / 2;
			for (int i = 0; i < rows; i++) {
				if (i < flag) {
					x -= 1;
				} else {
					x -= 2;
				}
				for (int k = x; k > 0; k--) {
					System.out.print(" ");
				}
				if (i >= flag) {
					z += 1;
				}
				for (int j = 0; j <= i + z; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	}

}
