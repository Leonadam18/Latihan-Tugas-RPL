// public class Bus {
//     public int penumpang,maxpenumpang;
    
//     public void cetak(){
//         System.out.println("Penumpang sekarang = "+penumpang);
//         System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
//     }
// }

// public class Bus {
//     public int penumpang,maxpenumpang;
    
//     public Bus(int maxpenumpang){
//         this.maxpenumpang=maxpenumpang;
//         penumpang = 0;
//     }
     
//     public void pluspenumpang(int penumpang){
//         int temp;
//         temp=this.penumpang+penumpang;
//         if (temp>=maxpenumpang){
//             System.out.println("Overload penumpang");
//         }
//         else {
//             this.penumpang=temp;
//         }
        
//     }
//     public void cetak(){
//         System.out.println("Penumpang sekarang = "+penumpang);
//         System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
//     }
// }

public class Bus {
    private int penumpang,maxpenumpang;
    
    public Bus(int maxpenumpang){
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
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
}