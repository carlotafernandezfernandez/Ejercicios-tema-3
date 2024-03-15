public class NumeroRacional {
    int numerador;
    int denominador;

    public NumeroRacional(){
        this.numerador=0;
        this.denominador=0;
    }
    
    public NumeroRacional (int n, int d){
        this.numerador=n;
        this.denominador=d;
    }

    public NumeroRacional (NumeroRacional otro){
        this.numerador=otro.getNumerador();
        this.denominador=otro.getDenominador();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public String toString() {
        return "NumeroRacional= "+numerador +" / "+ denominador;
    }

    public NumeroRacional Sumar (NumeroRacional n2){
        int multiplicacion = this.getDenominador()*this.getDenominador();
        int suma= (multiplicacion/this.getDenominador()*this.getNumerador())+(multiplicacion/n2.getDenominador()*n2.getNumerador());
        NumeroRacional resultado = new NumeroRacional(suma, multiplicacion);
        System.out.println("La suma de "+ this.numerador "/" + this.denominador +" + "+ n2.toString +" es "+resultado);
        return resultado;  
    }

    public NumeroRacional Restar (NumeroRacional n1, NumeroRacional n2){
        int multiplicacion = n1.getDenominador()*n2.getDenominador();
        int resta= (multiplicacion/n1.getDenominador()*n1.getNumerador())-(multiplicacion/n2.getDenominador()*n2.getNumerador());
        NumeroRacional resultado = new NumeroRacional(resta, multiplicacion);
        System.out.println("La resta de "+n1+" - "+n2+" es "+resultado);
        return resultado;  
    }

    public NumeroRacional multiplicacion (NumeroRacional n1, NumeroRacional n2){
        int multiplicacionNumerador = n1.getDenominador()*n2.getDenominador();
        int multiplicacionDenominador= n1.getNumerador()*n2.getNumerador();
        NumeroRacional resultado = new NumeroRacional(multiplicacionNumerador, multiplicacionDenominador);
        System.out.println("La multiplicacion de "+n1+" * "+n2+" es "+resultado);
        return resultado;  
    }

    public NumeroRacional Division (NumeroRacional n1, NumeroRacional n2){
        int numerador = n1.getNumerador()*n2.getDenominador();
        int denominador= n1.getDenominador()*n2.getNumerador();
        NumeroRacional resultado = new NumeroRacional(numerador, denominador);
        System.out.println("La division de "+n1+" / "+n2+" es "+resultado);
        return resultado;  
    }
}
