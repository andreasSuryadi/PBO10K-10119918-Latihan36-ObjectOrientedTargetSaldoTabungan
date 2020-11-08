/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan36targetsaldotabungan;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitngan saldo tabungan hingga 
 * mencapai target
 *
 */

public class PBO10K10119918Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        
        tabungan.saldoAwal = 3500000;
        tabungan.bungaPerBulan = 8;
        tabungan.saldoTarget = 6000000;
        tabungan.targetSaldoTabungan();
    }
    
}
