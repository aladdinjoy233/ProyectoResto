package resto.main;

import resto.dao.Conexion;
import resto.dao.MesaData;
import resto.dao.MeseroData;
import resto.entidades.Mesa;
import resto.entidades.Mesero;

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
        MeseroData med = new MeseroData(coneccion);
        //Consultar si existe una Mesa que si Existe

        //System.out.println(md.buscarMesa(1));
        //Consultar una mesa q no Existe
        //System.out.println(md.buscarMesa(10));
        //Crear Mesa
        //Mesero mesero = new Mesero("Allan", "Casas", 123456789, 266412345, true);
        //med.agregarMesero(mesero);
        //Mesa tabla3 = new Mesa(mesero, 5, true, true);
        //System.out.println(md.crearMesa(tabla3));
        //Modificar Mesa
        //m.setNumMesa(1);
        //m.setMesero(med.obtenerMesero(1));
        //m.setCapacidad(2);
        //m.setEstado(false);
        //m.setActivo(true);
        //md.modificarMesa(m);
        //Borrar la Mesa
        //md.borrarMesa(m);
        //Activar una Mesa
        //md.activarMesa(m);
        //Obtener Una Mesa
        System.out.println(md.obtenerMesa(2));
        //listado de mesas
        //System.out.println(md.listadoMesasActivas());
    }

}
