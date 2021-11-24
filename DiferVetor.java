package vetor;
import java.util.Scanner;
public class DiferVetor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], c[], i, ii;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for(i=0;i<TAM;i++) {
			System.out.println("Insira um número inteiro (Grupo a):");
			a[i] = input.nextInt();
		}
		for(ii=0;ii<1;ii++) {
			for(i=0;i<TAM;i++) {
				System.out.println("Insira um número inteiro (Grupo b):");
				b[ii] = input.nextInt();
				if(a[i]!=b[ii]) {
					c[i] = a[i];
				}
			}
		}
		System.out.print("\nDiferença entre o grupo a e b: ");
		for(i=0;i<TAM;i++) {
			if(c[i]!=0) {
				System.out.print(c[i]+" ");
			}
		}
		input.close();
	}
}