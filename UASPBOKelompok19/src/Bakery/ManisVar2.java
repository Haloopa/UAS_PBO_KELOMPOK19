/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

import Bahan.HargaPerGram;

/**
 *
 * @author Safiira Hashifah
 */
public class ManisVar2 extends ModalManis {
    //attributes
    public double selaiRedBean = 10;
    public double krimVanilla = 5;
    
    //methods
    public double modalManisVar2(){
        return (this.selaiRedBean * HargaPerGram.gramSelaiRedBean()) + (this.krimVanilla * HargaPerGram.gramKrimVanilla()) + this.modalAdonanManis();
    }
    //hitung harga jual varian per pcs
    public double hargaManisVar2(){
        return this.modalManisVar2() * 140/100;
    }
}
