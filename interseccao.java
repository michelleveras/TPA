import java.util.Scanner;
public class interseccao {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int a[], b[], c[], i, j, k;
			final int TAM = 10;
			a = new int [TAM];
			b = new int [TAM];
			c = new int [TAM];
			
			for(i=0;i<TAM;i++) {
				System.out.println("Insira um número do vetor A:");
				a[i] = in.nextInt();
			}
			
			System.out.println(" ");
			
			for(j=0; j<TAM; j++) {
				System.out.println("Insira um número do vetor B:");
				b[j] = in.nextInt();
				
				for(i=0, k=0; i<TAM; i++, k++) {
					
					if(a[i]==b[j]) {
						c[k] = a[i];
					}
				}
			}
			
			System.out.println(" ");
			
			System.out.println("Interseção do grupo A e B: ");
			
			for(k=0; k<TAM; k++) {
				
				if(c[k]!=0) {
					System.out.print(c[k]+" ");
			}
		}
	}
}
