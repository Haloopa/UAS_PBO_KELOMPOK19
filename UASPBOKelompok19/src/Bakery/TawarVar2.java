/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bakery;

import Bahan.HargaPerGram;

/**
 *
 * @author acer
 */
public class TawarVar2 extends ModalTawar {
    //Attribut
    public double keju = 80;
    
    
    //methods
    public double modalTawarVar2(){
        return (this.keju * HargaPerGram.gramKeju()) + this.modalAdonanTawar();
    } 
    
    //hitung harga jual varian per pcs
    public double hargaTawarVar2(){
        return this.modalTawarVar2() * 140/100;
    }
}
