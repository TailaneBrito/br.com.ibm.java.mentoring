import java.util.Scanner;

public class Turma {

	public String mediaTurma(int alunos, int turmas){
		System.out.println("num total de alunos : " + alunos);
		System.out.println("num total de turmas : " + turmas);
		double media = alunos / turmas;
		return ""+ (media);
	}
	
	public static void main(String[] args) {
		Turma m = new Turma();
		Scanner l = new Scanner(System.in);
		
		int alunos=0, turma=0, totAlunos=0;
		
		do{
		
				
		System.out.println("Digite o numero de alunos na turma " + turma + " [0=SAI]");
		alunos = l.nextInt();
		
		if(alunos != 0){
			turma++;
		}
		
		while(alunos > 40){
			System.out.println("n�mero de alunos por turma inv�lido!");
			System.out.println("Digite o numero de alunos na turma " + turma + " [0=SAI]");
			alunos = l.nextInt();
			
		}
		
		totAlunos += alunos;
				
		}while(alunos != 0);
		
		
		System.out.println("O numero m�dio de alunos por turma � : " + (m.mediaTurma(totAlunos, turma)));
		l.close();
	}
}
