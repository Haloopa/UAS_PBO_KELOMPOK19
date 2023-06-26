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
public class PizzaVar1 extends ModalPizza {
     //attributes
    public double keju =  30;
    public double sosis = 50;
    public double smokedBeef = 50;
    public double bawangBombay = 30;
    
    //methods
    public double modalPizzaVar1(){
        return ((this.keju * HargaPerGram.gramKeju()) + (this.sosis * HargaPerGram.gramSosis()) + (this.smokedBeef * HargaPerGram.gramSmokedBeef()) + (this.bawangBombay * HargaPerGram.gramBawangBombay()) + this.modalAdonanPizza() );
    }
        //hitung harga jual varian per pcs
    public double hargaPizzaVar1(){
        return this.modalPizzaVar1() * 140/100;
    }
}
