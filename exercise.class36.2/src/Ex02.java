import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Curso curso = new Curso();
        curso.setNome("Sistemas de Informação");
        curso.setHorario("7:30 A 12:30");

        Professor professor = new Professor();
        professor.setNome("Alcides");
        professor.setDepartamento("DSI");
        professor.setEmail("alcidesbonzinho@email.com");

        Aluno[] alunos = new Aluno[5];
        for(int i = 0; i < 5; i ++) {

            Aluno a = new Aluno();
            System.out.println("Digite os dados do " + (i + 1) + "º aluno:");
            System.out.println("Nome:");
            String nome  = scan.nextLine();
            a.setNome(nome);

            System.out.println("Matricula:");
            String matricula = scan.nextLine();
            a.setMatricula(matricula);


            System.out.println("Notas: ");
            double[] notas = new double[4];
            for(int j = 0; j < 4; j++) {
                System.out.println((j + 1) + "º" + "Nota");
                notas[j] = scan.nextDouble();
            }
            scan.nextLine();
            a.setNotas(notas);
            alunos[i] = a;
        }
        curso.setAlunos(alunos);
     }
}
