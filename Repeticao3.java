import java.util.Scanner;


public class Repeticao3 {
		public static void main(String[] args){
			
		Scanner code = new Scanner(System.in);	
			
		int N=0,soma=0,valor=0;
		
		do{
		System.out.println("Digite um n�mero");
		{while(valor == 0){	
			try{
			 valor = Integer.parseInt(code.nextLine());
			} catch (NumberFormatException e){
				System.out.println("S� n�meros, por favor");
			}}
		soma=soma+valor;
			N++;
			valor=0;
		}
		}while(N!=20);
		System.out.println("A m�dia desses n�meros � igual a "+(soma/20));
		System.out.println("A soma desses n�meros � igual a "+soma);
		
}}
