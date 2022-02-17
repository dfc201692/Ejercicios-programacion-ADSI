package ejercicios.adsi;

public class if_else {

    public static void main(String[] args) {
        
        //hacer la declaracion de las variables
        int numero1 = 80;
        int numero2 = 60;

        //evalua cual de las dos variables contiene el numero mayor
       if (numero1 == numero2) {
            System.out.println("El numero " + numero1 + " es igual al numero " + numero2);
        }
       else if (numero1>numero2) {
            System.out.println("El numero " + numero1 + " es mayor que el numero " + numero2);
        } else {
            System.out.println("El numero " + numero2 + " es mayor que el numero " + numero1);
        }
    }
}
