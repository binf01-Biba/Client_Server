/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpc_biba;


import java.io.IOException;
import java.net.Socket;
import java.net.*;
import java.io.*;
public class Client {


    public String nome;
    private Socket socket;

    public Client(String nome) {
        this.nome = nome;
    }

    public void connetti(String nome, int port) {
        try {
            this.socket = new Socket(nome, port);
            System.out.println("Connessione aperta!");
        }
        catch(ConnectException e){
            System.err.println("Server non disponibile!");
        }
        catch (IOException e) {
            System.err.println("Errore di I/O");
        }
    }

    public void scrivi(){

    }

    public void chiudi(){
        try {
            socket.close();
            System.out.println("Connessione chiusa!");
        } catch (IOException e) {
            System.err.println("Errore nella chiusuara del socket!");
        }
    }

}