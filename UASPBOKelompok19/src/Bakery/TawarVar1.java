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
public class TawarVar1 extends ModalTawar {
    //Attribut
    public double coklat = 80;
    
    
    //methods
    public double modalTawarVar1(){
        return (this.coklat * HargaPerGram.gramCoklat()) + this.modalAdonanTawar();
    }
    //hitung harga jual varian per pcs
    public double hargaTawarVar1(){
        return this.modalTawarVar1()* 140/100;
    }
    
}
