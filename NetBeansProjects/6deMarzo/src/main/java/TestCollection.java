import java.awt.Color;
import java.util.*;
/*
 * Example to arraylist
 */

public class TestCollection{
  private static final String colores[]={"rojo","Verde","Azul","Violeta"};
  
  public static void TextCollection(){
        ArrayList<String> list = new ArrayList<>();
        list.add(Color.MAGENTA);
        for(int i=0; i<colores.length;i++){
            list.add(colores[i]);
        }   
        list.add(Color.CYAN);
        System.out.println("\nArraylist:");
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i)+"");
        }
        eliminarObjetosString(list);
        System.out.println("\nArraylist despues de eliminar: ");

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i)+"");
        }
   }

    private static void eliminarObjetosString(Collection collection){
        Iterator iterador = collection.iterator(); //Obj iterador
        while(iterador.hasNext())
            if(iterador.next()instanceof String)
                iterador.remove();
    }
       
    public static void main(String[] args) {
        TextCollection();
    }
    
}