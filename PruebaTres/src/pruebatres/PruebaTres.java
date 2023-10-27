/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebatres;

import Clases.LProductos;
import Pantalla.GestorCatalago;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class PruebaTres {

    /**
     * @param args the command line arguments
     */
    public static List<LProductos> catalagosistema;

    public static List<String> GeneDisponible = new ArrayList<>();
    public static List<String> TipoDisponible = new ArrayList<>();
     public static List<String> MarcaDisponible = new ArrayList<>();
    public static void main(String[] args) {
        // TODO code application logic here
        catalagosistema = new ArrayList<>();
        GestorCatalago llamar = new GestorCatalago();
        llamar.setLocationRelativeTo(null);
        llamar.setVisible(true);
        GeneDisponible.add("Hombre");
        GeneDisponible.add("Mujer");
        TipoDisponible.add("Jeans");
        TipoDisponible.add("Camisa");
        TipoDisponible.add("Polo");
        MarcaDisponible.add("NIKE");
        MarcaDisponible.add("LA COSTE");
        MarcaDisponible.add("ADIDAS");
        MarcaDisponible.add("LOIS BOTON");
    }
    
}
