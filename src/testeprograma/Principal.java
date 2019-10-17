package testeprograma;

import automovel.Moto;
import automovel.Triciclo;

/**
 *
 * @author Clenildon
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.setCor("Azul");
        moto.setQuantidadeDePeneus(2);
        moto.setInjecaoEletronica(true);
        moto.exibir();
        moto.acelerar(); //Teria que implementa alguma logica para mostra alguma coisa mas fiquei com preguiça ksksksk//
        
        System.out.println("==============================");
        
        Triciclo triciclo = new Triciclo();
        triciclo.setCor("Branco");
        triciclo.setQuantidadeDePeneus(3);
        triciclo.exibir();
        triciclo.acelerar();//Teria que implementa alguma logica para mostra alguma coisa mas fiquei com preguiça ksksksk//
        
        
        
    }
    
}
