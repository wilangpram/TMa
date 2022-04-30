package Model;

import Interface.ContohInterface;

public class Perhitungan implements ContohInterface{
        private int a;
        private int b;
        private int hasil;
    
    public Perhitungan (int _a, int _b, int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        PrintJudulClass("Print Judul Dalam Class Perhitungan");
        
    }
    
    private void PrintJudulClass(String jdl) {
        System.out.println(jdl);
    }

    @Override
    public String PrintJudul(String Judul) {
        return Judul;
        // TODO Auto-generated method stub
        
    }

    @Override
    public int HitungTambah(int a, int b) {
        return a + b;
        // TODO Auto-generated method stub
        
    }

    @Override
    public int HitungKali(int a, int b) {
        return a * b;
        // TODO Auto-generated method stub
        
    }
}
