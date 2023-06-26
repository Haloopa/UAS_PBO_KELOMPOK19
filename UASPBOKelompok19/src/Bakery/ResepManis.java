/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

/**
 *
 * @author Safiira Hashifah
 */
public class ResepManis {
    //attributes
    public double TepungTerigu = 1000;
    public double GulaPasir = 150;
    public double Butter = 150;
    public double Ragi = 20;
    public double SusuBubuk = 300;
    public double SusuCair = 250;
    public double Telur = 80;
    public double EsBatu = 400;
    public double BeratPcs = 50;
    public double TotalBerat = 2350;
    public double BeratAdonan = 50;
    
    //methods roti per batch
    public double manisPerBatch(){
        return this.TotalBerat / this.BeratAdonan;
    }

    //methods adonan per pcs
    public double adonanTepungTerigu() {
        return this.TepungTerigu / this.BeratPcs;
    }
    public double adonanGulaPasir() {
        return this.GulaPasir / this.BeratPcs;
    }
    public double adonanButter() {
        return this.Butter / this.BeratPcs;
    }
    public double adonanRagi() {
        return this.Ragi / this.BeratPcs;
    }
    public double adonanSusuBubuk() {
        return this.SusuBubuk / this.BeratPcs;
    }
    public double adonanSusuCair() {
        return this.SusuCair / this.BeratPcs;
    }
    public double adonanTelur() {
        return this.Telur / this.BeratPcs;
    }
    public double adonanEsBatu() {
        return this.EsBatu / this.BeratPcs;
    }
}
