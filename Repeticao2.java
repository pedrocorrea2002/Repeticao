import java.util.Scanner;


public class Repeticao2 {
		public static void main(String[] args){
			
		Scanner code = new Scanner(System.in);	
			
		int N=0,valor=0;
		
		System.out.println("Digite um número");
		{while(N == 0){	
			try{
			 N = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("Só números, por favor");
			}}
		
			do{valor++;
			System.out.println(valor);
			}while(valor!=N);
		}
}}
