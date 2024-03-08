public class Circulo extends Figura {
    double radio;
    
    Circulo(double radio){
        super(0);
        this.radio = radio;
    }
    
    double area(){
        return Math.PI * radio * radio;
    }
}
