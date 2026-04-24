package tec.laboratorio.facade;

public class MainFacade {
    public static void main(String[] args) {
        Luces luces = new Luces();
        Pantalla pantalla = new Pantalla();
        Proyector proyector = new Proyector();
        Sonido sonido = new Sonido();
        CineCasaFacade cine = new CineCasaFacade(luces, pantalla, proyector, sonido);

        cine.iniciarPelicula("Interestelar");
        cine.finalizarPelicula();
    }
}
