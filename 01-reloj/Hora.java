package Reloj;

public class Hora {
    private int horas;
    private int minutos;

    public Hora() {
        horas = 0;
        minutos = 0;
    }

    public Hora(int horas, int minutos) {
        this.horas = horas;
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }
    

    public int getMinutos() {
        return minutos;
    }
    
    // si al hacer inc un número de minutos es mayor de 23... 0
    public void setMinutos(int minutos) {
        if (minutos > 59){
            this.minutos = 0;
            setHoras(horas+1);
        }else{
            this.minutos = minutos;
        }
    }
    
    // si al hacer inc un número de horas es mayor de 23... 0
    public void setHoras(int horas) {
        if (horas > 23){
            this.horas = 0;
        }else{
            this.horas = horas;
        }
    }

    public void inc(){
        setMinutos(minutos+1);
    }

    @Override
    public String toString() {
        return horas + ":"+ minutos;
    }
}
