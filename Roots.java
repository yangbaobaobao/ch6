import java.util.Scanner;

class squareRoot {
    public static void main(String[] args) {
		while (true){
		System.out.println(squareRoot());}
    }
    
    public static double squareRoot() {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		if (a < 0) return -1;
		double c = a/2.0;
		
        while (Math.abs(a - c * c) > 0.001) {
			c = (c + a/c)/2.0;
        }
        return c;
	}
}
