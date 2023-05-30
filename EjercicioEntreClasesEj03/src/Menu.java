import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Vehiculo vehiculo = new Vehiculo();
    private static Cliente cliente = new Cliente();
    private static Cuotas cuota = new Cuotas();
    private static Poliza poliza =new Poliza();

    public class menu {

    }

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú ===");
            System.out.println("1. Gestión Integral de clientes");
            System.out.println("2. Gestión de vehículos");
            System.out.println("3. Gestión de Pólizas");
            System.out.println("4. Gestión de cuotas");
            System.out.println("5  Mostrar Todo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionIntegralClientes();
                    break;
                case 2:
                    gestionVehiculos();
                    break;
                case 3:
                    gestionPolizas();
                    break;
                case 4:
                    gestionCuotas();
                    break;
                case 5:
                    mostrartodo();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void gestionIntegralClientes() {
        System.out.println("Has seleccionado Gestión Integral de clientes.");
        // Aquí puedes agregar la lógica correspondiente para esta opción del menú
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setApellido("Perez");
        cliente.setDni("12345678");
        cliente.setMail("juan.perez@example.com");
        cliente.setDomicilio("Calle 123");
        cliente.setTelefono("1234567890");
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        vehiculo.setAno(2022);
        vehiculo.setNumMotor("123456789");
        vehiculo.setChasis("987654321");
        vehiculo.setColor("Rojo");
        vehiculo.setTipo("Sedán");
        vehiculo.toString();
        cliente.setVehiculos(vehiculo);
        vehiculo.setCliente(cliente);


        cliente.setVehiculos(vehiculo);
        System.out.println("Has seleccionado Gestión de Pólizas.");
        // Aquí puedes agregar la lógica correspondiente para esta opción del menú

        // Definir las fechas de inicio y fin de la póliza
        Date fechaInicio = new Date(); // Fecha actual
        Date finPoliza = new Date(); // Fecha actual

        // Definir el número de póliza
        int numPoliza = 123;

        // Definir la cantidad de cuotas
        String cantCuotas = "12";

        // Definir las formas de pago
        String[] formaDePago = {"Efectivo", "Transferencia"};

        // Definir el monto total asegurado
        double montoTotalAsegurado = 50000.00;

        // Definir si incluye cobertura por granizo
        boolean incluyeGranizo = true;

        // Definir el monto máximo asegurado
        double montoMaximoAsegurado = 100000.00;

        // Definir el monto máximo por granizo
        double montoMaximoGranizo = 20000.00;

        // Definir el tipo de cobertura
        String[] tipoCobertura = {"Total", "Contra Terceros"};

        // Agregar la información al objeto Póliza
        Poliza poliza = new Poliza();
        poliza.setVehiculo(vehiculo.getVehiculo());
        poliza.setCliente(cliente.getCliente());
        poliza.setFechaInicio(fechaInicio);
        poliza.setFinPoliza(finPoliza);
        poliza.setNumPoliza(numPoliza);
        poliza.setCantCoutas(cantCuotas);
        poliza.setFormaDePago(Arrays.toString(formaDePago));
        poliza.setMontoTotalAsegurado(montoTotalAsegurado);
        poliza.setIncluyeGranizo(incluyeGranizo);
        poliza.setMontoMaximoAsegurado(montoMaximoAsegurado);
        poliza.setMontoMaximoGranizo(montoMaximoGranizo);
        poliza.setTipocobertura(tipoCobertura);
        cliente.setPoliza(poliza);
        poliza.toString();

        // Aquí puedes agregar la lógica correspondiente para esta opción del menú
        Cuotas cuota = new Cuotas();
        cuota.setNunDeCuota(1);
        cuota.setMontoTotalCuota(100.00);
        cuota.setPagada(false);
        cuota.setFechaVencimiento(new Date()); // Fecha actual
        cuota.setFormaDePago("Efectivo");
        cliente.setCuotas(cuota);
        cuota.toString();



        System.out.println(vehiculo.toString());

    }

    public static void gestionVehiculos() {
        System.out.println("Has seleccionado Gestión de vehículos.");
        // Aquí puedes agregar la lógica correspondiente para esta opción del menú
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca("Toyota");
        vehiculo.setModelo("Corolla");
        vehiculo.setAno(2022);
        vehiculo.setNumMotor("123456789");
        vehiculo.setChasis("987654321");
        vehiculo.setColor("Rojo");
        vehiculo.setTipo("Sedán");
        vehiculo.toString();
    }

    public static void gestionPolizas() {
        System.out.println("Has seleccionado Gestión de Pólizas.");
        // Aquí puedes agregar la lógica correspondiente para esta opción del menú

        // Definir las fechas de inicio y fin de la póliza
        Date fechaInicio = new Date(); // Fecha actual
        Date finPoliza = new Date(); // Fecha actual

        // Definir el número de póliza
        int numPoliza = 123;

        // Definir la cantidad de cuotas
        String cantCuotas = "12";

        // Definir las formas de pago
        String[] formaDePago = {"Efectivo", "Transferencia"};

        // Definir el monto total asegurado
        double montoTotalAsegurado = 50000.00;

        // Definir si incluye cobertura por granizo
        boolean incluyeGranizo = true;

        // Definir el monto máximo asegurado
        double montoMaximoAsegurado = 100000.00;

        // Definir el monto máximo por granizo
        double montoMaximoGranizo = 20000.00;

        // Definir el tipo de cobertura
        String[] tipoCobertura = {"Total", "Contra Terceros"};

        // Agregar la información al objeto Póliza
        Poliza poliza = new Poliza();
        poliza.setVehiculo(vehiculo.getVehiculo());
        poliza.setCliente(cliente.getCliente());
        poliza.setFechaInicio(fechaInicio);
        poliza.setFinPoliza(finPoliza);
        poliza.setNumPoliza(numPoliza);
        poliza.setCantCoutas(cantCuotas);
        poliza.setFormaDePago(Arrays.toString(formaDePago));
        poliza.setMontoTotalAsegurado(montoTotalAsegurado);
        poliza.setIncluyeGranizo(incluyeGranizo);
        poliza.setMontoMaximoAsegurado(montoMaximoAsegurado);
        poliza.setMontoMaximoGranizo(montoMaximoGranizo);
        poliza.setTipocobertura(tipoCobertura);

        poliza.toString();

    }

    public static void gestionCuotas() {
        System.out.println("Has seleccionado Gestión de cuotas.");
        // Aquí puedes agregar la lógica correspondiente para esta opción del menú
        Cuotas cuota = new Cuotas();
        cuota.setNunDeCuota(1);
        cuota.setMontoTotalCuota(100.00);
        cuota.setPagada(false);
        cuota.setFechaVencimiento(new Date()); // Fecha actual
        cuota.setFormaDePago("Efectivo");
        cuota.toString();


        poliza.toString();
    }

    public void mostrartodo(){
        cliente.toString();

        System.out.println("----------------------");
        System.out.println("----------------------");
        vehiculo.toString();
        vehiculo.mostarVehiculo();
        System.out.println("----------------------");
        System.out.println("----------------------");

        poliza.toString();
    }

}

