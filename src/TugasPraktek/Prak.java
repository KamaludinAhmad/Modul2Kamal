/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Prak {
     private int penumpang;
        private int maxPenumpang;
        private int password;
       
        public static String bacainputan() throws java.io.IOException {
        String baca= " ";
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader buf = new BufferedReader (input);
       
        baca = buf.readLine();
        return baca;
        }
       
        //konstruktor kelas Bus
        public Prak(int maxPenumpang) {
            this.maxPenumpang = maxPenumpang;
            penumpang = 0;
        }
       
        public void getAverage(){
            float x = penumpang/4;
            System.out.println("Rata-ratanya adalah : "+x);
        }
       
        public void cetak() {
            System.out.println("Penumpang Bus Sekarang adalah "+penumpang);
            System.out.println("Penumpang maksimum  "+maxPenumpang);
        }
       
        public void getPenumpang(int a) throws IOException{
            System.out.println("Enter Password");
            password=Integer.parseInt(bacainputan());
            if (password==546) {
                  System.out.println("Datanya adalah : ");
                  addPenumpang(a);
                  cetak();
            }
            else { System.out.println("Password salah "); }
        }
       
        public void addPenumpang (int penumpang) {
            int temp;
            temp = this.penumpang+penumpang;
            if (temp >= maxPenumpang) { System.out.println("Penumpang Melebihi kuota"); }
            else { this.penumpang = temp ; }
        }
}
