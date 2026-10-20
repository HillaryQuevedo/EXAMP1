public class PruebaCanalTelemetria
public static void main(String[] args){

    CanalTelemetria canal1 = new CanalTelemetria(1, "temperatura" );
    System.out.println(canal1.obtenerEstadoMedicion());

    System.out.println(canal1.registrarMedicion(45.0));

    System.out.println(canal1.obtenerEstadoMedicion());

    System.out.println(canal1.registrarMedicion(120.0));

    System.out.println(canal1.obtenerEstadoMedicion());

    System.out.println(canal1.registrarMedicion(0.0));

    System.out.println(canal1.obtenerEstadoMedicion());

    System.out.println("canalles creados " + CanalTelemetria.getContadorCanales());
}