
package testingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import entidades.Libro;
import entidades.Alumno;
import entidades.Perro;
import java.util.Date;
import java.util.TreeSet;

public class TestingCollections {
    
    public static void agregarDatosList(ArrayList<Integer> numList, int dato) {
        numList.add(dato);
    }
    
    public static void mostrarDatosList(ArrayList<Integer> numList) {
        System.out.println("Imprimiendo Lista");
        for(int num : numList)
            System.out.println(num);
    }
    
    public static void iterarSobreUnaLista(ArrayList<Integer> list) {
        Iterator ite = list.iterator();
        
        System.out.println("Elementos de la lista: ");
        while(ite.hasNext()) {
            System.out.print(ite.next() + " ");
            System.out.println("");
        } 
    }
    
    public static void agregarDatosSet(HashSet<Integer> numSet, int dato) {
        numSet.add(dato);
    }
    
    public static void mostrarDatosSet(HashSet<Integer> numSet) {
        System.out.println("Imprimiendo Conjunto");
        for(int num : numSet)
            System.out.println(num);
    }
    
    public static void agregarDatosMap(HashMap<Integer, String> alumMap, 
                                       int llave, String valor)
    {
        alumMap.put(llave, valor);
    }
    
    public static void mostrarDatosMap(HashMap<Integer,String> alumMap) {
        System.out.println("Imprimiendo Mapa");
        for (HashMap.Entry<Integer, String> entry : alumMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Llave: " + key + " | Valor: " + value);
        }
    }
    
    public static void operacionesListas() {
        ArrayList<Integer> numerosList = new ArrayList();
        
        agregarDatosList(numerosList, 10);
        agregarDatosList(numerosList, 5);
        agregarDatosList(numerosList, 50);
        
        System.out.println("Lista desordenada");
        iterarSobreUnaLista(numerosList);
        Collections.sort(numerosList);
        
        System.out.println("");
        
        System.out.println("Lista ordenada");
        iterarSobreUnaLista(numerosList);
    }
    
    public static void operacionesConjuntos() {
        HashSet<Integer> numerosSet = new HashSet();
        
        agregarDatosSet(numerosSet, 20);
        agregarDatosSet(numerosSet, 30);
        agregarDatosSet(numerosSet, 1);
        agregarDatosSet(numerosSet, 5);
        agregarDatosSet(numerosSet, 90);
        
        System.out.println("Datos desordenados");
        mostrarDatosSet(numerosSet);
        
        // Transforming HashSet into ArrayList because sort method doesn't
        //  know how to orden by hash atribute.
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        
        System.out.println("");
        Collections.sort(numerosLista);
        System.out.println("Datos ordenados");
        mostrarDatosList(numerosLista);
    }
    
    public static void mostrarDatosTreeMap(TreeMap<Integer, String> treeMap) {
        System.out.println("Imprimiendo Tree Map");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            System.out.println("Llave: " + key + " | Valor: " + value);
        }
    }
    
    public static void operacionesMapas() {
        HashMap<Integer, String> alumnosMap = new HashMap();
        
        agregarDatosMap(alumnosMap, 3, "Chuchu");
        agregarDatosMap(alumnosMap, 1, "Lucas");
        agregarDatosMap(alumnosMap, 5, "Agus");
        agregarDatosMap(alumnosMap, 30, "Lean");
        agregarDatosMap(alumnosMap, 15, "Nahuel");
        agregarDatosMap(alumnosMap, 11, "Gimena");
        
        System.out.println("Datos desordenados");
        mostrarDatosMap(alumnosMap);
        
        // Transforming HashMap into TreeMap because sort method doesn't
        //  know if order by key or by value
        TreeMap<Integer, String> alumnosTree = new TreeMap(alumnosMap);
        
        System.out.println("");
        System.out.println("Datos ordenados");
        mostrarDatosTreeMap(alumnosTree);
    }
    
    public static void mostrarObjetosListLibro(ArrayList<Libro> libList) {
        System.out.println("Imprimiendo Lista");
        for(Libro lib : libList)
            System.out.println(lib);
    }
    
    public static void operacionesObjetosLista() {
        ArrayList<Libro> listaLibros = new ArrayList();
        Date fechaPublicLibro1 = new Date(2008-1900, 9, 14);
        Date fechaPublicLibro2 = new Date(2006-1900, 06, 17);
        Date fechaPublicLibro3 = new Date(2007-1900, 9, 21);
        
        Libro lib1 = new Libro(12345, "El Heroe de las Eras", "Brandon Sanderson",
                               fechaPublicLibro1);
        Libro lib2 = new Libro(13548, "El Imperio Final", "Brandon Sanderson",
                               fechaPublicLibro2);
        Libro lib3 = new Libro(13548, "El Pozo de la Ascension", "Brandon Sanderson",
                               fechaPublicLibro3);
        
        listaLibros.add(lib1);
        listaLibros.add(lib2);
        listaLibros.add(lib3);
        
        System.out.println("Lista sin ordenar");
        mostrarObjetosListLibro(listaLibros);
        
        listaLibros.sort(Libro.compararLibro);
        
        System.out.println("Lista ordenada");
        mostrarObjetosListLibro(listaLibros);
    }
    
    public static void mostrarObjetosMap(HashMap<Integer, Alumno> alumMap) {
        for(Map.Entry<Integer, Alumno> entry : alumMap.entrySet()) {
            System.out.println("Llave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }
    }
    
    public static void operacionesObjetosMapas() {
        HashMap <Integer, Alumno> alumnos = new HashMap();
        
        Alumno alum1 = new Alumno("Juan Manuel", "Pergola", 39515920);
        int dni = 39515920;
        
        alumnos.put(dni, alum1);
        mostrarObjetosMap(alumnos);
    }
    
    public static void mostrarObjetosListPerro(ArrayList<Perro> dogList) {
        System.out.println("Imprimiendo Lista");
        for(Perro dog : dogList)
            System.out.println(dog);
    }
    
    public static void operacionesObjetosConj() {
        HashSet<Perro> perrosSet = new HashSet();
        ArrayList<Perro> perrosLista = new ArrayList(perrosSet);
        
        Perro dog1 = new Perro(8, "Snoopy");
        Perro dog2 = new Perro(1, "Pochita");
        Perro dog3 = new Perro(3, "Santino");
        
        perrosLista.add(dog1);
        perrosLista.add(dog2);
        perrosLista.add(dog3);
        
        mostrarObjetosListPerro(perrosLista);
        perrosLista.sort(Perro.compararEdad);
        mostrarObjetosListPerro(perrosLista);
    }
    
    public static void mostrarObjetosTreeSet(TreeSet<Perro> dogies) {
        for(Perro dog : dogies) {
            System.out.println(dog);
        }
    }
    
    public static void operacionesObjetosTreeSet() {
        TreeSet<Perro> perros = new TreeSet(Perro.compararEdad);
        
        Perro dog1 = new Perro(8, "Snoopy");
        Perro dog2 = new Perro(1, "Pochita");
        Perro dog3 = new Perro(3, "Santino");
        
        perros.add(dog1);
        perros.add(dog2);
        perros.add(dog3);
        
        mostrarObjetosTreeSet(perros);
    }
    
    public static void mostrarObjetosListAlumno(ArrayList<Alumno> alumnos) {
        System.out.println("Imprimiendo Lista");
        for(Alumno alum : alumnos)
            System.out.println(alum);
    }
    
    public static HashMap<Integer, Alumno> operacionesObjetosHashMap() {
        HashMap<Integer, Alumno> alumnos = new HashMap();
        
        Alumno alum1 = new Alumno("Juan Manuel", "Pergola", 39515920);
        int dniAl1 = 39515920;
        
        Alumno alum2 = new Alumno("Leandro", "Deferrari", 37515920);
        int dniAl2 = 37515920;
        
        Alumno alum3 = new Alumno("Agustin", "Dedico", 43515920);
        int dniAl3 = 43515920;
        
        alumnos.put(dniAl1, alum1);
        alumnos.put(dniAl2, alum2);
        alumnos.put(dniAl3, alum3);
        
        // map.values() retorna una coleccion segun los valores del mapa
        ArrayList<Alumno> nombres = new ArrayList(alumnos.values());
        
        System.out.println("\nLista desordenada");
        mostrarObjetosMap(alumnos);
        
        nombres.sort(Alumno.compararDni);
        
        System.out.println("\nLista ordenada");
        mostrarObjetosListAlumno(nombres);
        
        return alumnos;
    }

    public static void main(String[] args) {
        HashMap<Integer, Alumno> alumnos = new HashMap();
        
        //operacionesListas();
        //operacionesConjuntos();
        //operacionesMapas();
        
        //operacionesObjetosLista();
        //operacionesObjetosConj();
        //operacionesObjetosMapas();
        
        //operacionesObjetosTreeSet();
        alumnos = operacionesObjetosHashMap();
    }
}
