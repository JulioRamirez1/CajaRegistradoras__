package poo_01;

public class POO_01 {

    public static void main(String[] args) {
        
        Persona objPersona = new Persona();
        objPersona.setNombres("Junito Julio");
        objPersona.setApellidos("Gonzales A.");
        objPersona.setEdad(15);
        objPersona.setNombres("Jose");
        
        
        Persona objPersona2 = new Persona("Julio", "R.");
        Persona objPersona3 = new Persona("Juan", "G.", 25, "Enero", "M", 12345678);
        
        System.out.println(objPersona.getNombres() + ", " + objPersona.getApellidos());
        System.out.println(objPersona2);
        System.out.println(objPersona3);

    }

}
