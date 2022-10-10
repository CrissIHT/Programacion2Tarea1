package tarea1progra2;

public class Boleta extends DocTributario{
    private String numero, rut, fecha, nombre;
    public Boleta(String numero) {
        super(numero);
    }
    @Override
    public String gettFecha() {
        return super.gettFecha();
    }
    
    @Override
    public String gettNombre() {
        return super.gettNombre();
    }

    @Override
    public String gettNum() {
        return super.gettNum(); 
    }

    @Override
    public String gettRut() {
        return super.gettRut(); 
    }

    @Override
    public String toString() {
        return ("boleta");
    }

    @Override
    public String gettDire() {
        return super.gettDire();
    }

}
