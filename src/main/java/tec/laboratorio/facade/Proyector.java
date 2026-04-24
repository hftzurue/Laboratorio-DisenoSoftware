package tec.laboratorio.facade;

public class Proyector {
    private boolean encendido;

    public void encender() {
        encendido = true;
        System.out.println("Proyector encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Proyector apagado.");
    }
}
