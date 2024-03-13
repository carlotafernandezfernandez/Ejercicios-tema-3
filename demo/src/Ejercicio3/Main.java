public class Main {
    public static void main(String[] args) {
        BufferReader buf = new BufferReader (new InputStreamReader(System.in));

        System.out.println("Introduce el valor del numerador de la fraccion 1");
        int numerador1 = Integer.parseInt(buf.readLine());
        System.out.println("Introduzca el valor del denominador de la fraccion 1");
        int denominador1= Integer.parseInt(buf.readLine());

        NumeroRacional fraccion1 = new NumeroRacional (numerador1, denominador1);

        System.out.println("Introduce el valor del numerador de la fraccion 2");
        int numerador2 = Integer.parseInt(buf.readLine());
        System.out.println("Introduzca el valor del denominador de la fraccion 2");
        int denominador2= Integer.parseInt(buf.readLine());

        NumeroRacional fraccion2 = new NumeroRacional (numerador2, denominador2);

        System.out.println("Introduce: 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 0 para salir de la consola");
        int opcion = Integer.parseInt(buf.readLine());

        do {
            switch (opcion){
                case 1: {
                    Sumar(fraccion1, fraccion2);
                    break;
                }
                case 2: {
                    Restar(fraccion1, fraccion2);
                    break;
                }
                case 3: {
                    Multiplicar(fraccion1, fraccion2);
                    break;
                }
                case 4: {
                    Dividir(fraccion1, fraccion2);
                    break;
                }
                case 0: {
                    System.out.println("Saliendo de la consola");
                    break;
                } default: {
                    System.out.println("Opcion no valida");
                }
            } 
    
        }while (opcion != 0);
    }   
}   
