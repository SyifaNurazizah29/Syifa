package uts;

public class Syifa {
    public static void main(String[] args) {
        String var1 = " ABCDEFGHIJKLMNOPQRSTUVVWZYZ ";
        System.out.println("============================ : ");
        System.out.println("Perkenalkan Nama Saya Adalah : ");
        char [] c = {var1.charAt(19),
           var1.charAt(26), var1.charAt(9), var1.charAt(6), var1.charAt(1), var1.charAt(0),
           var1.charAt(14), var1.charAt(21), var1.charAt(18),
           var1.charAt(1), var1.charAt(27), var1.charAt(9), var1.charAt(27), var1.charAt(1), var1.charAt(8),

        };
        
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        
        System.out.println();
        System.out.println("============================ : ");
    }
}
