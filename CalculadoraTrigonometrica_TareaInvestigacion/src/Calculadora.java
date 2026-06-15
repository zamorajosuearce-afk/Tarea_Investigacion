import java.util.Scanner; // import para que el usuario ingrese en la terminal

public class Calculadora { // Esta es la clase en la que vamos a trabajar, la main
    public static void main(String[] args) { // Ese es el metodo de la clase main del archivo

        // INICIO: IMPRESIÓN INICIAL
        System.out.println("Operaciones posibles:");
        /*
        System es la clase del sistema.
        .out es de salida (muestra en la terminal).
        .println imprime y avanza a la siguiente línea
        */

        System.out.println("* Operaciones trigonométricas:\n|1. sen (α)| |2. cos (α)| |3. tan (α)|"); // \n avanza a la siguiente línea

        System.out.println("* Operaciones trigonométricas inversas:\n|4. arcsen (α)| |5. arccos (α)| |6. arctan (α)|");

        System.out.println("* Operaciones trigonométricas hiperbólicas:\n|7. senh (α)| |8. cosh (α)| |9. tanh (α)|");

        System.out.println("____________________________________________"); // Solo para dividir

        System.out.println("Seleccione la operación que desea realidas:");
        // FINAL: IMPRESIÓN INICIAL

        // INICIO: INGRESO DE LA OPCIÓN DEL USUARIO
        Scanner var = new Scanner(System.in);
        /*
        Scanner var es para "iniciar" el escaner, se debe crear antes para utilizarlo.
        new crea un nuevo objeto Scanner con System.in.
        System.in permite ingresar algo desde la terminal
        */

        String entrada = var.nextLine();
        /*
        La elección que hará el usuario, la evaluaremos
        para ver que sea un número en el rango de elección
        */
        // FINAL: INGRESO DE LA OPCIÓN DEL USUARIO

        // INICIO: VALIDAR QUE EL INGRESO SEA UN NÚMERO
        int opcion = 0;

        try {
            opcion = Integer.parseInt(entrada);
        /*
        try es para intentar ejecutar algo.
        int opcion es guardar como variable opcion un integer.
        Integer.parseInt(entrada), Integer es una clase de java
        con su metodo parseInt que convierte str a int.
        */

            if (opcion >= 1 && opcion <= 9){ // funciona como un if de python solo que && es and
                System.out.println("Elegiste: " + opcion);
                System.out.println("____________________________________________");
            }
            else {
                System.out.println("Error: no es una de las opciones");
                System.out.println("____________________________________________");
                System.exit(0); // System.exit(0) finaliza el programa y devuelve 0
            }
        /*
        Si la opción está entre 1 y 9 se imprime la eleccion.
        Sino imprime que no es una de las opciones.
        */
        }
        catch (NumberFormatException error) {
            System.out.println("Error: eso no es un número.");
            System.out.println("____________________________________________");
            System.exit(0);
        }
        /*
        catch captura el error: en este caso NumberFormatException
        que es al ingresar texto en vez de un numero.
        Luego imprime que no se ingresó un número.
        */
        // FINAL: VALIDAR QUE EL INGRESO SEA UN NÚMERO

        // INICIO: INGRESO DEL ANGULO A UTILIZAR
        System.out.println("Ingrese el angulo \"α\" para la función:"); // \" es para poder poner comillas en el string.
        String entrada_angulo = var.nextLine();
        /*
        El angulo que ingresara el usuario, la evaluaremos
        para ver que sea un número.
        */
        // FINAL: INGRESO DEL ANGULO A UTILIZAR

        // INICIO: VALIDAR QUE EL INGRESO SEA UN NÚMERO
        double angulo = 0.0;

        try {
            angulo = Double.parseDouble(entrada_angulo);
        /*
        try es para intentar ejecutar algo.
        doble angulo es guardar como variable angulo un numero fraccionario.
        Double.parseDouble(entrada_angulo), Double es una clase de java
        con su metodo parseDouble que convierte str a float, por así decirlo.
        */
            System.out.println("El angulo es: " + angulo);
            System.out.println("____________________________________________");
        }
        catch (NumberFormatException error) {
            System.out.println("Error: el angulo no es un número.");
            System.out.println("____________________________________________");
            System.exit(0);
        }
        /*
        catch captura el error: en este caso NumberFormatException
        que es al ingresar texto en vez de un numero.
        Luego imprime que no se ingresó un número.
        */
        // FINAL: VALIDAR QUE EL INGRESO SEA UN NÚMERO

        // INICIO: CALCULAR SEGUN OPCIÓN
        switch (opcion) { // switch funciona como un if, elif, elif... más limpio
            case 1: // Va por casos segun lo que haya en la variable opcion
                double resultado1 = Math.sin(Math.toRadians(angulo));
                System.out.println(String.format("El resultado de sen (%f", angulo) + String.format(") es de: %f", resultado1));
            /*
            Para las operaciones aritmeticas Math.sin, Math.cos y Math.tan, la operación asume que se le da
            un angulo en radianes, asi que se debe convertir el angulo a radianes primero.
            String.format suma un string mas algun otro tipo de dato, %f sirve para formatear floats
            */
                break; // break es para finalizar en este caso, si no continuaría con los que siguen sin importar el valor de opcion
            case 2:
                double resultado2 = Math.cos(Math.toRadians(angulo));
                System.out.println(String.format("El resultado de cos (%f", angulo) + String.format(") es de: %f", resultado2));
                break;
            case 3:
                double resultado3 = Math.tan(Math.toRadians(angulo));
                System.out.println(String.format("El resultado de tan (%f", angulo) + String.format(") es de: %f", resultado3));
                break;
            case 4:
                double resultado4 = Math.toDegrees(Math.asin(angulo));
                System.out.println(String.format("El resultado de arcsen (%f", angulo) + String.format(") es de: %f", resultado4));
            /*
            Para las operaciones aritmeticas Math.asin, Math.acos y Math.atan, la operación acepta el angulo normal, pero
            devuelve el resultado en radianes, asi que hay que convertirlo a grados de nuevo.
            */
                break;
            case 5:
                double resultado5 = Math.toDegrees(Math.acos(angulo));
                System.out.println(String.format("El resultado de arccos (%f", angulo) + String.format(") es de: %f", resultado5));
                break;
            case 6:
                double resultado6 = Math.toDegrees(Math.atan(angulo));
                System.out.println(String.format("El resultado de arctan (%f", angulo) + String.format(") es de: %f", resultado6));
                break;
            case 7:
                double resultado7 =Math.sinh(angulo);
                System.out.println(String.format("El resultado de sinh (%f", angulo) + String.format(") es de: %f", resultado7));
            /*
            Para las operaciones aritmeticas Math.sinh, Math.cosh y Math.tanh, la operación acepta el angulo normal, no hay que
            convertir a nada
            */
                break;
            case 8:
                double resultado8 =Math.cosh(angulo);
                System.out.println(String.format("El resultado de cosh (%f", angulo) + String.format(") es de: %f", resultado8));
                break;
            case 9:
                double resultado9 =Math.tanh(angulo);
                System.out.println(String.format("El resultado de tanh (%f", angulo) + String.format(") es de: %f", resultado9));
                break;
        }
        // FINAL: CALCULAR SEGUN OPCIÓN
    }
}
