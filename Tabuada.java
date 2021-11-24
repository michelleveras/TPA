import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], result, j ;
		a= new int[5];
		
		
		for(j=0; j<5; j++) {
			System.out.println("Digite o numero");
			a[j] = in.nextInt();
			//calculando a tabuada de a[j]
			for (int i=1; i<=10; i++) {
				result = a[j]*i;
				System.out.println(a[j]+"x"+i+"= "+result);
			}
		}
		
		
   }

}