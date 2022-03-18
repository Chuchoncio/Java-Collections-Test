
package testingcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

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
                
    }

    public static void main(String[] args) {
        operacionesListas();
        operacionesConjuntos();
        
        HashMap<Integer, String> alumnosMap = new HashMap();
        agregarDatosMap(alumnosMap, 39515920, "Chuchu");
    }

}
