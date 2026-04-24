package tec.laboratorio.facade;

public class Luces {
    private boolean encendido;

    public Luces() {
        encendido = true;
    }

    public void encender() {
        encendido = true;
        System.out.println("Luces encendidas.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Luces apagadas.");
    }
}
