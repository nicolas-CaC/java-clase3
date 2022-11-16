package clase3;

public class Sobrecarga {

    public int edad;
    public String nombre = "Generico";
    
    // SOBRECARGA DE CONSTRUCTORES
    
    public Sobrecarga(int numero){
        this(numero, "Fulano");
    }
    
    public Sobrecarga(){
        edad = 30;
    }
    
    public Sobrecarga (int numero, String nombre){
        this.edad = numero;
        this.nombre = nombre;
        
    }
    
    
}
