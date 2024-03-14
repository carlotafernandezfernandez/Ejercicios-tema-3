public class Password {
    int longitud;
    String contraseña;

    public Password (){
        this.longitud = 8;
        this.contraseña= "password";
    }

    public Password(int longitud){
        this.longitud= longitud;
        this.contraseña= generarContraseña(longitud);
    }

    public String generarContraseña(int longitud){
        String contraseña = "";
        for (int i = 0; i < longitud; i++) {
            int numero = (int) (Math.random() * 3 + 1);
            if (numero == 1) {
                int numeroAleatorio = (int) (Math.random() * 10);
                contraseña += numeroAleatorio;
            } else if (numero == 2) {
                char letraAleatoria = (char) (Math.random() * 26 + 'a');
                contraseña += letraAleatoria;
            } else {
                char letraAleatoria = (char) (Math.random() * 26 + 'A');
                contraseña += letraAleatoria;
            }
        }
        return contraseña;
    }

    public boolean esFuerte(){
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isUpperCase(contraseña.charAt(i))) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(contraseña.charAt(i))) {
                contadorMinusculas++;
            } else if (Character.isDigit(contraseña.charAt(i))) {
                contadorNumeros++;
            }
        }
        if (contadorMayusculas >= 2 && contadorMinusculas >= 1 && contadorNumeros >= 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getContraseña(){
        return contraseña;
    }

    public int getLongitud(){
        return longitud;
    }

    public void setLongitud(int longitud){
        this.longitud= longitud;
    }

}