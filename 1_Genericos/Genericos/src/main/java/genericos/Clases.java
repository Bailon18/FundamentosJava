package genericos;

public class Clases<K, T, Y, U> {

    private K objectoK;
    private T objectoT;
    private Y objectoY;
    private U objectoU;

    public Clases(K objectoK, T objectoT, Y objectoY, U objectoU) {
        this.objectoK = objectoK;
        this.objectoT = objectoT;
        this.objectoY = objectoY;
        this.objectoU = objectoU;
    }


    public void mostrarTipo() {
        System.out.println("Tipo K: " + this.objectoK.getClass().getName());
        System.out.println("Tipo T: " + this.objectoT.getClass().getName());
        System.out.println("Tipo Y: " + this.objectoY.getClass().getName());
        System.out.println("Tipo U: " + this.objectoU.getClass().getName());
    }
}
