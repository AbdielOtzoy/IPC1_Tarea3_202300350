public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Triangulo(3, 4);
        figuras[2] = new Cuadrado(5);
        
        for(Figura figura : figuras){
            System.out.println(figura.area());
        }
    }    
}
