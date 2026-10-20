package dispositivo;

import static java.lang.Boolean.TRUE;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public boolean getActivo(){
        return activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public void mostrarinformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Tipo: "+tipo);
        System.out.println("||");
    }
    public void mostrarestado(){
        if (activo==true){
            System.out.println(nombre+" Esta activo");
            System.out.println("----------------------------------");
        }else{
            System.out.println(nombre+" Esta desactivado");
            System.out.println("----------------------------------");
        }
    }
}
