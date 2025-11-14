package exercicios.aula2.mini_sistema_notas;

public class Disciplina {
    private String nome;
    private String codigo;
    private double nota1;
    private double nota2;

    public Disciplina() {
    }

    public Disciplina(String nome, String codigo, double nota1, double nota2) {
        this.nome = nome;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void cadastrarDisciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public void cadastrarNotas(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirDadosDisciplina() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
}
