package StarPatterns;

public class NumberPattern {
	public static void main(String[] args) {
		int n=6;
		for(int i=n-1; i>=0; i--) {
			for(int j=1; j<n-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*(n-i-1); j++) {
				System.out.print(" ");
			}
			for(int k=i+1; k>=1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
