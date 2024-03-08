class Cuadrado extends Figura {
    double lado;
    
    Cuadrado(double lado){
        super(4);
        this.lado = lado;
    }
    
    double area(){
        return lado * lado;
    }
}
