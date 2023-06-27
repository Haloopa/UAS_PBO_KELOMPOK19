/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

import Bahan.HargaPerGram;

/**
 *
 * @author Asus
 */
public class ResepPizza {
    public double TepungTerigu = 1000;
    public double Gula = 100;
    public double Butter = 100;
    public double Ragi = 20;
    public double SusuBubuk = 200;
    public double SusuCair = 180;
    public double Telur = 50;
    public double EsBatu = 300;
    public double BeratPcs = 190;
    public double TotalBerat = 1950;
    public double BeratAdonan = 190;
    
    //Method Roti Per Batch
    public double pizzaPerBatch(){
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


