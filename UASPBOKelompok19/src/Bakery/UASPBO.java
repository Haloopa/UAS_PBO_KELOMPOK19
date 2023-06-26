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
    private double ordManisVarian1;
    private double ordManisVarian2;
    private double ordManisVarian3;
    private double ordTawarVarian1;
    private double ordTawarVarian2;
    private double ordPizzaVarian1;
    
    private Scanner scanner = new Scanner(System.in);
    private ManisVar1 manisVar1 = new ManisVar1();
    private ManisVar2 manisVar2 = new ManisVar2();
    private ManisVar3 manisVar3 = new ManisVar3();
    private TawarVar1 tawarVar1 = new TawarVar1();
    private TawarVar2 tawarVar2 = new TawarVar2();
    private PizzaVar1 pizzaVar1 = new PizzaVar1();
    private BahanDibutuhkan diperlukan = new BahanDibutuhkan();
    
    // return order value
    public double orderManisVar11(){
        return this.ordManisVarian1;
    }
    public double orderManisVar12(){
        return this.ordManisVarian2;
    }
    public double orderManisVar13(){
        return this.ordManisVarian3;
    }
    public double orderTawarVar1(){
        return this.ordTawarVarian1;
    }
    public double orderTawarVar2(){
        return this.ordTawarVarian2;
    }
    public double orderPizzaVar11(){
        return this.ordPizzaVarian1;
    }
        
    public void input(){
        System.out.println("**********\nORDERAN\n**********");
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
        
        output();
    }
    
    public void output(){
        printBahan();
        System.out.println("==============================================");
        System.out.println("Harga roti manis varian 1 per pcs : " + manisVar1.hargaManisVar1());
        System.out.println("Harga roti manis varian 2 per pcs : " + manisVar2.hargaManisVar2());
        System.out.println("Harga roti manis varian 3 per pcs : " + manisVar3.hargaManisVar3());
        System.out.println("Harga roti tawar varian 1 per pcs : " + tawarVar1.hargaTawarVar1());
        System.out.println("Harga roti tawar varian 2 per pcs : " + tawarVar2.hargaTawarVar2());
        System.out.println("Harga roti pizza varian 1 per pcs : " + pizzaVar1.hargaPizzaVar1());
    }
    
    public void printBahan(){
        System.out.println("==============================================");
        System.out.println("Bahan yang diperlukan : ");
        System.out.println("    1. Tepung Terigu     : " + diperlukan.tepungTeriguDiperlukan() + "gram");
        System.out.println("    2. Gula Pasir        : " + diperlukan.gulaPasirDiperlukan() + "gram");
        System.out.println("    3. Butter            : " + diperlukan.butterDiperlukan() + "gram");
        System.out.println("    4. Ragi              : " + diperlukan.ragiDiperlukan() + "gram");
        System.out.println("    5. Susu Bubuk        : " + diperlukan.susuBubukDiperlukan() + "gram");
        System.out.println("    6. Susu Cair         : " + diperlukan.susuCairDiperlukan() + "gram");
        System.out.println("    7. Telur             : " + diperlukan.telurDiperlukan() + "gram");
        System.out.println("    8. Es Batu           : " + diperlukan.esBatuDiperlukan() + "gram");
        System.out.println("    9. Keju              : " + diperlukan.kejuDiperlukan() + "gram");
        System.out.println("    10. Coklat           : " + diperlukan.coklatDiperlukan()+ "gram");
        System.out.println("    11. Krim Vanilla     : " + diperlukan.krimVanillaDiperlukan() + "gram");
        System.out.println("    12. Selai Red Bean   : " + diperlukan.selaiRedBeanDiperlukan() + "gram");
        System.out.println("    13. Sosis            : " + diperlukan.SosisDiperlukan() + "gram");
        System.out.println("    14. Smoked Beef      : " + diperlukan.smokedBeefDiperlukan() + "gram");
        System.out.println("    15. Bawang Bombay    : " + diperlukan.bawangBombayDiperlukan() + "gram");
    }
    public static void main(String[] args) {
        UASPBO order = new UASPBO();
        order.input();
    }
}
