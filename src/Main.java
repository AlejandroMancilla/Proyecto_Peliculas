import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static List<Pelicula> Peliculas = new ArrayList<Pelicula>();
    private static List<Cliente> Clientes = new ArrayList<Cliente>();
    private static List<Alquiler> Alquileres = new ArrayList<Alquiler>();
    
    public static void main(String[] args) throws Exception {
        int Opc = 1;
        while(Opc != 0) {
            MostrarMenu();
            System.out.print("Seleccione una Opción: ");
            Opc = sc.nextInt();
            sc.nextLine();
            System.out.println(Opc);
            switch (Opc) {
                case 1:
                    RegistrarPelicula();
                    break;
                case 2:
                    RegistrarCliente();
                    break;
                case 3:
                    AlquilarPelicula();
                    break;
                case 4:
                    DevoluciónPelicula();
                    break;
                case 5:
                    ListarPeliculas();
                    sc.next();
                    break;
                case 6:
                    ListarClientes();
                    sc.next();
                    break;
                case 7:
                    ModificarPelicula();
                    break;
                case 8:
                    EliminarPelicula();
                    sc.next();
                    break;
                default:
                    System.out.println("Opción no Valida");
                    System.out.println("- Presione cualquier tecla + Enter -");
                    sc.next();
                    break;
            }
        }
    }

    static void MostrarMenu() throws Exception {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("*************** MENU ***************");
        System.out.println("\t1. Registrar Pelicula");
        System.out.println("\t2. Registrar Cliente");
        System.out.println("\t3. Alquiler Pelicula");
        System.out.println("\t4. Devolución Pelicula");
        System.out.println("\t5. Listar Peliculas");
        System.out.println("\t6. Listar Clientes");
        System.out.println("\t7. Modificar Pelicula");
        System.out.println("\t8. Eliminar Pelicula");
        System.out.println("\t9. Salir");
        System.out.println("************************************");
    }

    static void RegistrarPelicula() {
        String Titulo, Director, Genero;
        double Precio, Descuento;
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("--------- REGISTRAR PELICULA ---------");
        System.out.println("Titulo: ");
        Titulo = sc.nextLine();
        System.out.println("Director:");
        Director = sc.nextLine();
        System.out.println("Genero: ");
        Genero = sc.nextLine();
        System.out.println("Precio Alquiler: ");
        Precio = sc.nextDouble();
        System.out.print("Descuento: ");
        Descuento = sc.nextDouble();
        Pelicula P = new Pelicula(Titulo, Director, Genero, Precio, Descuento);
        Peliculas.add(P);
    }

    static void RegistrarCliente() {
        String Nombre, Correo, Celular;
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("--------- REGISTRAR CLIENTE ---------");
        System.out.println("Nombre: ");
        Nombre = sc.nextLine();
        System.out.println("Correo:");
        Correo = sc.nextLine();
        System.out.println("Celular: ");
        Celular = sc.nextLine();
        Cliente C = new Cliente(Nombre, Correo, Celular);
        Clientes.add(C);
    }

    static void AlquilarPelicula() {

    }

    static void DevoluciónPelicula() {

    }

    static void ListarPeliculas() {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println("-".repeat(41) + "LISTADO DE PELICULAS" + "-".repeat(41));
        System.out.printf("|%-5s|%-20s|%-25s|%-10s|%-10s|%-12s|%-12s|\n", "ID", "TITULO", "DIRECTOR", "GENERO", "PRECIO", "DESCUENTO", "DISPONIBLE");
        System.out.println("+" + "-".repeat(5) + "+" + "-".repeat(20) + "+" + "-".repeat(25) +"+" + "-".repeat(10) + "+" + "-".repeat(10) +"+" + "-".repeat(12) +"+" + "-".repeat(12) + "+");        
        for (Pelicula P : Peliculas) {
            String[] Datos = P.Datos();
            System.out.printf("|%5s|%20S|%25S|%10S|%10S|%12S|%12S|\n", Datos[0], Datos[1], Datos[2], Datos[3], Datos[4], Datos[5], Datos[6]);
        }
        System.out.println("+" + "-".repeat(5) + "+" + "-".repeat(20) + "+" + "-".repeat(25) +"+" + "-".repeat(10) + "+" + "-".repeat(10) +"+" + "-".repeat(12) +"+" + "-".repeat(12) + "+");
    }

    static void ListarClientes() {
        System.out.printf("|%-30s|%-20s|%-16s|\n", "NOMBRE CLIENTE", "CORREO", "CELULAR");
        for (Cliente C : Clientes) {
            String [] Datos = C.Datos();
            System.out.printf("|%30S|%20S|%16S|\n", Datos[0], Datos[1], Datos[2]);
        }
    }

    static void ModificarPelicula() {
        ListarPeliculas();
        System.out.print("Digite ID de pelicula a Nodificar: ");
        int Mod = sc.nextInt();
        if(Mod > 0 && Mod <= Peliculas.size()) {
            System.out.print("Ingrese Nuevo Precio: ");
            double NewPrecio = sc.nextDouble();
            
            System.out.println("\tPELICULA MODIFICADA EXITOSAMENTE");
        }else{
            System.out.println("Opción no Valida...");
        }
    }

    static void EliminarPelicula() {
        ListarPeliculas();
        System.out.print("Digite ID de pelicula a eliminar: ");
        int Elim = sc.nextInt();
        if(Elim > 0 && Elim <= Peliculas.size()) {
            Peliculas.remove(Elim-1);
            System.out.println("\tPELICULA ELIMINADA EXITOSAMENTE");
        }else{
            System.out.println("Opción no Valida...");
        }
    }
}
