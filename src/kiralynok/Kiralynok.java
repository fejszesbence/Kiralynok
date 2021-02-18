package kiralynok;

import java.io.IOException;

public class Kiralynok {
    
    private Tabla tabla;

    public Kiralynok() {
        this.tabla = new Tabla('#');
    }
    
    public static void main(String[] args) throws IOException {
        
        Kiralynok kir = new Kiralynok();
        kir.megoldasok();
        
    }
    
    public void megoldasok() {
        feladat4();
        feladat6();
    }
    
    public void feladat4() {
        System.out.println("4. feladat");
        Tabla tabla = new Tabla('#');
        tabla.megjelenit();
    }
    
    public void feladat6() {
        System.out.println("6. feladat");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
