package ejerciciostema3;

public class PrimeraParte {
        public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        int resultado;
        
        resultado = suma(a,b,c);
        System.out.println(resultado);
    }
    
    public static int suma(int a, int b, int c){
      return a + b + c;
    }
}
