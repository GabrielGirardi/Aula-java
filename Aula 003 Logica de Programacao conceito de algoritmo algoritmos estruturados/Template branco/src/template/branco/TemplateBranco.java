// programa teste hello world
package template.branco;

/**
 *
 * @author gabriel.girardi
 */
public class TemplateBranco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str2 = "Números inteiros somados";
        String str1 = "Hello world";
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = a + b;
        int g = a + c;
        int h = a + d;
     
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(" A + B - 1+2 = " + c); 
        System.out.println(" A + C - 1+3 = " + d);
        System.out.println(" A + D - 1+4 = " + e); 
      
        
    }
    
}
