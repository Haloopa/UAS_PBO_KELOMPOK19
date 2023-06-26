/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;
/**
 *
 * @author acer
 */
public class ResepTawar {
    public double TepungTerigu = 1000;
    public double Gula = 125;
    public double Butter = 100;
    public double Ragi = 20;
    public double SusuBubuk = 250;
    public double SusuCair = 200;
    public double Telur = 70;
    public double EsBatu = 300;
    public double BeratPcs = 400;
    public double TotalBerat = 2065;
    public double BeratAdonan = 400;

     //Method Roti Per Batch
    public double tawarPerBatch(){
        return this.TotalBerat / this.BeratAdonan;
    }
    //Method Adonan
    public double adonanTepungTerigu() {
        return this.TepungTerigu / this.BeratPcs;
    }
    public double adonanGulaPasir() {
        return this.Gula / this.BeratPcs;
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
