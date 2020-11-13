package br.com.jse.primitives.integer;

public class IntegerTypes {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 1020303432;
        double d = 1.2;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);

        //casting
        i = (int) d;

        System.out.println(i);

        double aa = 0.1;
        double bb = 0.2;

        //resolve 0.1 + 0.2 problem
        float r = (float) ((float) aa+bb);
        System.out.println(r);

        for(int y = 1; y <= 10; y++){
            for(int x = 1; x <= 10; x++){
                int res = y * x;
                if(res == 8 || res == 12){
                    System.out.println("(Números chave -> "+ res + " encontrado. \n)");
                }
                System.out.print(res);
                System.out.print(" ");
            }
            System.out.println();
        }


        for(int line = 0; line < 50; ++line){
            for(int column = 0; column < 50; ++column){
                if(column > line){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
