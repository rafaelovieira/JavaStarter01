package sorvete;

public class MaquinaDeSorvete {
    public Sorvete fabricarSorvete(String sabor, int tamanho, double preco, String fabricante, boolean estoque){
        return new Sorvete(sabor, preco, tamanho, fabricante, estoque);
    }
}
