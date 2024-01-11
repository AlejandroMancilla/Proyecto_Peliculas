import java.time.LocalDateTime;
import java.util.ArrayList;

public class Alquiler {
    private int id;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;
    private Cliente cliente;
    private ArrayList<Pelicula> peliculas;
    
    public Alquiler(int id, LocalDateTime fechaAlquiler, Cliente cliente) {
        this.id = id;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaAlquiler.plusDays(3);
        this.cliente = cliente;
        this.peliculas = new ArrayList<Pelicula>();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCliente() {
        return cliente.toString();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void addPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    public void removePelicula(Pelicula pelicula) {
        this.peliculas.remove(pelicula);
    }

    public void showPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    @Override
    public String toString() {
        return "Alquiler [id=" + id + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion
                + ", cliente=" + cliente + ", peliculas=" + peliculas + "]";
    }
}
