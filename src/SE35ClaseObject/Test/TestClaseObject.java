package SE35ClaseObject.Test;

import SE35ClaseObject.Domain.Empleado;

public class TestClaseObject {

    
    public static void main(String[] args) {
        //
        Empleado em1 =  new Empleado("Alexis", 200);
        Empleado em2 =  new Empleado("Alexis", 200);
        System.out.println(em1.toString());

        if (em1 == em2) {
            System.out.println("Son inguales en referencia de memoria");
        }else{
            System.out.println("Diferentes");
        }

        //
        

        if (em1.equals(em2)) {
            System.out.println("Iguales en contenido");
        }else{
            System.out.println("Diferentes contenido");
        }

        boolean de = em1.equals(em2);
        System.out.println(de);

        //
        if (em1.hashCode() == em2.hashCode()) {
            System.out.println("iguales en codigo");
        }else{
            System.out.println("Diferentes en codigo");
        }

        System.out.println(em1.hashCode());
        System.out.println(em2.hashCode());
    }
    
}
