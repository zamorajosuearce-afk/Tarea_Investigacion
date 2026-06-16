import java.util.Scanner; // import para que el usuario ingrese en la terminal

public class Calculadora { // Esta es la clase en la que vamos a trabajar, la main
    public static void main(String[] args) { // Ese es el metodo de la clase main del archivo

        Scanner var = new Scanner(System.in); // Movido afuera para que no se cree en cada bucle
    /*
    Scanner var es para "iniciar" el scanner, se debe crear antes para utilizarlo.
    new crea un nuevo objeto Scanner con System.in.
    System.in permite ingresar algo desde la terminal
    */

        // BUCLE DE LA CALCULADORA PARA QUE SE EJECUTE HASTA QUE EL USUARIO NO QUIERA HACER MÁS CALCULOS
        while (true) {
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

            System.out.println("Seleccione la operación que desea realizar:");
            // FINAL: IMPRESIÓN INICIAL

            // INICIO: VALIDAR QUE EL INGRESO SEA UN NÚMERO
            int opcion = 0;

            while (true) { // Bucle que se reinicia mientras no se ingrese una opción válida
                String entrada = var.nextLine();
        /*
        La elección que hará el usuario, la evaluaremos
        para ver que sea un número en el rango de elección
        */
                try {
                    opcion = Integer.parseInt(entrada);
          /*
          try es para intentar ejecutar algo.
          int opcion es guardar como variable opcion un integer.
          Integer.parseInt(entrada), Integer es una clase de java
          con su metodo parseInt que convierte str a int.
           */

                    if (opcion >= 1 && opcion <= 9) { // funciona como un if de python solo que && es and
                        System.out.println("Elegiste: " + opcion);
                        System.out.println("____________________________________________");
                        break; // Rompe el while si se ingresa una opcion valida
                    } else {
                        System.out.println("Error: no es una de las opciones.");
                        System.out.println("____________________________________________");
                        System.out.println("Intente de nuevo:");
                    }
          /*
          Si la opción está entre 1 y 9 se imprime la elección.
          Sino imprime que no es una de las opciones.
          */
                } catch (NumberFormatException error) {
                    System.out.println("Error: eso no es un número entero.");
                    System.out.println("____________________________________________");
                    System.out.println("Intente de nuevo:");
                }
        /*
        catch captura el error: en este caso NumberFormatException
        que es al ingresar texto en vez de un número.
        Luego imprime que no se ingresó un número.
        */
            }
            // FINAL: VALIDAR QUE EL INGRESO SEA UN NÚMERO

            // INICIO: VALIDAR QUE EL INGRESO SEA UN NÚMERO
            double angulo = 0.0;
            while (true){
                System.out.println("Ingrese el angulo \"α\" para la función:"); // \" es para poder poner comillas en el string.
                String entrada_angulo = var.nextLine();
        /*
        El angulo que ingresara el usuario, la evaluaremos
        para ver que sea un número.
        */
                try {
                    angulo = Double.parseDouble(entrada_angulo);
          /*
          try es para intentar ejecutar algo.
          doble angulo es guardar como variable angulo un número fraccionario.
          Double.parseDouble(entrada_angulo), Double es una clase de java
          con su metodo parseDouble que convierte str a float, por así decirlo.
           */
                    System.out.println("El angulo es: " + angulo);
                    System.out.println("____________________________________________");
                    break;
                }
                catch (NumberFormatException error) {
                    System.out.println("Error: el angulo no es un número.");
                    System.out.println("____________________________________________");
                }
        /*
        catch captura el error: en este caso NumberFormatException
        que es al ingresar texto en vez de un número.
        Luego imprime que no se ingresó un número.
        */
            }
            // FINAL: VALIDAR QUE EL INGRESO SEA UN NÚMERO

            // INICIO: CALCULAR SEGÚN OPCIÓN
            switch (opcion) { // switch funciona como un if, elif, elif... más limpio
                case 1: // Va por casos según lo que haya en la variable opcion
                    double resultado1 = Math.sin(Math.toRadians(angulo));
                    System.out.println(String.format("El resultado de sen (%s", angulo) + String.format(") es de: %s", resultado1));
          /*
          Para las operaciones trigonométricas Math.sin, Math.cos y Math.tan, la operación asume que se le da
          un angulo en radianes, asi que se debe convertir el angulo a radianes primero.
          String.format suma un string más algún otro tipo de dato, %s sirve para formatear el número con los decimales necesarios
          */
                    System.out.println("____________________________________________");
                    break; // break es para finalizar en este caso, si no continuaría con los que siguen sin importar el valor de opcion
                case 2:
                    double resultado2 = Math.cos(Math.toRadians(angulo));
                    System.out.println(String.format("El resultado de cos (%s", angulo) + String.format(") es de: %s", resultado2));
                    System.out.println("____________________________________________");
                    break;
                case 3:
                    double resultado3 = Math.tan(Math.toRadians(angulo));
                    System.out.println(String.format("El resultado de tan (%s", angulo) + String.format(") es de: %s", resultado3));
                    System.out.println("____________________________________________");
                    break;
                case 4:
                    double resultado4 = Math.toDegrees(Math.asin(angulo));
                    System.out.println(String.format("El resultado de arcsen (%s", angulo) + String.format(") es de: %s", resultado4));
                    System.out.println("____________________________________________");
          /*
          Para las operaciones trigonométricas Math.asin, Math.acos y Math.atan, la operación acepta el angulo normal, pero
          devuelve el resultado en radianes, asi que hay que convertirlo a grados de nuevo.
          */
                    break;
                case 5:
                    double resultado5 = Math.toDegrees(Math.acos(angulo));
                    System.out.println(String.format("El resultado de arccos (%s", angulo) + String.format(") es de: %s", resultado5));
                    System.out.println("____________________________________________");
                    break;
                case 6:
                    double resultado6 = Math.toDegrees(Math.atan(angulo));
                    System.out.println(String.format("El resultado de arctan (%s", angulo) + String.format(") es de: %s", resultado6));
                    System.out.println("____________________________________________");
                    break;
                case 7:
                    double resultado7 =Math.sinh(angulo);
                    System.out.println(String.format("El resultado de sinh (%s", angulo) + String.format(") es de: %s", resultado7));
                    System.out.println("____________________________________________");
          /*
          Para las operaciones trigonométricas Math.sinh, Math.cosh y Math.tanh, la operación acepta el angulo normal, no hay que
          convertir a nada
          */
                    break;
                case 8:
                    double resultado8 =Math.cosh(angulo);
                    System.out.println(String.format("El resultado de cosh (%s", angulo) + String.format(") es de: %s", resultado8));
                    System.out.println("____________________________________________");
                    break;
                case 9:
                    double resultado9 =Math.tanh(angulo);
                    System.out.println(String.format("El resultado de tanh (%s", angulo) + String.format(") es de: %s", resultado9));
                    System.out.println("____________________________________________");
                    break;
            }
            // FINAL: CALCULAR SEGÚN OPCIÓN

            // PREGUNTAR SI DESEA CONTINUAR
            System.out.println("¿Desea realizar otro cálculo? (S/N)");
            String continuar = var.nextLine(); // Guardar la variable continuar para ver si se rompe el ciclo o no
            if (continuar.equals("N")) {
                break;
            }
        }
    }
}


