/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpc_biba;


import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {
        Client cl = new Client("Arli");
        cl.connetti("localhost",2000);
        cl.scrivi();
        cl.chiudi();
    }

}
