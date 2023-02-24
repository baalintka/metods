package oraimunka;

import java.util.Random;


public class equlizer {
    
    private static Random rnd = new Random();
    
        public static void main(String[]args){

            equlizer1();



        }

         private static void equlizer1() {
             eq();
             eq(12);
             eq();
             eq(8);
             eq();

         }
         private static void eq(){
             int db = rnd.nextInt(8);
             String szin= "\u001B[45m";
             for (int i = 0; i < db; i++) {
                 System.out.println(szin+"");
             }
             System.out.println("");
         }

         private static void eq(int hossz){
             
             hossz=12;
             String szin= "\u001B[45m";
             for (int i = 0; i < hossz; i++) {
                 System.out.println(szin+"");
             }
         }

     }
