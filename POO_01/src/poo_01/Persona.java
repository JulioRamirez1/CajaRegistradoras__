package poo_01;

import java.util.Date;

public class Persona {
    private String nombres;
    private String apellidos;
    private Integer edad;
    private String mesCumple;
    private String genero;
    private Integer dni;
    private Date fechaNacimiento;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getMesCumple() {
        return mesCumple;
    }

    public void setMesCumple(String mesCumple) {
        this.mesCumple = mesCumple;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }    

    public Persona() {
        
    }
        
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    

    public Persona(String nombres, String apellidos, Integer edad, String mesCumple, String genero, Integer dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.mesCumple = mesCumple;
        this.genero = genero;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", mesCumple=" + mesCumple + ", genero=" + genero + ", dni=" + dni + '}';
    }

}
