import java.util.Map;
import java.util.HashMap;

public class Controlador {

    private static Map<Integer, String> mapa = new HashMap();

    public static void adicionarAoMapa(Integer idCabide, String modelo){
        mapa.put(idCabide, modelo);
    }

    private static Integer retornaCabidePorRoupa(String modelo){
        for(Integer i : mapa.keySet()){
          if(mapa.get(i).equals(modelo)){
              return i;
          }
      }return -1;
    }

    public static void mostraCabidePorRoupa(String modelo){
        System.out.println("Cabide de " + modelo + " : " + retornaCabidePorRoupa(modelo));
    }

    private static String retornaRoupaPorCabide(int idCabide){
       return mapa.get(idCabide);
    }

    public static void liberaCabide(String modeloRoupa) {
        mapa.remove(retornaCabidePorRoupa(modeloRoupa));
    }

    public static void liberaCabide(Integer idCabide) {
        mapa.remove(idCabide);
    }

    public static void mostraMapa(){
        if(mapa.isEmpty()){
            System.out.println("Vazio");
        }else{
            for(Integer i : mapa.keySet()){
                System.out.println("IdCabide: " + i + "; Modelo: " + mapa.get(i));
            }
        }
    }

}
