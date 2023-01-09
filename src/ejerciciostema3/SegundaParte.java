package ejerciciostema3;

public class SegundaParte {
        public static void main(String[] args) {
            coche miCoche = new coche();
            miCoche.numPuertas();
            System.out.println(miCoche.puertas);
    }
}

class coche{
        int puertas = 4;
        
        public void numPuertas(){
            this.puertas++;
        }
}
