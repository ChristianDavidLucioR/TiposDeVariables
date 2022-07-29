public class TiposDeVariables {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("                Tipos de numeros enteros            ");
        byte valor = -128;
        byte valo2 = 127;
        System.out.println("El rango de valores del tipo byte va desde: " +valor+ " hasta el: "+valo2);

        short entero = -32768;
        short entero2 = 32767;
        System.out.println("El rango de valores del tipo short va desde: " +entero+ " hasta el: "+entero2);

        int numero = -2147483648;
        int numero2 = 2147483647;
        System.out.println("El rango de valores del tipo int va desde el: " +numero+ " hasta el: " +numero2);

        long rango = -922337203;
        long rango2 = 922337285;
        System.out.println("El rango del valor long no ingreso todo");
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("               Tipos de numeros decimales");
        float decimal = 312.525f;
        System.out.println("El numero decimal float es: "+decimal);

        double decimal1 = 21.5;
        System.out.println("El numero double es: "+decimal1);
        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("               Tipos de caracteres");
        char caracter = 'V';
        char caracter1 = 'F';
        System.out.println("El valor del char es: "+caracter);
        System.out.println("El valor del char1 es: "+caracter1);

        boolean decision = true;
        boolean decision2 = false;
        System.out.println("La desición es: "+decision +" y la segunda desicón es: "+decision2);
        System.out.println("-----------------------------------------------------------------------------------------");


    }
}
