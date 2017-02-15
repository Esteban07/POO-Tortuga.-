
import ch.aplu.turtle.Turtle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esteban
 */
public class Tortuga_clase5 {
private Turtle b;

public Tortuga_clase5(){
    this.b = new Turtle ();
}

 public static void main(String[] args) {
     Tortuga_clase5 e = new Tortuga_clase5 ();
     e.cuadrado();
 }
 
  public void cuadrado(){
      
      for(int i=0; i<32; i=i+1){
      b.forward(100);
      b.right(90);
      }
  }
  }
      
      /*}*/
   
