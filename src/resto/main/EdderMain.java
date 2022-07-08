
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
        Mesa m = new Mesa();
        //Consultar si existe una Mesa que si Existe
        
        //System.out.println(md.buscarMesa(1));
        //Consultar una mesa q no Existe
        
        System.out.println(md.buscarMesa(10));
        
        //Crear Mesa
        //Mesa tabla3 = new Mesa(9, 5, true, true);
        //System.out.println(md.crearMesa(tabla3));
        
        //Modificar Mesa
        m.setNumMesa(9);
        m.setCapacidad(2);
        m.setEstado(false);
        m.setActivo(false);
        
        md.borrarMesa(m);
    }
    
}
