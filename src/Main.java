import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bucleejercicio7();
    }
    //Ejercicios de Array list,HashSet y HashMap
    public static void ejercicio1() {
        // ----- Primer Ejercicio -----
        System.out.println("----- Primer Ejercicio -----");
        ArrayList<String> list = new ArrayList<>();
        list.add("Daniel");
        list.add("Almudena");
        list.add("Maria");
        list.add("Deivi");
        list.add("Lourdes");
        System.out.println("Primer nombre " + list.get(0));
        System.out.println("Último nombre " + list.get(4));
        System.out.println("Tamaño de la lista = " + list.size());
    }

    public static void ejercicio2() {
        // ----- Segundo Ejercicio -----
        System.out.println("----- Segundo Ejercicio -----");
        ArrayList<Double> Decimales = new ArrayList<>();
        Decimales.add(8.5);
        Decimales.add(9.5);
        Decimales.add(3.0);
        Decimales.add(4.0);
        Decimales.add(2.0);
        double media = (Decimales.get(0) + Decimales.get(1) + Decimales.get(2) + Decimales.get(3) + Decimales.get(4)) / 5;
        System.out.println("La nota media es: " + media);
        if (media >= 5.0) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
}
    public static void ejercicio3() {
        // ----- Tercer Ejercicio -----
        System.out.println("----- Tercer Ejercicio -----");
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Morado");
        colores.add("Amarillo");
        System.out.print("Introduce un color para buscarlo: ");
        Scanner sc = new Scanner(System.in);
        String colorUsuario = sc.nextLine();
        if (colores.contains(colorUsuario)) {
            System.out.println("Está en la lista");
        } else {
            System.out.println("No se encuentra ese color.");

        }
    }

    public static void ejercicio4() {
        // ----- Cuarto Ejercicio -----
        System.out.println("----- Cuarto Ejercicio -----");
        HashSet<String> DNIs = new HashSet<>();
        DNIs.add("77849086C");
        DNIs.add("87936490A");
        DNIs.add("56785432R");
        DNIs.add("34553211J");
        DNIs.add("34553211J");
        System.out.println("El tamaño de la lista es: " + DNIs.size());
        if (DNIs.contains("34553211J")) {
            System.out.println("¿La lista contiene el DNI 34553211J? " + DNIs.contains("34553211J"));
        }
    }

    public static void ejercicio5() {
        // ----- Quinto Ejercicio -----
        System.out.println("----- Quinto Ejercicio -----");
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Antonio");
        nombres.add("Paco");
        nombres.add("Jose");
        nombres.add("David");
        nombres.add("Melissa");
        System.out.println("Introduce un nombre: ");
        Scanner sc2 = new Scanner(System.in);
        String nombreUsuario = sc2.nextLine();
        if (nombres.contains(nombreUsuario)) {
            System.out.println("El nombre ya existe");
        } else {
            nombres.add(nombreUsuario);
            System.out.println(nombres);
        }
    }

    public static void ejercicio6() {
        // ----- Sexto Ejercicio -----
        System.out.println("----- Sexto Ejercicio -----");
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(45);
        numeros.add(50);
        HashSet<Integer> numeros2 = new HashSet<>();
        numeros2.add(11);
        numeros2.add(26);
        numeros2.add(32);
        numeros2.add(48);
        if (numeros.size() > numeros2.size()) {
            System.out.println("La primera lista es más larga que la segunda");
        } else if (numeros.size() < numeros2.size()) {
            System.out.println("La segunda lista es más larga que la primera");
        } else {
            System.out.println("Ambas listas son de igual tamaño");
        }

    }

    public static void ejercicio7() {
        // ----- Séptimo Ejercicio -----
        System.out.println("----- Séptimo Ejercicio -----");
        HashMap<String, Integer> personas = new HashMap<>();
        Scanner sc3 = new Scanner(System.in);
        personas.put("Ana", 25);
        personas.put("Luis", 17);
        personas.put("Marta", 30);
        personas.put("Carlos", 15);
        personas.put("Elena", 22);
        System.out.println("Introduce un nombre para buscar su edad:  ");
        String nombre = sc3.nextLine();

        if (personas.containsKey(nombre)) {
            int edad = personas.get(nombre);
            String mayor = (edad >= 18) ? "es mayor de edad" : "es menor de edad";
            System.out.println(nombre + " tiene " + edad + " años y " + mayor);
        }
    }

    public static void ejercicio8() {
        // ----- Octavo Ejercicio -----
        System.out.println("----- Octavo Ejercicio -----");
        HashMap<String, Double> notamedia = new HashMap<>();
        Scanner sc4 = new Scanner(System.in);
        notamedia.put("Sofia", 8.5);
        notamedia.put("Jorge", 4.2);
        notamedia.put("Lucia", 9.0);
        notamedia.put("Pedro", 3.5);
        notamedia.put("Maria", 6.7);

        System.out.println("Introduce el nombre del alumno: ");
        String alumno = sc4.nextLine();

        if (notamedia.containsKey(alumno)) {
            double nota = notamedia.get(alumno);
            String resultado = (nota >= 5.0) ? "Aprobado" : "Suspenso";
            System.out.println("La nota media de " + alumno + " es: " + nota + " [ " + resultado + " ] ");
        }
    }

    public static void ejercicio9() {
        // ----- Noveno Ejercicio -----
        System.out.println("----- Noveno Ejercicio -----");
        HashMap<String, String> usuario = new HashMap<>();
        Scanner sc5 = new Scanner(System.in);
        usuario.put("joselito", "tusmuertosacaballo");
        usuario.put("suxula", "veneno");
        usuario.put("deivi10", "supapa");
        usuario.put("manco", "terry");
        usuario.put("deisy", "surmano");

        System.out.println("Introduce Usuario: ");
        String usuario1 = sc5.nextLine();

        System.out.println("Introduce Contraseña: ");
        String contraseña = sc5.nextLine();

        if (usuario.containsKey(usuario1) && usuario.get(usuario1).equals(contraseña)) {
            System.out.println("Login correcto");
        } else {
            System.out.println("Usuario y/o contraseña incorrectos");
        }
    }


    //Ejercicios de Bucles
    public static void Bucleejercicio1() {
        // ----- Primer Ejercicio -----
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }


    public static void Bucleejercicio2() {
        // ----- Segundo Ejercicio -----
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void Bucleejercicio3() {
        // ----- Tercer Ejercicio -----
        int i = 1;
        int suma = 0;
        while (i <= 10) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }

    public static void Bucleejercicio4() {
        // ----- Cuarto Ejercicio -----
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i+=2;
        }
    }

    public static void Bucleejercicio5() {
        // ----- Quinto Ejercicio -----
        int i = 8;
        int factorial = 1;
        while (i > 0) {
            factorial *= i;
            i--;
        }
        System.out.println(factorial);
    }

    public static void Bucleejercicio6() {
        // ----- Sexto Ejercicio -----
        int aleatorio = new Random().nextInt(10) + 1;
        Scanner lector = new Scanner(System.in);
        int i = 0;
        while (i != aleatorio) {
            System.out.println("Introduce un número: ");
            i = lector.nextInt();
            if (i == aleatorio) {
                System.out.println("¡Enhorabuena, acertaste el número!");
            } else {
                System.out.println("Error. Inténtalo de nuevo");
            }
        }
    }

    public static void Bucleejercicio7() {
        // ----- Séptimo Ejercicio -----
        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void Bucleejercicio8() {
        // ----- Octavo Ejercicio -----
        String usuario_correcto = "juanito";
        String contrasenha_correcta = "12345";
        String intento_usuario = "";
        String intento_contrasenha = "";
        Scanner lector1  = new Scanner(System.in);
        boolean acceso = false;
            while (!acceso){
                System.out.println("Introduce Usuario: ");
                intento_usuario = lector1.nextLine();
                System.out.println("Introduce Contraseña: ");
                intento_contrasenha = lector1.nextLine();

                if (intento_usuario.equals(usuario_correcto)  && intento_contrasenha.equals(contrasenha_correcta)) {
                    System.out.println("Login correcto");
                    acceso = true;
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }
            }

    }

    public static void Bucleejercicio9() {
        Scanner lector = new Scanner(System.in);
        String usuario_correcto = "juanito";
        String contrasenha_correcta = "12345";
        int intentos = 0;
        int maxintentos = 3;
        boolean acierto = false;
        while ( intentos < maxintentos && !acierto) {
            System.out.println("Introduce Usuario: ");
            String usuario = lector.nextLine();
            System.out.println("Introduce Contraseña: ");
            String contrasenha = lector.nextLine();
            if (usuario.equals(usuario_correcto) && contrasenha.equals(contrasenha_correcta)) {
                System.out.println("Login correcto");
                acierto = true;
            } else {
                intentos++;
                if (intentos < maxintentos) {
                System.out.println("Incorrecto. Te quedan " + (maxintentos - intentos) + " intentos");
                }
            }
        }
        if (!acierto) {
            System.out.println("DEMASIADOS INTENTOS. CUENTA BLOQUEADA.");
        }
    }
}
