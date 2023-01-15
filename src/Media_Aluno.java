
public class Media_Aluno {

	public static void main(String[] args) {

		
		// notas do aluno
		
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0;
		
		// peso das notas
		
		double p1 = 3;
		double p2 = 2;
		double p3 = 5;
		
		// parcial 
		
		double ps1 = nota1 * p1;
		double ps2 = nota2 * p2;
		double ps3 = nota3 * p3;
		
		// média
		
		double media = (ps1 + ps2 + ps3) / (p1 + p2 + p3) ;
		
		
		System.out.println("Média = " + media);
		

	}

}
