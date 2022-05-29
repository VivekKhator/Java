package pattern;

/*
 
 123
 456
 789
 
 */

public class pattern2 {

	public static void main(String[] args) {
		int counter = 0;
		for(int i=1;i<4;i++) {
			for(int j=1;j<4;j++) {
				counter++;
				System.out.print(counter);
			}
			System.out.println();
		}
	}
}
