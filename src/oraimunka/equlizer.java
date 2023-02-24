package oraimunka;

import java.util.Random;


public class equlizer {
    
    private static Random rnd = new Random();
    
   public static void main(String[]args){
       
       equlizer1();
       
       

   }

    private static void equlizer1() {
        eq();
        eq();
        eq();
        eq();
        eq();
        
    }
    private static void eq(){
        int db = rnd.nextInt(3,8);
        String szin= "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.println(szin+"");
        }
        System.out.println("");
    }
    
    
    
}
