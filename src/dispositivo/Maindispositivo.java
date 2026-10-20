package dispositivo;

public class Maindispositivo {
    public static void main(String[] args) {
        Dispositivo d1=new Dispositivo();
        Dispositivo d2=new Dispositivo();
        d1.setNombre("Celular");
        d1.setActivo(false);
        d1.setTipo("Plegable");
        d2.setNombre("Laptop");
        d2.setTipo("Portatil");
        d2.setActivo(true);
        d1.mostrarinformacion();
        d1.mostrarestado();
        d2.mostrarinformacion();
        d2.mostrarestado();
    }
}
