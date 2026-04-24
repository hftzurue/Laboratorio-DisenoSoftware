package tec.laboratorio.prototype;

public abstract class Enemigo implements Cloneable {
    protected String nombre;
    protected boolean texturasCargadas;
    protected boolean sonidoCargado;
    protected boolean iaInicializada;
    protected String color;
    protected  int posX;
    protected  int posY;

    public Enemigo(String nombre, String color, int posX, int posY) {
        this.nombre = nombre;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public abstract Enemigo clonar();

    public void setColor(String color) {
        this.color = color;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
