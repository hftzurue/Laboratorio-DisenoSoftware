package tec.laboratorio.facade;

public class CineCasaFacade {
    private Luces luces;
    private Pantalla pantalla;
    private Proyector proyector;
    private Sonido sonido;

    public CineCasaFacade(Luces luces, Pantalla pantalla, Proyector proyector, Sonido sonido) {
        this.luces = luces;
        this.pantalla = pantalla;
        this.proyector = proyector;
        this.sonido = sonido;
    }

    public void iniciarPelicula(String nombrePelicula) {
        System.out.println("--- Preparando modo cine en casa... ---");
        luces.encender();
        pantalla.bajar();
        proyector.encender();
        sonido.encender();
        sonido.configurarVolumen(35);
        System.out.println("--- Modo cine listo. ---\n");
    }


    public void finalizarPelicula() {
        System.out.println("--- Apagando el modo cine... ---");
        sonido.apagar();
        proyector.apagar();
        pantalla.subir();
        luces.apagar();
        System.out.println("--- Modo de cine en casa apagado correctamente. ---\n");
    }
}
