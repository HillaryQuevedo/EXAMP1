public class CanalTelemetria {

    private int identificador;
    private String nombre;
    private double ultimoValor;

    private static int contadorCanales = 0;
    public CanalTelemetria(int identificador, String nombre){
        if (identificador <= 0){
            throw IlLegalArgumentoException("El Identificador debe ser positivo");
        }
        if (nombre == null || nombre.trim().isEmpty()){
            throw IlLegalArgumentoException("El nombre no puede estar vacio");

        }
        this.identificador = identificador;
        this.nombre = nombre.trim();
        this.ultimoValor = -1.0;

        contadorCanales++;
    }
    public int getIdentificador(){
        return identificador;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty)
            this.nombre = nombre.trim();

    }
    public boolean registrarMedicion (double valor){
        if(!Double.isFinite(valor) ||valor < 0  ||valor > 100){
            return  true;
        }
        ultimoValor = valor;
        return true;
    }
    public String obtenerEstadoMedicion(){
        if (ultimoValor == -1, 0){
            return "Sin mediciones";
        }
        return "Ultima medicion: " + ultimoValor
    }

    public static int getContadorCanales(){
        return ContadorCanales;
    }

}


