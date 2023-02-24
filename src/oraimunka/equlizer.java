package oraimunka;

import java.util.Random;

public class equlizer {

    private static Random rnd = new Random();

    public static void main(String[] args) {

        equlizer1();

    }

    private static void equlizer1() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq(false);

    }

    private static void eq() {
       
        eq(false);
    }

    private static void eq(int db) {
        eq(db, false);
        

    }

    private static void eq(boolean ertekLatszik) {
        int db = rnd.nextInt(7-3+1)+3;
        eq(db, ertekLatszik);

    }

    private static void eq(int db, boolean ertekLatszik) {
        
        String csillag = "*";
        for (int i = 0; i < db; i++) {
            System.out.print(csillag + "");
        
        }
        if (ertekLatszik){
            System.out.print(" "+"(" + db + ")");
        }
        System.out.println("");
    }
}
