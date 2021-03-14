/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence;

/**
 *
 * @author GAMES
 */
public class Guru extends Parent{
    
    void displaySuper(){
        System.out.println("nama : "+ super.nama);
        System.out.println("mapel : "+ this.mapel );
    }
    
}
