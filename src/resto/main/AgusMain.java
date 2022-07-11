package resto.main;

import java.util.ArrayList;
import resto.dao.*;
import resto.entidades.*;

public class AgusMain {

    public static void main(String[] args) {
        //atributos
        Conexion con = new Conexion();
        MeseroData md = new MeseroData(con);
        
        //creo un mesero
        Mesero m1 = new Mesero("Agustina", "Ojeda", 98343221, 1234567, true);
        
        //agrego el mesero a la bd
        if(md.agregarMesero(m1)){
            System.out.println(m1.getNombre() + " agregada :)");
        } else{
            System.out.println(m1.getNombre() + " no agregada :("); 
        }
        
        //creo mas meseros
        Mesero m2 = new Mesero("Allan", "Chica", 83745621, 9836721, true);
        Mesero m3 = new Mesero("Edder", "Santibanez", 73890173, 2738421, false);
        Mesero m4 = new Mesero("Valentin", "Casas", 90347583, 6728493, false);
        Mesero m5 = new Mesero("Valeria", "Miranda", 89027384, 4582930, true);
        
        //los agrego a la bd
        if(md.agregarMesero(m2)){
            System.out.println(m2.getNombre() + " agregado :)");
        } else{
            System.out.println(m2.getNombre() + " no agregado :("); 
        }
        if(md.agregarMesero(m3)){
            System.out.println(m3.getNombre() + " agregado :)");
        } else{
            System.out.println(m3.getNombre() + " no agregado :("); 
        }
        if(md.agregarMesero(m4)){
            System.out.println(m4.getNombre() + " agregado :)");
        } else{
            System.out.println(m4.getNombre() + " no agregado :("); 
        }
        if(md.agregarMesero(m5)){
            System.out.println(m5.getNombre() + " agregada :)");
        } else{
            System.out.println(m5.getNombre() + " no agregada :("); 
        }
        
        //muestro todos los meseros activos
        System.out.println("\n----- Mostrando meseros... -----\n");
        ArrayList<Mesero> meseros = md.obtenerMeseros();
        
        for(Mesero m : meseros){
            System.out.println(m);
        }
        
        //busco un mesero
        System.out.println("\n----- Buscando mesero... -----\n");
        System.out.println(md.obtenerMesero(1));
        
        //desactivo un mesero
        System.out.println("\n----- Despidiendo mesero... -----\n");
        if(md.desactivarMesero(2)){
            System.out.println( md.obtenerMesero(2).getNombre() + " despedido");
        }
        
        //creo un mesero para modificar uno ya existente
        Mesero m6 = new Mesero(3,"Edder","Santibanez",73890173,2058371,true);
        
        System.out.println("\n----- Modificando mesero... -----\n");
        if(md.modificarMesero(m6)){
            System.out.println("Mesero modificado");
        }
                
        //muestro el mesero modificado
        System.out.println(md.obtenerMesero(3));
                
    }
    
}
