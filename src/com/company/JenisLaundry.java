package com.company;
import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public int size(){
        return this.jenisLaundry.size();
    }

    public JenisLaundry(){
        this.jenisLaundry.add("Cuci Kering");
        this.harga.add(3000);
        this.durasi.add(1);

        this.jenisLaundry.add("Cuci Lipat");
        this.harga.add(4000);
        this.durasi.add(3);

        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(6000);
        this.durasi.add(3);

        this.jenisLaundry.add("Cuci Karpet");
        this.harga.add(10000);
        this.durasi.add(5);

        this.jenisLaundry.add("Cuci Kering Setrika");
        this.harga.add(10000);
        this.durasi.add(3);
    }

    public void setLaundry(String jenis){
        this.jenisLaundry.add(jenis);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void setDurasi(int durasi){
        this.durasi.add(durasi);
    }
    public String getLaundry(int id){
        return this.jenisLaundry.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public int getDurasi(int id){
        return this.durasi.get(id);
    }
}
