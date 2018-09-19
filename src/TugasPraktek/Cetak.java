/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktek;

/**
 *
 * @author ASUS
 */
public class Cetak {
    private String nama ;
    private int harga ;
    private int jumlah ;
    private int total ;
    private int bayar ;
    private int kembali ;

    //enkapsulasi
    public void setnama(String nama)
    {
        this.nama = nama;
    }
    public String getnama()
    {
        return this.nama;
    }
  
    public void setharga(int harga)
    {
        this.harga = harga;
    }
    public int getharga()
    {
        return  this.harga;
    }
  
    public void setjumlah(int jumlah){
         this.jumlah = jumlah;
    }
    public int getjumlah(){
         return this.jumlah;
    }
 
    public void settotal(int total){
         this.total = total;
    }
    public int gettotal(){
         return this.total;
    }

    public void setbayar(int bayar){
         this.bayar = bayar;
    }
    public int getbayar(){
         return this.bayar;
    }
  
    public void setkembali(int kembali){
         this.kembali = kembali;
    }
    public int getkembali(){
         return this.kembali;
    }

    //method panggil
    public void tampil()
    {
        
  
        System.out.println(" Nama pelanggan  : "+getnama());
        System.out.println(" Harga satuan    : "+getharga()+" rupiah");
        System.out.println(" Banyak lembar   : "+getjumlah()+" lembar");
        System.out.println(" Total           : "+(gettotal()+ " rupiah"));
        System.out.println(" Uang pembayaran : "+getbayar()+" rupiah");
        System.out.println("------------------------------------------");
        System.out.println(" Uang kembali    : "+(getkembali()+" rupiah"));
        System.out.println("============================================");           
    }
}
