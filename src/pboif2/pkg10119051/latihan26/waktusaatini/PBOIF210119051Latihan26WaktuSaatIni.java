/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan26.waktusaatini;

import java.util.*;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk  menampilkan waktu aktual
 */
public class PBOIF210119051Latihan26WaktuSaatIni {

    public static void main(String[] args) {
        int detik, menit, jam, hari,tanggal, bulan, tahun;
        GregorianCalendar date = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String namahari[]  = {"Minggu","Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        detik   = date.get(Calendar.SECOND);
        menit   = date.get(Calendar.MINUTE);
        jam     = date.get(Calendar.HOUR_OF_DAY);
        tanggal = date.get(Calendar.DAY_OF_MONTH);
        hari    = date.get(Calendar.DAY_OF_WEEK);
        bulan   = date.get(Calendar.MONTH);
        tahun   = date.get(Calendar.YEAR);
       
        System.out.println("Hari ini adalah hari : " + namahari[hari-1] + ", " + tanggal + " " + namabulan[bulan] + " "+ tahun + " " + jam + ":" + menit + " : " + detik);
    }
    
}
