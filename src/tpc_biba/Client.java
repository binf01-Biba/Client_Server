/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpc_biba;


import java.io.IOException;
import java.net.Socket;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[34m";
    public String nome;
    public String colore;
    private Socket socket;
    int port = 1906;
    InetAddress serverAddress;
    InputStream is;
    OutputStream os;
    Scanner streamIn = null;
    String messaggioIn, messaggioOut;
    PrintWriter streamOut = null;


    public Client(String nome) {
        this.nome = nome;

    }

    public void connetti(String nome, int port) {
        try {
            this.socket = new Socket(nome, port);
            System.out.println("Connessione aperta!");
            os = socket.getOutputStream();
            streamOut = new PrintWriter(os);
            is = socket.getInputStream();
            streamIn = new Scanner(is);
        }
        catch(IOException e){
            System.err.println(e);
        }
    }

    public void scrivi() throws IOException{
        messaggioOut = "Eccomi";
        streamOut.println(messaggioOut);
        streamOut.flush();


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