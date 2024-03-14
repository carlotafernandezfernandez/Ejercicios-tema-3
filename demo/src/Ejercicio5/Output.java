public class Output {
    public void imprimirIMC(){;
        if (this.valorarPesoCorporal(this.calcularIMC(this.getPeso(), this.getAltura())==1)){
            System.out.println("Tiene sobrepeso");  
        }if (this.valorarPesoCorporal(this.calcularIMC(this.getPeso(), this.getAltura())==-1)){
            System.out.println("Su peso esta por debajo de lo normal");
        }else{
            System.out.println("Su peso es normal");
        }
        System.out.println();
    }

    public void Adulto (){
        if(esMayorDeEdad(this.getEdad())){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
