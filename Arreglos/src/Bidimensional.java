import java.util.Scanner;
public class Bidimensional
  public static void main(String [] args){
    
    Scanner lector=new Scanner(System.in);
 // solo se le indica la cantidad de fila.
 
    int MatrizB[][]={
        {1,2},
    {2,4} 
};
System.out.println("Cantidad fila :");
int cantFila= lector.nextInt();
System.out.println("Cantidad Columna");
   int cantColumnas = lector.nextInt();
   int [][] MatrizA= new int[cantFila][cantColumnas];
   System.out.println("Ingrese los elmentos de la matriz A");
   for(int i =0; i< MatrizA.length;i++){
    for(int j=0;j<MatrizA[i].length;j++){
        System.out.println("ArregloA[");

    }

}
   

 
 
 
 
 
 
    lector.close();
 }
}