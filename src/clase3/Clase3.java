package clase3;

import java.util.ArrayList;
import otroPaquete.OtroHijo;

public class Clase3 {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add("Hola");
        
        lista.forEach( (n) -> {
            System.out.println(n + " " + n.getClass().getName());
        });
     
        
        // SOBRECARGA 
        
        Sobrecarga primeraClase = new Sobrecarga();
        System.out.println("Edad(primeraClase): " + primeraClase.edad);
        System.out.println("Nombre(primeraClase): " + primeraClase.nombre);
        
        Sobrecarga segundaClase = new Sobrecarga(40);
        System.out.println("Edad(segundaClase): " + segundaClase.edad);
        System.out.println("Nombre(segundaClase): " + segundaClase.nombre);
        
        Sobrecarga terceraClase = new Sobrecarga(20, "Marcela");
        System.out.println("Edad(terceraClase): " + terceraClase.edad);
        System.out.println("Nombre(terceraClase): " + terceraClase.nombre);  
        
        // OTRA CLASE
        
        OtraClase.saludo();
        
        // Herencia: extends
        
        Hijo hijito = new Hijo();
        System.out.println("Hijo (pertenencia): " + hijito.pertenencia);
        System.out.println("Hijo hereda de padre: " + hijito.herenciaDePadre);
        System.out.println("Hijo hereda de padre que hereda de abuelo: " + hijito.legadoDeAbuelo);
        
        OtroHijo hermano = new OtroHijo();
        System.out.println(hermano.herenciaProtegidaDelPadre);
        
        
    }

}
