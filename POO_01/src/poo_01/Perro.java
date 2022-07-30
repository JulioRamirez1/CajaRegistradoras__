package poo_01;

public class Perro {
    
    // Atributos
    String nombre;
    String colorPelo;
    Integer edad;
    
    public Perro() {
        
    }

    public Perro(String nombre, String colorPelo, Integer edad) {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
        this.edad = edad;
    }   

    public Perro(String nombre, String colorPelo) {
        this.nombre = nombre;
        this.colorPelo = colorPelo;
    }

    public Perro(Integer edad) {
        this.edad = edad;
    }
    
    
    

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", colorPelo=" + colorPelo + ", edad=" + edad + '}';
    }
    
    
    

}
