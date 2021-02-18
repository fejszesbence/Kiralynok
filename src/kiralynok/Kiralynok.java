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
        System.out.println("4. feladat: üres tábla megjelenítése");
        Tabla tabla = new Tabla('#');
        tabla.megjelenit();
    }
    
    public void feladat6() {
        System.out.println("6. feladat: feltöltött tábla");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
    public void feladat9() {
        System.out.println("9. feladat: üres sorok és oszlopok száma");
        System.out.println("sorok: " + tabla.uresSorokSzama());
        System.out.println("oszlopok: " + tabla.uresOszlopokSzama());
    }
    
}
