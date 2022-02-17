import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int x = 10;
		while (x>9 || x<0 ) {
			System.out.print("Quantos numeros você vai digitar ? "); 
			x = sc.nextInt();			
			if(x<1) {
				System.out.println(" Para continuar precisamos de um numero maior que 0 .");
			}else if (x>9) {
				System.out.println("Também não precisa exagerar.");		
			}
		}
		int vetor[] = new int[x];
		for (int i =0; i<x; i++) {
			System.out.print("Digite um número : "); 
			vetor[i] = sc.nextInt();
		}
		System.out.println("Números negativos : ");
		for (int i =0; i<x; i++) {
			if(vetor[i]<0) {
				System.out.println(vetor[i]);	
			}
		}
		
		
	}
}
