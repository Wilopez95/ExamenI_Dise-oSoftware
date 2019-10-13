package Factura;

public class Extra {
    private String Nombre;
    private String Descripcion;
    private int Precio;

    public Extra (String nombre , String descripcion,int precio){
        this.Nombre  = nombre;
        this.Descripcion = descripcion;
        this.Precio = precio;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
}
