package tec.laboratorio.facade;

public class Sonido {
    private boolean encendido;
    private int volumen;

    public void encender() {
        encendido = true;
        System.out.println("Sistema de sonido encendido.");
    }

    public void configurarVolumen(int volumen) {
        if (encendido) {
            this.volumen = volumen;
            System.out.println("Volumen configurado en " + this.volumen + ".");
        }
    }

    public void apagar() {
        encendido = false;
        volumen = 0;
        System.out.println("Sistema de sonido apagado.");
    }
}
