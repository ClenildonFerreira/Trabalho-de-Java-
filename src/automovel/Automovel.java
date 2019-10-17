package automovel;

/**
 *
 * @author Clenildon
 */
public abstract class Automovel {
    
    private String cor;
    private int quantidadeDePeneus;
     

    public Automovel() {
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setQuantidadeDePeneus(int quantidadeDePeneus){
        this.quantidadeDePeneus = quantidadeDePeneus;
    }
    
    public int getQuantidadeDePeneus(){
        return this.quantidadeDePeneus;
    }
    
    
    public void acelerar(){
        
    }
    
    public void exibir(){
        System.out.println("Cor: " + this.getCor());
        System.out.println("Quantidade de Rodas: " + this.getQuantidadeDePeneus());
    }
    
}
