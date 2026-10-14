import java.util.Scanner;

class Abecedarian {
    public static void main(String[] args) {
		while (true){
		System.out.println(isAbecedarian());}
    }
    
    public static boolean isAbecedarian() {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for (int i = 0; i < word.length()-1; i++) {
			if (word.charAt(i) > word.charAt(i+1))
				return false;
		}
		
        return true;
	}
}
