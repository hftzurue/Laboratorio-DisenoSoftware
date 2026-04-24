package tec.laboratorio.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        EnemigoJefe enemigoJefe = new EnemigoJefe("Isshin Ashina", "Blanco", -30, 100 );

        EnemigoJefe clonJefe1 = (EnemigoJefe) enemigoJefe.clonar();
        EnemigoJefe clonJefe2 = (EnemigoJefe) enemigoJefe.clonar();
        EnemigoJefe clonJefe3 = (EnemigoJefe) enemigoJefe.clonar();
        EnemigoJefe clonJefe4 = (EnemigoJefe) enemigoJefe.clonar();
        EnemigoJefe clonJefe5 = (EnemigoJefe) enemigoJefe.clonar();

        clonJefe1.setColor("Rojo");
        clonJefe1.setPosX(145);
        clonJefe1.setPosY(-537);

        System.out.println("\nOriginal:");
        System.out.println(enemigoJefe);

        System.out.println("\nClon modificado:");
        System.out.println(clonJefe1);

        System.out.println("\nOtros clones:");
        System.out.println(clonJefe2);
        System.out.println(clonJefe3);
        System.out.println(clonJefe4);
        System.out.println(clonJefe5);
    }
}