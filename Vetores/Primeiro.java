import java.util.*;
public class Primeiro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		int i, a[] = new int [TAM];
		double [] b = new double [TAM];
			
		for (i=0;i<TAM;i++) {
			System.out.println("Entre com o " +(i+1)+ "° valor: ");
			a[i] = ler.nextInt();
			}
			System.out.println("VETOR A:");
		for (i=0;i<TAM;i++) {
			System.out.print(a[i]+" ");
			b[i] = Math.sqrt(a[i]);
			}
			System.out.println("\n");
			System.out.println("VETOR B: ");
			for (i=0;i<TAM;i++) {
				System.out.print(b[i]+" ");
		}
	}

}
