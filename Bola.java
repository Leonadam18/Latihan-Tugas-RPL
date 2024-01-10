public class Bola {
    private double jarijari;

    public Bola(){
        this.jarijari = 0;
    }

    public void setJariJari(double jarijari){
        if (jarijari>0) {
            this.jarijari=jarijari;
        }
        else{
            System.out.println("Jari-jari harus lebih dari 0");
        }
    }

    public double Diameter(){
        return 2*jarijari;
    }

    public double LuasPermukaan(){
        return 4*Math.PI*Math.pow(jarijari, 2);
    }

    public double Volume(){
        return (4/3)*Math.PI*Math.pow(jarijari, 3);
    }

    public static void main(String[] args) {
        int jarijarivariable = 5;
        Bola bolaObjek = new Bola();

        System.out.println("Diameter: "+bolaObjek.Diameter());
        System.out.println("Luas Permukaan: "+bolaObjek.LuasPermukaan());
        System.out.println("Volume: "+bolaObjek.Volume());

        bolaObjek.setJariJari(jarijarivariable);

        System.out.println("\nSetelah manipulasi: ");
        System.out.println("Diameter: "+bolaObjek.Diameter());
        System.out.println("Luas Permukaan: "+bolaObjek.LuasPermukaan());
        System.out.println("Volume: "+bolaObjek.Volume());
    }
}