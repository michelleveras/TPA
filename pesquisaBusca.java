
import java.util.Scanner;
public class pesquisaBusca {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], b=0, i, j, r=0;
		final int TAM = 10;
		a = new int [TAM];
		
		
		for(i=0;i<TAM;i++) {
			System.out.println("Insira o n�mero:");
			a[i] = in.nextInt();
		}
		
		System.out.println(" ");
		
		
		for(j=0; j<TAM; j++) {
			System.out.println("Insira o n�mero que queira buscar:");
			b = in.nextInt();
			
			
			for(i=0, j=0; i<TAM; i++, j++) {
				if(a[i]==b) {
					r = 1;
				}
			}
		}
		
		System.out.println(" ");
		
		if(r==1) {
			
			System.out.println(""+b+" est� dentro do vetor.");
			
		}else{
			
			System.out.println(""+b+" n�o est� dentro do vetor.");
		}
	}
}