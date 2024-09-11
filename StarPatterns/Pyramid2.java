package StarPatterns;

public class Pyramid2 {
	public static void main(String[] args) {
		int n=6;
		
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------");
		
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<2*i+1;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
