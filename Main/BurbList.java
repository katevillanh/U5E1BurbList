
package Main;

import java.util.ArrayList;
import java.util.List;

public class BurbList {

    public static void main(String[] args) {
       List <Integer> arreglo=new ArrayList<Integer>();
       //List <Integer> arreglo2=new ArrayList<Integer>();
       //{9,1,4,3,10,7,5};
        arreglo.add(9);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(3);
        arreglo.add(10);
        arreglo.add(7);
        arreglo.add(5);
        arreglo.add(5);
        
        System.out.println("Lista desordenada: ");
        for(int i=0;i<arreglo.size();i++){
            System.out.print(" "+arreglo.get(i));
        }
        for(int i=0;i<arreglo.size()-1;i++){
            for(int j=0;j<arreglo.size()-1;j++){
                //int a=arreglo.get(j);
                //int b=arreglo.get(j+1);
              if(arreglo.get(j)>arreglo.get(j+1)){
                  int auxiliar=arreglo.get(j+1);
                  //System.out.println(auxiliar);
                  //arreglo[j+1]=arreglo[j];
                  arreglo.set((j+1), arreglo.get(j));
                  arreglo.set(j ,auxiliar);
              }
            }
        }
        System.out.println("");
        System.out.println("Lista ordenada: ");
        for(int i=0;i<arreglo.size();i++){
            System.out.print(" "+arreglo.get(i));
        }
    }
    
}
