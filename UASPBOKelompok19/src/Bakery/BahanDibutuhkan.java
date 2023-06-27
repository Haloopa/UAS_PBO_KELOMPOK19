/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

/**
 *
 * @author bangu
 */
public class BahanDibutuhkan {
    private final UASPBO order = new UASPBO();
    private final ResepManis bahanManis = new ResepManis();
    private final ResepTawar bahanTawar = new ResepTawar();
    private final ResepPizza bahanPizza = new ResepPizza();
    private final ManisVar1 bahanManisVar1 = new ManisVar1();
    private final ManisVar2 bahanManisVar2 = new ManisVar2();
    private final ManisVar3 bahanManisVar3 = new ManisVar3();
    private final TawarVar1 bahanTawarVar1 = new TawarVar1();
    private final TawarVar2 bahanTawarVar2 = new TawarVar2();
    private final PizzaVar1 bahanPizzaVar1 = new PizzaVar1();

    // method Menghitung Total Batch Pesanan Setiap Roti
    public double totalBatchManis(){
        return (order.orderManisVar11() + order.orderManisVar12() + order.orderManisVar13()) / bahanManis.manisPerBatch();
    }
    public double totalBatchTawar(){
        return (order.orderTawarVar1() + order.orderTawarVar2() / bahanTawar.tawarPerBatch());
    }
    public double totalBatchPizza(){
        return (order.orderPizzaVar11() / bahanPizza.pizzaPerBatch());
    }
    
    // method Menghitung Bahan-Bahan Yang Diperlukan
    public double tepungTeriguDiperlukan(){
        return (bahanManis.TepungTerigu * this.totalBatchManis()) + (bahanTawar.TepungTerigu * this.totalBatchTawar() + (bahanPizza.TepungTerigu * this.totalBatchPizza()));
    }
    public double gulaPasirDiperlukan(){
        return (bahanManis.GulaPasir * this.totalBatchManis()) + (bahanTawar.Gula * this.totalBatchTawar() + (bahanPizza.Gula * this.totalBatchPizza()));
    }
    public double butterDiperlukan(){
        return (bahanManis.Butter * this.totalBatchManis()) + (bahanTawar.Butter * this.totalBatchTawar() + (bahanPizza.Butter * this.totalBatchPizza()));
    }
    public double ragiDiperlukan(){
        return (bahanManis.Ragi * this.totalBatchManis()) + (bahanTawar.Ragi * this.totalBatchTawar() + (bahanPizza.Ragi * this.totalBatchPizza()));
    }
    public double susuBubukDiperlukan(){
        return (bahanManis.SusuBubuk * this.totalBatchManis()) + (bahanTawar.SusuBubuk * this.totalBatchTawar() + (bahanPizza.SusuBubuk * this.totalBatchPizza()));
    }
    public double susuCairDiperlukan(){
        return (bahanManis.SusuCair * this.totalBatchManis()) + (bahanTawar.SusuCair * this.totalBatchTawar() + (bahanPizza.SusuCair * this.totalBatchPizza()));
    }
    public double telurDiperlukan(){
        return (bahanManis.Telur * this.totalBatchManis()) + (bahanTawar.Telur * this.totalBatchTawar() + (bahanPizza.Telur * this.totalBatchPizza()));
    }
    public double esBatuDiperlukan(){
        return (bahanManis.EsBatu * this.totalBatchManis()) + (bahanTawar.EsBatu * this.totalBatchTawar() + (bahanPizza.EsBatu * this.totalBatchPizza()));
    }
    public double kejuDiperlukan(){
        return ((bahanManisVar1.keju * order.orderManisVar11()) + (bahanManisVar3.keju * order.orderManisVar13()) + (bahanTawarVar2.keju * order.orderTawarVar2()) + (bahanPizzaVar1.keju * order.orderPizzaVar11()));
    }
    public double coklatDiperlukan(){
        return ((bahanManisVar1.coklat * order.orderManisVar11()) + (bahanTawarVar1.coklat * order.orderTawarVar1()));
    }
    public double krimVanillaDiperlukan(){
        return (bahanManisVar2.krimVanilla * order.orderManisVar12());
    }
    public double selaiRedBeanDiperlukan(){
        return (bahanManisVar2.selaiRedBean * order.orderManisVar12());
    }
    public double SosisDiperlukan(){
        return ((bahanManisVar3.sosis * order.orderManisVar13()) + (bahanPizzaVar1.sosis * order.orderPizzaVar11()));
    }
    public double smokedBeefDiperlukan(){
        return (bahanPizzaVar1.smokedBeef) * order.orderPizzaVar11();
    }
    public double bawangBombayDiperlukan(){
        return (bahanPizzaVar1.bawangBombay) * order.orderPizzaVar11();
    }
}
