public class Triangulo extends Figura {
    double base;
    double altura;
    
    Triangulo(double base, double altura){
        super(3);
        this.base = base;
        this.altura = altura;
    }
    
    double area(){
        return (base * altura) / 2;
    }
}
