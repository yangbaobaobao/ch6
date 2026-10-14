import java.util.Scanner;

class Gauss {
    public static void main(String[] args) {
		while (true){
		System.out.println(gauss());}
    }
    
    public static double gauss() {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		double x = sc.nextDouble();
		System.out.println("");
		System.out.print("n (int): ");
		int n = sc.nextInt();
		System.out.println("");
		double result = 1;
		double factorial = 1;
        for (int i = 1; i < n; i++) {
			factorial *= i;
			x *= x*x;
			result += ((i%2 == 0) ? 1 : -1) * x / factorial;
		}
        return result;
	}
}
