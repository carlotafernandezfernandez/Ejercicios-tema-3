public class Fecha {
    int dias;
    int mes;
    int anio;

    public Fecha (int d, int m, int a){
        this.dia=d;
        this.mes=m;
        this.anio=a;
    }

    public int getDia (){
        return dia;
    }

    public int getMes(){
        return mes;
    }
    
    public int getAnio(){
        return anio;
    }

    public void setDia(int d){
        this.dia=d;
    }

    public void setMes(int m){
        this.mes=m;
    }

    public void setAnio(int a){
        this.anio=a;
    }

    public String toString (){
        System.out.println("Dia "+dia+" Mes "+mes+" Año "+anio);
    }
}
