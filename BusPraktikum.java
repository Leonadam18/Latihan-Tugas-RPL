public class BusPraktikum {
    public int penumpang,maxpenumpang,counter,penumpangbaru;
    
    public BusPraktikum(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
            counter++;
            penumpangbaru+=penumpang;
        }

    }    

    public void minpenumpang(int penumpang){
        int temp;
        temp=(int)this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Jumlah penumpang tidak bisa kurang dari 0");
        }
        else {
            this.penumpang=temp;
            counter--;
            penumpangbaru-=penumpang;
        }

    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }
    public int getAverage(){
        if (counter == 0) {
            return 0;
        }
        else {
            return penumpangbaru / counter;
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+ penumpang);
        System.out.println("Penumpang seharusnya adalah = "+ maxpenumpang);
        System.out.println("Rata-rata penumpang = "+ getAverage());
    }
}