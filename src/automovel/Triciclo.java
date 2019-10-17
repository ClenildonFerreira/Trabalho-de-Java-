package automovel;

import interfase.ImportavelInterface;

/**
 *
 * @author Clenildon
 */
public class Triciclo extends Automovel implements ImportavelInterface{

    
    @Override
    public boolean isImportado() {        
        return false;
    }
   
    @Override
    public void exibir(){
        super.exibir();
    } 
}
