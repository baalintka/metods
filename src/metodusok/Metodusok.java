
package metodusok;


public class Metodusok {

    
    public static void main(String[] args) {
        
        int osszeg=elso10szamOsszege();
        String kimenet = "Az első 10 szám összege:" + osszeg + "\n";
        kiír(kimenet);
        
        int szam1=7, szam2 = 4;
        osszeg = osszead(szam1, szam2);
        kiír("%d + %d = %d\n".formatted(szam1,szam2,osszeg));
        
        int mszam1=2;
        int mszam2=2;
        int mszam3=3;
        int mszam4=4;
        osszeg4szamnak=osszead(mszam1, mszam2,mszam3,mszam4);
        kiír(t"%d + %d + %d +%d = %d\n");
    }
    
    private static int elso10szamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg+=i;
        }
        return osszeg;
        
    }
    
        private static int osszead(int a, int b, int c, int d){
            return a+b+c+d;
    }

    private static void kiír(String kimenet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
   

