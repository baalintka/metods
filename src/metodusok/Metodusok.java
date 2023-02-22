
package metodusok;


public class Metodusok {

    
    public static void main(String[] args) {
        
        szamolas();
    }

    private static void szamolas() {
        int osszeg=elso10szamOsszege();
        String kimenet = "Az első 10 szám összege:" + osszeg + "\n";
        kiír(kimenet);
        osszeg=osszead(1,osszead(2, osszead(3,4)));
        kiír("1+2+3+4="+osszeg+"\n");
        int a=3, b=3, c=2;
        osszeg=osszead(a,b);
        osszeg=osszead(osszeg,c);
         String s = "%d+%d+%d gyöke:".formatted(a.b.c);
        double gyok = Math.sqrt(osszeg);
        kimenet=String.format("%s %.4f\n",s, gyok);
        kiír(kimenet);
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
   

