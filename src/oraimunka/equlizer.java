package oraimunka;

import java.util.Random;

public class equlizer {

    private static Random rnd = new Random();

    public static void main(String[] args) {

        equlizer1();

    }

    private static void equlizer1() {
        eq();
        eq(8);
        eq();
        eq(12);
        eq();

    }

    private static void eq() {
        int db = rnd.nextInt(8);
        eq(db);
    }

    private static void eq(int hossz) {

        String csillag = "*";
        for (int i = 0; i < hossz; i++) {
            System.out.println(csillag + "");
        }
        System.out.println("");
          
         
    }
    
    }
