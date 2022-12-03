package proyecto.pkg2.kg;

/**
 *
 * @author Kendo
 */
public class Cola {
    
        
    // Atributos
    private static final int MaxSize = 3; //Variable para le tamaño de la cola.
    private static int front; //PRIMERA ESPACIO
    private static int last; //ULTIMO ESPACIO
    private int []cola; //LISTA DE COLA
    
 public Cola()
 {
    front = 0;
    last = -1;
    cola = new int [MaxSize];
 }   
 
 public void insertar(int elemento)throws Exception
 {
     if (!Colallena())
         cola[++last] = elemento;
    else
         throw new Exception("LA COLA ESA LLENA");
 }
 
  public int eliminar()throws Exception
 {
     if (!ColaVacia())
       return cola[front++];
    else
      throw new Exception("LA COLA ESTA VACIA");
 }

  public void Borrartodo()
  {
     front = 0;
     last = -1;
  }
  
  public int frente() throws Exception
  {
      if (!ColaVacia()) 
          return cola[front];
      else
     throw new Exception("LA COLA ESTA VACIA");
  }
  
 //CONSTRUCTOR PARA LA AVISAR QUE LA COLA ESTA LLENA
 public boolean Colallena()
 {
   return last == MaxSize - 1;
 }
 
 public boolean ColaVacia()
 {
   return front > last;
 }
}
