package padaria;

public class MaquinaDeBolo {

    public Bolo fabricarBolo(int tamanho, String sabor,  double preco, String formato){
        Bolo bolo = new Bolo(sabor, tamanho, preco);
        System.out.println("Bolo do sabor " + bolo.sabor + " construido.");
        return bolo;
    }
}
