package exercicios.aula2.gerenciador_alunos;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Higor Souza", "2023001");
        aluno1.adicionarNotas(8.0, 7.5, 9.0, 6.0);
        aluno1.exibirInformacoesDoAluno();

        Aluno aluno2 = new Aluno("Maria Santana", "2023002");
        aluno2.adicionarNotas(5.5, 6.0, 6.5, 5.0);
        aluno2.exibirInformacoesDoAluno();
    }
}
