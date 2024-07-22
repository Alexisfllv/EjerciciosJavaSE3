package SE29Boxing;

public class TestAutobun {
    

    public static void main(String[] args) {
        

        //

        //Clase envolvente
        /*
         * int integer
         * long Long
         * float Float
         * double Double
         * boolean  - Boolean
         * byte Byte
         * char Character
         * short Short
         */

        //Autoboxing
        //primitivo a object

         Integer entero = 10;
         
         System.out.println("v1 "+    entero);
         System.out.println("v2 " + entero.toString());
         System.out.println("v3 " +entero.doubleValue());

         //Unboxing
         //object a primitivo
         int entero2 = entero;

         System.out.println("v1 " + entero2);
    }
}
