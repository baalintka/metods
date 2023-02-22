
package metodusok;


public class Metodusok {

    
    public static void main(String[] args) {
        
        int osszeg=elso10szamOsszege();
        String kimenet = "Az első 10 szám összege:" + osszeg + "\n";
        kiír(kimenet);
        
        int szam1=7, szam2 = 4;
        osszeg = osszead(szam1, szam2);
        kiír("%d + %d = %d\n".formatted(szam1,szam2,osszeg));
        
        
        osszeg=osszead(1,osszead(2, osszead(3,4)));
        kiír("1+2+3+4="+osszeg+"\n");
        
        osszeg=osszead(2, osszead(4, 2));
        kiír();
    }
    
    private static int elso10szamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg+=i;
        }
        return osszeg;
        
    }
    
        private static int osszead(int a, int b){
            return a+b+c+d;
    }

    private static void kiír(String kimenet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
   

