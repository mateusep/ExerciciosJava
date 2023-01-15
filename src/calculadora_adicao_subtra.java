import java.util.Scanner;
public class calculadora_adicao_subtra {

			public static void main(String[] args) {
				
				// CALCULADORA DE ADIÇÃO E SUBTRAÇÃO
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Digite um operador");
				System.out.println("+ ou -");
				String E = scanner.next();
				
				if (E.equals("+")) {
					System.out.println("Digite um num");
					double s1 = scanner.nextDouble();
					System.out.println("Digite outro num");
					double s2 = scanner.nextDouble();
					double ts = s1 + s2;
					System.out.println("total = " + ts);
					
				} else if (E.equals("-")) {
					System.out.println("digite um num");
					double sb1 = scanner.nextDouble();
					System.out.println("digite outro num");
					double sb2 = scanner.nextDouble();
					double sbt = sb1 + sb2;
					System.out.println("total =" + sbt);
				} else 
					System.out.println("Opção invalida");
				
				
				scanner.close();
				
				
				
				
				
	}

}
