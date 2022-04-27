/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author LaptopHp
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        info data = new info ("Chan","ISC","0313");
        String datos = data.getNombre()+"\n"+data.getCarrera()+"\n"+data.getMatricula()+" ";
       System.out.println("********informacion del alumno********");
        System.out.printf(datos);
    }
    
}
