public class UjiBusPraktikum {
    public static void main(String[] args) {
        BusPraktikum busMini=new BusPraktikum(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.pluspenumpang(5);
        busMini.cetak();
        
        busMini.pluspenumpang(6);
        busMini.cetak();
        
        busMini.minpenumpang(10);
        busMini.cetak();

        busMini.minpenumpang(15);
        busMini.cetak();
        
        busMini.getAverage();
        busMini.cetak();  
    }
}