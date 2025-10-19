import java.util.Scanner;

/*Cree una clase llamada Producto que una tienda en línea podría utilizar.
Un Producto debe incluir: código de producto (tipo String), nombre (tipo String),
precio unitario (tipo double), cantidad en stock (tipo int) y categoría (tipo String).
Su clase debe tener un constructor que inicialice las cinco variables de instancia.
Proporcione un método establecer y un método obtener para cada variable de instancia.
Si el precio no es positivo, debe establecerse en 0.0. Si la cantidad en stock es negativa,
debe establecerse en 0.
Proporcione métodos para:

calcularValorInventario(): que devuelva el valor total del inventario (precio × cantidad)
hayStock(): que devuelva true si la cantidad es mayor a 0
vender(int cantidad): que reduzca el stock. Si no hay suficiente stock,
no debe realizar la venta y debe devolver false.
reabastecer(int cantidad): que añada unidades al stock

Escriba una aplicación de prueba llamada PruebaProducto que demuestre todas las capacidades de la clase.*/
public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        Scanner sc = new Scanner(System.in);

        int opci;
        do {
            System.out.println("=====SISTEMA DE GESTIÓN DE INVENTARIOS=====");
            System.out.println("Menú de opciones:");
            System.out.println("1. Ingreso de libros.");
            System.out.println("2. Calcular inventario.");
            System.out.println("3. Evaluar cantidad de stock.");
            System.out.println("4. Vender(Reducción de stock).");
            System.out.println("5. Reabastecer stock.");
            System.out.println("6. Salir.");
            System.out.print(">> ");
            opci = sc.nextInt();

            switch (opci){
                case 1:
                    sc.nextLine(); //clean buffer
                    System.out.print("Ingrese el nombre del libro: ");
                    String titulo = sc.nextLine();
                    prod1.setNombreProducto(titulo);

                    System.out.print("Ingrese el código del libro: ");
                    String codigo = sc.nextLine();
                    prod1.setCodigoProducto(codigo);

                    System.out.print("Ingrese la categoría del libro: ");
                    String categoria = sc.nextLine();
                    prod1.setCategoria(categoria);

                    System.out.print("Ingrese el stock del libro: ");
                    int stock = sc.nextInt();
                    prod1.setStock(stock);
                    sc.nextLine();

                    System.out.print("Ingrese el precio unitario del libro: ");
                    double precio = sc.nextDouble();
                    prod1.setPrecioUnitario(precio);
                    sc.nextLine();

                    break;
                case 2:
                    //Calculo de inventarios
                    System.out.println("===Cálculo del inventario===");
                    System.out.println("Stock: " + prod1.getStock());
                    System.out.println("Precio Unitario: " + prod1.getPrecioUnitario());
                    System.out.println("Valor total del inventario: " + prod1.calcularValorInventario());
                    break;
                case 3:
                    //hay stock?
                    int verificador = prod1.hayStock();
                    if (verificador == 1){
                        System.out.println("Estado de stock: TRUE");
                    }else {
                        System.out.println("Estado de stock: FALSE");
                    }
                    break;
                case 4:
                    //vender
                    System.out.print("Ingrese la cantidad a vender: ");
                    int cantidadVenta = sc.nextInt();
                    int verificar = prod1.vender(cantidadVenta);
                    if (verificar == 1){
                        System.out.println("Estado de la venta: TRUE");
                    }else {
                        System.out.println("Estado de la venta: FALSE");
                    }
                    break;
                case 5:
                    //Reabastecer
                    System.out.print("Ingrese la cantidad a agregar a inventario: ");
                    int cantidadAgregada = sc.nextInt();
                    int verificarAumento = prod1.reabastecerStock(cantidadAgregada);
                    if (verificarAumento == 1){
                        System.out.println("Estado del aumento de stock: TRUE");
                    }else {
                        System.out.println("Estado del aumento del stock: FALSE");
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar el sistema, vuelva pronto!!");
                    break;

                default:
                    System.out.println("Opción invalida, intente de nuevo.");
                    break;
            }
        }while (opci != 6);

    }
}