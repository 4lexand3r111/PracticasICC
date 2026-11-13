public class Cajero{
    public static void main(String[] args){
        //pruebas del punto 1.1.1
        System.out.println("Pruebas de validacion de nombre:");
        Producto cadenaV = new Producto("", 2, 10f);
        Producto conEspacio = new Producto(" ", 4, 100f);
        System.out.println(cadenaV.toString());
        System.out.println(conEspacio.toString() + "\n");
        //pruebas del punto 1.1.2
        System.out.println("Pruebas de validacion de precio:");
        Producto precioNegativo = new Producto("Jamon", 4, -7f);
        Producto precioCero = new Producto("TV", 2, 0f);
        System.out.println(precioNegativo.toString());
        System.out.println(precioCero.toString() + "\n");
        //pruebas del punto 1.1.3
        System.out.println("Pruebas de los 5 casos del switch:");
        Producto productoS1 = new Producto("Camisa", 1, 249.99f);
        Producto productoS2 = new Producto("Laptop", 2, 14999.99f);
        Producto productoS3 = new Producto("Cepillo de dientes", 3, 29.99f);
        Producto productoS4 = new Producto("Platano", 4, 21.5f);
        Producto productoS5 = new Producto("tigre de bengala", 5, 29999.99f);
        System.out.println(productoS1.toString());
        System.out.println(productoS2.toString());
        System.out.println(productoS3.toString());
        System.out.println(productoS4.toString());
        System.out.println(productoS5.toString());
    }
}
       