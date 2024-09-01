/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */

/*
CuentaRegresiva

+ imprimirParesRegresivos() : : void
*/
public class CuentaRegresiva {

    //+ imprimirParesRegresivos() : : void: imprime todos los numeros pares desde n hasta 2
    public static void CuentaRegresiva(){
        int n = 20;
        
        do{
            if(n % 2 == 0){
                System.out.println(n);
            }
            n--;
        }while(n >= 2);
    }
    
}
