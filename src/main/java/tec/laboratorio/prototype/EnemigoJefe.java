package tec.laboratorio.prototype;

public class EnemigoJefe extends Enemigo {
    public EnemigoJefe(String nombre, String color, int posX, int posY) {
        super(nombre, color, posX, posY);
        System.out.println("--- Creando un enemigo jefe ---");

        System.out.println("Cargando texturas...");
        this.texturasCargadas = true;
        System.out.println("Texturas cargadas.");

        System.out.println("Cargando sonido...");
        this.sonidoCargado = true;
        System.out.println("Sonido cargado.");

        System.out.println("Inicializando IA compleja...");
        this.iaInicializada = true;
        System.out.println("IA inicializada.");

        System.out.println("--- Enemigo Jefe creado exitosamente ---");
    }

    public EnemigoJefe(EnemigoJefe enemigoJefe) {
        super(enemigoJefe.nombre, enemigoJefe.color, enemigoJefe.posX, enemigoJefe.posY);
        this.texturasCargadas = enemigoJefe.texturasCargadas;
        this.sonidoCargado = enemigoJefe.sonidoCargado;
        this.iaInicializada = enemigoJefe.iaInicializada;
    }

    @Override
    public Enemigo clonar() {
        return new EnemigoJefe(this);
    }

    @Override
    public String toString() {
        return "EnemigoJefe: {" +
                "nombre = '" + nombre + '\'' +
                ", color = '" + color + '\'' +
                ", posX = " + posX +
                ", posY = " + posY +
                ", texturasCargadas = " + texturasCargadas +
                ", sonidoCargado = " + sonidoCargado +
                ", iaInicializada = " + iaInicializada +
                "}";
    }
}
