/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpc_biba;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {
    private ServerSocket serverSocket; 
    private Socket clientSocket; 
    private int porta;
    
    
   
   
    public Server(int porta) {
        this.porta = porta;
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Server in ascolto sulla porta: " + porta);
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Server non in ascolto");
        }
    }
    
    public Socket attendi(){
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientSocket;
    }
    public void close(){
        if (clientSocket != null) {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Errore in chiusura del socket");
            }
        }


    }

    public void termina(){

    }

    public void leggi(){

    }

    public void scrivi(){

    }


   
}
