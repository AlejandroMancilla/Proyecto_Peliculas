import java.time.LocalDateTime;
import java.util.ArrayList;

public class Alquiler {
    private int id;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;
    private Cliente cliente;
    private Pelicula pelicula;
    
    public Alquiler(int id, LocalDateTime fechaAlquiler, Cliente cliente, Pelicula pelicula) {
        this.id = id;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaAlquiler.plusDays(3);
        this.cliente = cliente;
        this.pelicula = pelicula;
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

}
