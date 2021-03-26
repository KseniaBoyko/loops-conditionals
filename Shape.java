public class Shape{
	private int height;
	private int width;

	public ShapeConstructor(int height, int width) { 
		int height = height; 
		int width = width;
	}
	
	public void PrintShape() { 
		for(int a = -height; a < height; a++) {
		for(int b = -width; b < width; b++) {				
			if(b * b + a * a <= height/2 * width/2) {
				if(a == 0 && b == 0) {
	System.out.print(" ");
		}
		else {
	System.out.print("O");
					
	}else {
		System.out.print("#");
	}
				
	}
			
}
		
	}
	
	public void PrintShape() { 
		shape();
    }

}