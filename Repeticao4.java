import java.util.Scanner;


public class Repeticao4 {
		public static void main(String[] args){
			
		Scanner code = new Scanner(System.in);	
			
		int N=0,maior=0,valor=0;
		
		do{
		System.out.println("Digite um n�mero");
		{while(valor == 0){	
			try{
			 valor = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		if (maior<valor){
			maior=valor;
		}
			N++;
			valor=0;
		}
		}while(N!=15);
		System.out.println("O maior n�mero fornecido foi "+maior);
		
}}
