/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Bakery;

import java.util.Scanner;

/**
 *
 * @author bangu
 */
public class UASPBO {
    //attributes
    private static double ordManisVarian1;
    private static double ordManisVarian2;
    private static double ordManisVarian3;
    private static double ordTawarVarian1;
    private static double ordTawarVarian2;
    private static double ordPizzaVarian1;
    
    private final Scanner scanner = new Scanner(System.in);
    
    // return order value
    public double orderManisVar11(){
        return UASPBO.ordManisVarian1;
    }
    public double orderManisVar12(){
        return UASPBO.ordManisVarian2;
    }
    public double orderManisVar13(){
        return UASPBO.ordManisVarian3;
    }
    public double orderTawarVar1(){
        return UASPBO.ordTawarVarian1;
    }
    public double orderTawarVar2(){
        return UASPBO.ordTawarVarian2;
    }
    public double orderPizzaVar11(){
        return UASPBO.ordPizzaVarian1;
    }
    
    public void input(){
        System.out.println("**********************************************");
        System.out.println("                   ORDERAN                    ");
        System.out.println("**********************************************");
        System.out.println("Roti manis  : ");
        System.out.print("    a. Varian 1 : ");
        ordManisVarian1 = scanner.nextInt();
        System.out.print("    b. Varian 2 : ");
        ordManisVarian2 = scanner.nextInt();
        System.out.print("    c. Varian 3 : ");
        ordManisVarian3 = scanner.nextInt();
        System.out.println("Roti tawar  : ");
        System.out.print("    a. Varian 1 : ");
        ordTawarVarian1 = scanner.nextInt();
        System.out.print("    b. Varian 2 : ");
        ordTawarVarian2 = scanner.nextInt();
        System.out.println("Pizza       : ");
        System.out.print("    a. Varian 1 : ");
        ordPizzaVarian1 = scanner.nextInt();
    }
}
