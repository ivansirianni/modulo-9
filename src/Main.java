public class Main {
    public static void main(String[] args) {
        //objeto persona
        Persona persona = new Persona();
        persona.setNombre("Iván");
        persona.setEdad(33);
        persona.setCel(11524213);

        //objeto cliente
        Cliente cliente = new Cliente();
        cliente.nombre = "Armando Esteban Quito";
        cliente.edad = 56;
        cliente.cel= 4231415;
        cliente.credito = 550000;

        //objeto trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Rolando Mota";
        trabajador.edad = 45;
        trabajador.cel = 4201200;
        trabajador.salario = 120000;


        //imprime clase persona
        System.out.println("Class persona --> Nombre: "+ persona.getNombre() + ", Edad: " + persona.getEdad() +" años" + ", Contacto: "+ persona.getCel());

        //imprime clase cliente
        System.out.println("Class cliente --> Nombre: "+ cliente.nombre + ", Edad: " + cliente.edad +" años" + ", Contacto: "+ cliente.cel + ", Credito disponible: $"+cliente.credito + " Pesos.-");

        //imprime clase cliente
        System.out.println("Class trabajador --> Nombre: "+ trabajador.nombre + ", Edad: " + trabajador.edad +" años" + ", Contacto: "+ trabajador.cel + ", Salario Neto: $"+trabajador.salario + " Pesos Finales.-");
    }
}
class Persona {
    String nombre;
    int edad;
    int cel;

    //nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    };
    public String getNombre(){
        return this.nombre;
    };


    // edad
    public void setEdad(int edad){
        this.edad = edad;
    };
    public int getEdad(){
        return this.edad;
    };


    //cel
    public void setCel(int cel){
        this.cel = cel;
    };
    public int getCel(){
        return this.cel;
    };
}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona{
    int salario;
}