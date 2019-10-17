package automovel;

/**
 *
 * @author Clenildon
 */
public class Moto extends Automovel{
    
    private boolean injecaoEletronica;
    
    
    public void setInjecaoEletronica(boolean injecaoEletronica){
        this.injecaoEletronica = injecaoEletronica;
    }
    
    public boolean isInjecaoEletronica(){
        return this.injecaoEletronica;
    }
   
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Injeção Eletrônica: " + this.isInjecaoEletronica());
    }
}
