/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktek;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ujicetak {
    private static  Scanner input = new Scanner(System.in);
    public static void main(String[] sandy)
    {
        String nama;
         int harga,jumlah,total,bayar;
        Cetak cetak = new Cetak();
        
         System.out.println("===========================================");
   System.out.println("= PROGRAM PERCETAKAN DENGAN ENCAPSULATION =");
   System.out.println("===========================================");
        
        System.out.print(" Masukkan nama pelanggan  : ");
        nama = input.nextLine();
        cetak.setnama(nama);
        
        System.out.print(" Masukkan harga satuan    : ");
        harga = input.nextInt();
         cetak.setharga(harga);
        
         System.out.print(" Masukkan jumlah lembar  : ");
        jumlah = input.nextInt();
        cetak.setjumlah(jumlah);
        
         //"total yang harus dibayar  "
        cetak.settotal(harga*jumlah);
        
         System.out.print(" Uang bayar              : ");
        bayar = input.nextInt();
        cetak.setbayar(bayar);
        
         cetak.setkembali(bayar-(harga*jumlah));
        
         cetak.tampil();
    }

}
