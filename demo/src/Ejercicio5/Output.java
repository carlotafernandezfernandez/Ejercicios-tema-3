public class Output {
    public imprimirIMC(){;
        if (Persona.valorarPesoCorporal(Persona.calcularIMC(getPeso(),getAltura())==1)){
            System.out.println("Tiene sobrepeso");  
        }if (valorarPesoCorporal(calcularIMC(getPeso(),getAltura())==-1)){
            System.out.println("Su peso esta por debajo de lo normal");
        }else{
            System.out.println("Su peso es normal");
        }
        System.out.println();
    }

    public void Adulto (){
        if(esMayorDeEdad(p.getEdad())){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}

