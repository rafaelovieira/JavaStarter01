package exercicios.aula2.mini_sistema_notas;

public class Aluno {
    private String nome = "Higor Souza";
    private String matricula = "20281234";
    private Disciplina disciplina = new Disciplina("Java Starter", "20", 8, 7.9);

    public void cadastrarAluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void associarDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDadosAluno() {
        System.out.println("Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);

        if (disciplina != null) {
            System.out.println("\n--- Disciplina Associada ---");
            disciplina.exibirDadosDisciplina();
        } else {
            System.out.println("\nNenhuma disciplina associada.");
        }
    }
}
