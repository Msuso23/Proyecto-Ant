
package EDD;

/**
 *
 * @author Camila Garcia
 */
public class MatrizAdyacente {
    private int numeroVertices;
    private int matriz [][];
    
    
    //Constructor
    public MatrizAdyacente(int numeroVertices) {
        this.numeroVertices = numeroVertices;
        this.matriz = new int [numeroVertices][numeroVertices];
    }

    
    //Getters y Setters
    public int getNumeroVertices() {
        return numeroVertices;
    }

    public void setNumeroVertices(int numeroVertices) {
        this.numeroVertices = numeroVertices;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    
    //Metodo que sirve para agregar nuevos bordes en el grafo
    public void agregarBordes (int desde, int hasta, int tamano){
        matriz[desde][hasta]=tamano;
    }
    
    //Metodo para imprimir la matriz
    public void ImprimirMatriz(){
        for (int i = 0; i < getNumeroVertices(); i++) {
            for (int j = 0; j < getNumeroVertices(); j++) {
                System.out.println(matriz[i][j]+" ");             
            }
            System.out.println("");  
        }
    }
    
    //Metodo para tomar los bordes del grafo
    public void getBordes(){
        int origen=0;
        int destino=1;
        int tam=1;
        
        for (int i = 0; i < getNumeroVertices(); i++) {
            agregarBordes(origen,destino,tam);
            origen++;
            if(origen==(getNumeroVertices()-1)){
                destino=0;
            }else{
                destino+=1;
            }
              tam+=2;         
        }
    }
      
        
    
    
    
    
    
}
