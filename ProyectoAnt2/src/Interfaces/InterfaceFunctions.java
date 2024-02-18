
package Interfaces;

import EDD.Grafo;

/**
 *
 * @author Camila Garcia
 */

//Esta clase tiene los metodos para abrir las interfaces 
public class InterfaceFunctions {
    private static final  Bienvenida paginaprincipal= new Bienvenida(); 
    private static final Menu menu =new Menu();
    private static final CargarTXT cargartxt= new CargarTXT();
    private static final EliminarCiudad eliminarciudad= new EliminarCiudad();
    private static final AgregarCiudad agregarciudad= new AgregarCiudad();
    private static final Simular simulacion = new Simular();
    private static final Mostrar mostragrafo = new Mostrar();
    private static final Guardar guardartxt= new Guardar();
    private static Grafo grafo= new Grafo();

    public static Grafo getGrafo() {
        return grafo;
    }

    public static void setGrafo(Grafo grafo) {
        InterfaceFunctions.grafo = grafo;
    }
    
   
    //Metodo para que la clase de interfaz Bienvenida sea visible al llamar el metodo
    public static void openBienvenida(){
        getBienvenida().setVisible(true);
        
    }
    
    //Metodo para obtener la Bienvenida ya que es un atributo privado
      public static Bienvenida getBienvenida() {
        return paginaprincipal;
    }
    
    //Metodo para que la clase de interfaz Menu sea visible al llamar el metodo
    public static void openMenu() {
        getMenuPrincipal().setVisible(true);
    }
    
    //Metodo para obtener el menu ya que es un atributo privado
      public static Menu getMenuPrincipal() {
        return menu;
    }
     
  //Metodo para que la clase de interfaz CargarTXT sea visible al llamar el metodo 
   public static CargarTXT getCargarTXT(){
       return cargartxt;
   }
    //Metodo para obtener el CargarTXT ya que es un atributo privado
   public static void openCargarTxt(){
       getCargarTXT().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
    //Metodo para que la clase de interfaz EliminarCiudad sea visible al llamar el metodo 
   public static EliminarCiudad getEliminarCiudad(){
       return eliminarciudad;
   }
    //Metodo para obtener el EliminarCiudad ya que es un atributo privado
   public static void openEliminarCiudad(){
       getEliminarCiudad().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
    
    //Metodo para que la clase de interfaz AgregarCiudad sea visible al llamar el metodo 
   public static AgregarCiudad getAgregarCiudad(){
       return agregarciudad;
   }
    //Metodo para obtener el AgregarCiudad ya que es un atributo privado
   public static void openAgregarCiudad(){
       getAgregarCiudad().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
     //Metodo para que la clase de interfaz Simular sea visible al llamar el metodo 
   public static Simular getSimular(){
       return simulacion;
   }
    //Metodo para obtener el Simular ya que es un atributo privado
   public static void openSimular(){
       getSimular().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
     //Metodo para que la clase de interfaz Mostrar sea visible al llamar el metodo 
   public static Mostrar getMostrar(){
       return mostragrafo;
   }
    //Metodo para obtener el Mostrar ya que es un atributo privado
   public static void openMostar(){
       getMostrar().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
     //Metodo para que la clase de interfaz Guardar sea visible al llamar el metodo 
   public static Guardar getGuardar(){
       return guardartxt;
   }
    //Metodo para obtener el Guardar ya que es un atributo privado
   public static void openGuardar(){
       getGuardar().setVisible(true);
       getMenuPrincipal().setVisible(false);
   }
   
   public static void VolverMenu(){
       //Muestro el menu principal
        getMenuPrincipal().setVisible(true);
        //Hago que las ventanas abiertas ya no se muestren
        getCargarTXT().setVisible(false);
        getAgregarCiudad().setVisible(false);
        getEliminarCiudad().setVisible(false);
        getGuardar().setVisible(false);
        getMostrar().setVisible(false);
        getSimular().setVisible(false);
   }
       
}
