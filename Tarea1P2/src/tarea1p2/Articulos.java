package tarea1progra2;

public class Articulo {
    private int cantidad;
    private float peso;
    private float precio;
    private String nombre;
    private String descripcion;
    public Articulo(String nombre, String descripcion, float precio, float peso){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.peso=peso;
        this.precio=precio;
    }
    public String gettNombre(){
        return nombre;
    }
    public String toString(){
        return descripcion;
    }
    public float gettPeso(){
        return peso;
    }
    public float gettPrecioSI(){
        return precio*cantidad;
    }
    public float gettPrecioCI(){
        return ((precio*19/100f)+(precio))*cantidad;
    }
    public float gettIva(){
        return (precio*19/100f)*cantidad;
    }
    public void setCant(int cant){
        this.cantidad=cant;
    }
    public int settCant(){
        return cantidad;
    }
}
