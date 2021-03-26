import java.util.Scanner;


public class CircleCenter {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in); 
		System.out.println("");
		int height = scan.nextInt();
		System.out.println("");
		int width = scan.nextInt(); 
		var a = new PrintShape(height, width);
		a.PrintShape(); 
		
		scan.close();

	}

	
	}

}