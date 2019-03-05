
package soluciuon.parcial;

import java.util.Scanner;




public class SoluciuonParcial {

    
    
   
    public static void main(String[] args) {
        
        //variables
        int i, j,tasociado; 
        int tgeneral = 0;
        String stock, precio ;
        Scanner scn = new Scanner(System.in);
        String [][] matri = new String [10][4];
        
        //llenado de la matriz
        for(i = 0; i<matri.length ; i++){
        //Ingreso de los nombres en la matriz
        System.out.print("Ingrese el nombre del producto: ");
        matri[i][0] = scn.next();
        //Ingreso de los prodcutos en la matriz
        System.out.print("Ingrese el stock del producto: ");
        matri[i][1] = scn.next();
        stock = matri[i][1];
        //Ingreso de los precios en la matriz
        System.out.print("Ingrese el precio del producto: ");
        matri[i][2] = scn.next();
        precio = matri[i][2];
        
        //Conversion de las varibales a entero para poder operar las y despues se guardan
        //En una variable String para que pueda ser ingresada en la matiz 
        int stockint = Integer.parseInt(stock);  
        int precioint = Integer.parseInt(precio);  
        tasociado = (stockint*precioint);
        String tasociado2 = Integer.toString(tasociado);
        matri[i][3] = tasociado2;
        
        tgeneral += tasociado;

        }
       //Impresion de la matriz
        for(i = 0; i< matri.length ; i++){
            for(j= 0; j<matri.length; j++){
           System.out.print("\n\t--- Producto " +(i+1)+":  ");
           System.out.print(""+matri[i][j]);
            }
        }
         System.out.print("\n\t");
            System.out.print("\n\t");
            //Impresion del total general
               System.out.print("\n\t--- Total general: "+tgeneral);
        
        
        
        
    }
    
    
    
    
  
    
}
