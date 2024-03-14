public class Persona {
    String nombre;
    int edad;
    String DNI;
    Genero sexo;
    float peso;
    int altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = Genero.HOMBRE;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona (String n, int e, Genero s){
        this.nombre = n;
        this.edad = e;
        this.DNI = generaDNI();
        this.sexo = s; 
        this.peso = 0;
        this.altura = 0;
    }

    public Persona (String n, int e, Genero s, float p, int a){
        this.nombre = n;
        this.edad = e;
        this.DNI = generaDNI();
        this.sexo = s; 
        this.peso = p;
        this.altura = a;
    }

    public int calcularIMC(int peso, int altura){
        return IMC= peso/(altura*altura);
    }

    public int valorarPesoCorporal (int IMC){
        if (IMC>25){
            return 1;
        } else if (IMC<18){
            return -1;
        } else {
            return 0;
        }
    }

    public boolean esMayorDeEdad(int edad){
        if (edad>=18){
            return true;
        } else {
            return false;
        }
    }

    private String generaDNI() {
        // Genera un número de 8 dígitos
        int numeroDNI = (int)(Math.random() * 100000000);
        
        // Genera una letra de la A a la Z
        char letraDNI = (char)('A' + (int)(Math.random() * 26));

        return DNI= numeroDNI+letraDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Genero getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(Genero sexo) {
        this.sexo = Genero.sexo;
    }   

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Persona= "+nombre +" / "+ edad +" / "+ DNI +" / "+ sexo +" / "+ peso +" / "+ altura;
    }
}
