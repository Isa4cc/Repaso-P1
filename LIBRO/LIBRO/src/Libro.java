public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private Double precio;
    private Integer nroPaginas;

    public Libro() {
    }
    public Libro(String ISBN, String titulo, String autor, Double precio, Integer nroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.nroPaginas = nroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        if(precio<0){
            this.precio = 0.0;
        } else{
            this.precio=precio;
        }
    }

    public Integer getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(Integer nroPaginas) {
        if(nroPaginas >= 0){
            this.nroPaginas = nroPaginas;
        }else{
            this.nroPaginas = 0;
        }
    }

    public double aplicarDescuento(double porcentaje){
        if (porcentaje>0 && porcentaje <= 100){
            return this.precio * (porcentaje/100);
        }else{
            return 0;
        }
    }
}
