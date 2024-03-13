public class Main {
    public static void main(String[] args) {
        Fecha f1 = new Fecha (20, 10, 2018);
        System.out.println(f1.toString());

        Fecha f2 = new Fecha (20, 10, f1.setAnio(2019));
        System.out.println(f2.toString());
    }
    }
