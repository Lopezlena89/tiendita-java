import com.lumava.tienda.modulos.Producto;
import com.lumava.tienda.modulos.Tienda;

public class Principal {

    public static void main(String[] args) {
        Producto papasBlancas = new Producto("Papas blancas",20,"Sabritas",10);
        Tienda valdepeñas = new Tienda("Valdepeñas","Av valdepeñas,zapopan",2,5000);
        System.out.println(papasBlancas.toString());
        System.out.println("*****************************");
        System.out.println(valdepeñas.toString());


    }

}
