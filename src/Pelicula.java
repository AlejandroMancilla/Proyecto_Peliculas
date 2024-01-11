public class Pelicula {
    private static int count = 0;
    private int id;
    private String titulo;
    private String director;
    private String genero;
    private double precio;
    private double descuento;
    private boolean alquilada;

    public Pelicula(String titulo, String director, String genero, double precio, double descuento) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.precio = precio;
        this.descuento = descuento;
        this.alquilada = false;
        setid(++count);
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        if (descuento > 0) {
            return precio - (precio * descuento);
        }
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public boolean isAlquilada() {
        return alquilada;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public void setAlquilada(boolean alquilada) {
        this.alquilada = alquilada;
    }

    public String[] Datos() {
        String Dis;
        if(this.alquilada == false){
            Dis = "Sí";
        }else{
            Dis = "No";
        }        
        String [] Datos = {String.valueOf(id), titulo, director, genero, String.valueOf(precio), String.valueOf(descuento), Dis};
        return Datos;
    }
}