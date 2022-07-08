
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
        Mesa tabla1 = new Mesa(1, 4, true, true);
        System.out.println(md.existeMesa(tabla1));
        //Consultar una mesa q no Existe
        Mesa tabla2 = new Mesa(10, 4, true, true);
        System.out.println(md.existeMesa(tabla2));
        
        //Crear Mesa
        Mesa tabla3 = new Mesa(6, 5, true, true);
        System.out.println(md.crearMesa(tabla3));
        System.out.println("La mesa existe" + md.existeMesa(tabla3));
    }
    
}
