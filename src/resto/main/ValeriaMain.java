package resto.main;

import java.util.ArrayList;
import resto.dao.Conexion;
import resto.dao.ProductoData;
import resto.entidades.Producto;

public class ValeriaMain {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        ProductoData pd = new ProductoData(con);
        
        //VERIFICAR SI EXISTE PRODUCTO
//        Producto p = new Producto();
//        p.setNombre("Pizza");
//        System.out.println(pd.existeProducto(p));


        //AGREGAR PRODUCTOS
//        Producto p = new Producto();
        
//        p.setNombre("Tacos"); // verifique con producto existente, y funciona.
//        p.setStock(20);
//        p.setPrecio(450);
//        p.setComestible(true);
//        p.setActivo(true);
//        
//        System.out.println(pd.agregarProducto(p));

        
        //OBTENER UN PRODUCTO
//        Producto p = pd.obtenerProducto(14);//verifique con productos que no existen, y funciona.
//        
//        System.out.println(p.toString());


        //OBTENER LISTA DE LOS PRODUCTOS
//        ArrayList<Producto> listaProductos = pd.obtenerProductos();
//        System.out.println(listaProductos.toString());


        //MODIFICAR UN PRODUCTO
//        Producto p = new Producto();
//        
//        p.setCodigo(14);//verfique con productos que no existen y funciona.
//        p.setNombre("Tacos");
//        p.setStock(100);
//        p.setPrecio(900);
//        p.setComestible(true);
//        p.setActivo(true);
//        
//        System.out.println(pd.modificarProducto(p));


        //DESACTIVAR UN PRODUCTO
//        Producto p = new Producto();
//        System.out.println(pd.desactivarProducto(14));//verifique con producto que no existe y funciona.


        //ELIMINAR UN PRODUCTO
//        Producto p = new Producto();
//        System.out.println(pd.eliminarProducto(14));//verificado con producto que no existe y funciona.
        
    }
    
}
