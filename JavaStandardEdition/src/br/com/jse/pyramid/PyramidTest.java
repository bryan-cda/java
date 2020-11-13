package br.com.jse.pyramid;

public class PyramidTest {
    public static void main(String[] args) {
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
