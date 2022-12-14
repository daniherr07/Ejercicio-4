public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.edad = 20;
        cliente.nombre = "Fernando";
        cliente.telefono = 12345678;
        cliente.credito = 300;

        System.out.println(cliente.edad + " " + cliente.nombre + " " + cliente.telefono + " " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 32;
        trabajador.nombre = "Fulano";
        trabajador.telefono = 88888888;
        trabajador.salario = 150;

        System.out.println(trabajador.edad + " " + trabajador.nombre + " " + trabajador.telefono + " " + trabajador.salario);


    }
}

class Persona{
    public int edad;
    public String nombre;
    public int telefono;
}

class Cliente extends Persona{
    public int credito;
}

class Trabajador extends Persona{
    public int salario;
}
