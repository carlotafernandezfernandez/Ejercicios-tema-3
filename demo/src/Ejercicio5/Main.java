public class Main {
    public static void main(String[] args) {
        BufferReader buf= new Main (new InputStreamReader(System.in));
        System.out.println("Nombre:");
        String nombre=buf.realLine();
        System.out.println("Edad:");
        int edad=Integer.parseInt(buf.readLine());
        System.out.println("Sexo:");
        Genero sexo=Genero.valueOf(buf.readLine());
        System.out.println("Peso:");
        float peso=Float.parseFloat(buf.readLine());
        System.out.println("Altura:");
        int altura=Integer.parseInt(buf.readLine());

        Persona p1= new Persona (nombre, edad, sexo, peso, altura);
        Persona p2= new Persona (nombre, edad, sexo);
        Persona p3 = new Persona();
        p3.setNombre("Carlota");
        p3.setEdad(25);
        p3.setSexo(Genero.MUJER);
        p3.setPeso(60);
        p3.setAltura(170);

        
        p1.imprimirIMC();
        imprimirIMC(p1);
        p2.imprimirIMC();
        p3.imprimirIMC();

        System.out.println(p1.toString());
        System.out.println();
    }
    
}
