package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PortalCursosMainProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> cursos = Arrays.asList("A", "B", "C");

		Set<Integer> alunos = new HashSet<>();
		for (String c : cursos) {
			System.out.print("Quantos estudantes para o curso " + c + "?");
			int pNumCursos = sc.nextInt();
			for (int i = 1; i <= pNumCursos; i++) {
				System.out.print("Entre com código do aluno:");
				Integer pCodigoAluno = sc.nextInt();
				alunos.add(pCodigoAluno);
			}
			System.out.println("Total de Estudantes: " + alunos.size());

		}
		sc.close();
	}
}
