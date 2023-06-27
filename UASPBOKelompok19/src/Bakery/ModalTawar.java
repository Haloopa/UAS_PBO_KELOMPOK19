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
public class ModalTawar extends ResepTawar {
    public double modalAdonanTawar(){
        return (this.adonanTepungTerigu() * HargaPerGram.gramTepungTerigu() + (this.adonanGulaPasir()* HargaPerGram.gramGulaPasir()) + (this.adonanButter() * HargaPerGram.gramButter()) + (this.adonanRagi()) * HargaPerGram.gramRagi()) + (this.adonanSusuBubuk() * HargaPerGram.gramSusuBubuk()) + (this.adonanSusuCair() * HargaPerGram.gramSusuCair()) + (this.adonanTelur() * HargaPerGram.gramTelur()) + (this.adonanEsBatu() * HargaPerGram.gramEsBatu());
    }
}
