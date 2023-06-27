/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

/**
 *
 * @author bangu
 */
public class PrintOutPut {
    private final ManisVar1 manisVar1 = new ManisVar1();
    private final ManisVar2 manisVar2 = new ManisVar2();
    private final ManisVar3 manisVar3 = new ManisVar3();
    private final TawarVar1 tawarVar1 = new TawarVar1();
    private final TawarVar2 tawarVar2 = new TawarVar2();
    private final PizzaVar1 pizzaVar1 = new PizzaVar1();
    private final BahanDibutuhkan diperlukan = new BahanDibutuhkan();
    
    
    public void output(){
        printBahan();
        System.out.println("==============================================");
        System.out.println("Harga roti manis varian 1 per pcs : Rp" + Math.round(manisVar1.hargaManisVar1()));
        System.out.println("Harga roti manis varian 2 per pcs : Rp" + Math.round(manisVar2.hargaManisVar2()));
        System.out.println("Harga roti manis varian 3 per pcs : Rp" + Math.round(manisVar3.hargaManisVar3()));
        System.out.println("Harga roti tawar varian 1 per pcs : Rp" + Math.round(tawarVar1.hargaTawarVar1()));
        System.out.println("Harga roti tawar varian 2 per pcs : Rp" + Math.round(tawarVar2.hargaTawarVar2()));
        System.out.println("Harga roti pizza varian 1 per pcs : Rp" + Math.round(pizzaVar1.hargaPizzaVar1()));
    }
    
    public void printBahan(){
        System.out.println("==============================================");
        System.out.println("Bahan yang diperlukan : ");
        System.out.println("    1. Tepung Terigu     : " + Math.round(diperlukan.tepungTeriguDiperlukan()) + " gram");
        System.out.println("    2. Gula Pasir        : " + Math.round(diperlukan.gulaPasirDiperlukan()) + " gram");
        System.out.println("    3. Butter            : " + Math.round(diperlukan.butterDiperlukan()) + " gram");
        System.out.println("    4. Ragi              : " + Math.round(diperlukan.ragiDiperlukan()) + " gram");
        System.out.println("    5. Susu Bubuk        : " + Math.round(diperlukan.susuBubukDiperlukan()) + " gram");
        System.out.println("    6. Susu Cair         : " + Math.round(diperlukan.susuCairDiperlukan()) + " gram");
        System.out.println("    7. Telur             : " + Math.round(diperlukan.telurDiperlukan()) + " gram");
        System.out.println("    8. Es Batu           : " + Math.round(diperlukan.esBatuDiperlukan()) + " gram");
        System.out.println("    9. Keju              : " + Math.round(diperlukan.kejuDiperlukan()) + " gram");
        System.out.println("    10. Coklat           : " + Math.round(diperlukan.coklatDiperlukan()) + " gram");
        System.out.println("    11. Krim Vanilla     : " + Math.round(diperlukan.krimVanillaDiperlukan()) + " gram");
        System.out.println("    12. Selai Red Bean   : " + Math.round(diperlukan.selaiRedBeanDiperlukan()) + " gram");
        System.out.println("    13. Sosis            : " + Math.round(diperlukan.SosisDiperlukan()) + " gram");
        System.out.println("    14. Smoked Beef      : " + Math.round(diperlukan.smokedBeefDiperlukan()) + " gram");
        System.out.println("    15. Bawang Bombay    : " + Math.round(diperlukan.bawangBombayDiperlukan()) + " gram");
    }
}
