public class Ticket{
    private Producto producto1;
    private Producto producto2;
    private float total;
    private float recibido;
    private float cambio;

    public Ticket(Producto producto1, Producto producto2, float recibido){
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.recibido = recibido;
        this.total = producto1.getPrecio() + producto2.getPrecio();
        this.cambio = this.recibido - this.total;
    }

    public Producto getProducto1(){
        return producto1;
    }

    public void setProducto1(Producto producto1){
        this.producto1 = producto1;
    }

    public Producto getProducto2(){
        return producto2;
    }

    public void setProducto2(Producto producto2){
        this.producto2 = producto2;
    }

    public float getTotal(){
        return total;
    }

    public float getRecibido(){
        return recibido;
    }
    
    public void setRecibido(float recibido){
        this.recibido = recibido;
    }

    public float getCambio(){
        return cambio;
    }
    
    public String toString(){
        String cadena = "Descripcion " + "\n"
        + "-------------------------------------------" + "\n"
        + "-" + producto1.toString() + "\n"
        + "-" + producto2.toString() + "\n"
        + "============================================" + "\n"
        + "Total:" + "                               $" + this.total + "\n"
        + "Recibido:" + "                            $" + this.recibido + "\n"
        + "Cambio:" + "                              $" + this.cambio + "\n"
        + "-------------------------------------------";

        return cadena;
    }
}
