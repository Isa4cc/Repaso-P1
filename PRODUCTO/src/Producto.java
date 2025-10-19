public class Producto {
    private String codigoProducto;
    private String nombreProducto;
    private Double precioUnitario;
    private Integer stock;
    private String categoria;

    public Producto() {
    }
    public Producto(String codigoProducto, String nombreProducto, Double precioUnitario, Integer stock, String categoria) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.categoria = categoria;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        if(precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        }else {
            this.precioUnitario = 0.0;
        }
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        if (stock > 0) {
            this.stock = stock;
        }else {
            this.stock = 0;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //calcularValorInventario(): que devuelva el valor total del inventario (precio × cantidad)
    public double calcularValorInventario(){
        return this.precioUnitario * this.stock;
    }

    //hayStock(): que devuelva true si la cantidad es mayor a 0
    public int hayStock(){
        if (stock > 0) {
            return 1;
        }else {
            return 0;
        }
    }

    // vender(int cantidad): que reduzca el stock.
    // Si no hay suficiente stock no debe realizar la venta y debe devolver false.
    public int vender(int cantidad){
        if (stock > 0){
            int reduccionStock = this.stock - cantidad;
            this.setStock(reduccionStock);
            return 1;
        }else {
            return 0;
        }
    }

    //reabastecer(int cantidad): que añada unidades al stock
    public int reabastecerStock(int cantidad){
            if (cantidad <= 0){
                return 0;
            }else {
                int aumentoStock = this.stock + cantidad;
                this.setStock(cantidad);
                return 1;
            }
    }


}
