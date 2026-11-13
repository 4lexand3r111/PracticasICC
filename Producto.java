public class Producto{
    private String nombre;
    private String departamento;
    private float precio;

    public Producto(String nombre, int opcion, float precio){
        setNombre(nombre);
        this.departamento = departamentoT(opcion);
        setPrecio(precio);
    }

    //Metodos auxiliares:

    private String cambioNombre(String nuevoNombre){
    if (nuevoNombre == null || nuevoNombre.equals("") || nuevoNombre.equals(" ")){
        return "Producto desconocido";
        }
        return nuevoNombre;   
    }

    private float cambioPrecio(float precio){
        if (precio <= 0){
            return 100f;
        }
        return precio;
    }

    public void setNombre(String nombre){
        this.nombre = cambioNombre(nombre);
    }

    public String getNombre(){
        return nombre;
    }

    public void setPrecio(float precio){
        this.precio = cambioPrecio(precio);
    }

    public float getPrecio(){
        return precio;
    }

    public String departamentoT(int opcion){
        switch (opcion){
            case 1:
                return "Ropa";
            case 2:
                return "Electronica y tecnologia";
            case 3:
                return "Higiene y cuidado personal";
            case 4:
                return "Alimentos";
            case 5:
                default:
                return "Departamento desconocido";    
        }
    }

    public void setDepartamento(int opcion){
        this.departamento = departamentoT(opcion);
    }

    public String getDepartamento(){
        return departamento;
    }

    public String toString(){
        String cadena = "Producto: " + this.nombre + ", "
        + "Departamento: " + this.departamento + ", "
        + "Precio: $" + this.precio;

        return cadena;
    }

}
