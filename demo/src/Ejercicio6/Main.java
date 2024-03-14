public class Main {
    public static void main (String[]args){
        List <Password> contraseñas = new ArrayList<>();
        List <String> fuertes = new ArrayList<>();
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int numero;

        for (int i=0; i<100; i++){
            System.out.println("Introduzca la longitud de la contraseña");
            numero = Integer.parseInt(buf.readLine());
            contraseñas.add(new Password(numero));
            if(contraseñas.get(i).esFuerte()){
                fuertes.add("ES FUERTE");
            }else{
                fuertes.add("NO ES FUERTE");
            }
            System.out.println("La contraseña es '"+contraseñas.get(i)+"', "+fuertes.get(i));
        }
        }
    }
