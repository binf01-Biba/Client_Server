/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpc_biba;


public class MainClient {
    public static void main(String[] args){
        Client cl = new Client("Arli");
        cl.connetti("localhost",2000);
        cl.scrivi();
        cl.chiudi();
    }

}
