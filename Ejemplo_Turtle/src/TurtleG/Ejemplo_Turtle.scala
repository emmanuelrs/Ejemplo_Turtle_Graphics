package TurtleG
/************************************************
 * 
 * Ejemplo básico Turtle Graphics.
 *  
 * Este programa utiliza 2 tortugas las cuales 
 * generan un cuadrado, cada tortuga realizando
 * una tarea diferente.
 * 
 * Entrada: Ninguna.
 * 
 * Salida: Figura hecha en Turtle Graphics
 * 
 * Restricciones: Ninguna.
 * 
 ***********************************************/

// Importe de bibliotecas

import java.awt.Color._
import ch.aplu.turtle._

object Ejemplo_Turtle extends App {
  
  def main() = {
    
    /* La función main es la encargada de
    / realizar las llamadas a las funciones
    / respectivas para la ejecución del programa.*/
    
    creaTortugas()
    
    
     
  }
  
  def creaTortugas() = {
    /*Esta función crea las tortugas
     que vamos a utilizar en la
     ejecución del programa.
     demás de colocarles el color a cada una */
    
    val leonardo = new Turtle()
    
    //Para crear las dos tortugas en la misma ventana
    // la segunda tortuga que creamos le pasamos como
    // párametro en la función new Turtle el nombre
    // de la primera tortuga creada
    
    val donatello = new Turtle(leonardo)
    
    leonardo.setColor(green)
    leonardo.setPenColor(blue)
    leonardo.setPos(100,0)
    
    donatello.setColor(red)
    donatello.setPenColor(yellow)   
    
    cuadraro(leonardo, donatello)
    
  }
  
  def cuadraro(leonardo :Turtle,donatello: Turtle) = {
    // Esta función utiliza la función quadrat
    // para crear el cuadrado utilizando las 
    // dos tortugas.
    
    for( i <- 0 until 5){
      // Crea un cuadrado de cuadrados
      quadrat(leonardo)
      leonardo.forward(30)
      // Crea otro cuadrado de cuadrados.
      quadrat(donatello)
      donatello.forward(30)
    }
    
  }
  
  def quadrat(tortuga: Turtle) = {
    /*
     * Esta función recibe como parámetro una
     * tortuga y genera un cuadrado
     */
      for( i <- 0 until 5){
        
        tortuga.forward(30)
        tortuga.right(90)
        
      }
  }
  
main()

}
