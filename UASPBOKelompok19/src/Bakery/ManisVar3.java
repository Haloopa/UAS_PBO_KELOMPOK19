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
public class ManisVar3 extends ModalManis {
    //attributes
    public double keju = 10;
    public double sosis = 10;
    
    //methods
    public double modalManisVar3(){
        return (this.keju * HargaPerGram.gramKeju()) + (this.sosis * HargaPerGram.gramSosis()) + this.modalAdonanManis();
    }
    //hitung harga jual varian per pcs
    public double hargaManisVar3(){
        return this.modalManisVar3() * 140/100;
    }
}
