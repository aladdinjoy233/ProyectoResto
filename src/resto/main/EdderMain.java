
package resto.main;

import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.entidades.Mesa;

/**
 *
 * @author edder
 */
public class EdderMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion coneccion = new Conexion();
        MesaData md = new MesaData(coneccion);
        //Consultar si existe una Mesa que si Existe
        
        System.out.println(md.buscarMesa(1));
        //Consultar una mesa q no Existe
        
        System.out.println(md.buscarMesa(10));
        
        //Crear Mesa
        Mesa tabla3 = new Mesa(8, 5, true, true);
        System.out.println(md.crearMesa(tabla3));
        //System.out.println("La mesa existe" + md.existeMesa(tabla3));
    }
    
}
