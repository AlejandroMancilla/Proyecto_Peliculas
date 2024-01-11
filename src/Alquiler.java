import java.time.LocalDate;
import java.util.ArrayList;

public class Alquiler {
    private static int count = 0;
    private int id;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Cliente cliente;
    private Pelicula pelicula;
    
    public Alquiler(LocalDate fechaAlquiler, Cliente cliente, Pelicula pelicula) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaAlquiler.plusDays(3);
        this.cliente = cliente;
        this.pelicula = pelicula;
        setId(++count);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCliente() {
        return cliente.toString();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String[] Datos() {
        String [] Datos = {String.valueOf(id), String.valueOf(fechaAlquiler), String.valueOf(fechaDevolucion), String.valueOf(cliente.getNombre()), String.valueOf(pelicula.getTitulo())};
        return Datos;   
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

}
