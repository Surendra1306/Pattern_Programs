package StarPatterns;

public class NumberPattern2 {
	public static void main(String[] args) {
		int n=6;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2*(n-i-1); j++) {
				System.out.print(" ");
			}
			for(int k=i+1; k>=1; k--) {
				System.out.print(k+" ");
			}
			for(int k=2; k<=i+1; k++) {
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}

}
