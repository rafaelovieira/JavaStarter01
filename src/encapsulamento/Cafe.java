package encapsulamento;

public class Cafe {
    private String tipo;
    private double temperatura;

    public Cafe(String tipo, double temperatura) {
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public String getTipo(){
        return tipo;
    }

    public double getTemperatura(){
        return temperatura;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    public void exibirCafe (){
        System.out.println("Tipo: " + tipo + " temperatura: " + temperatura);
    }
}
