/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdatos;

import java.io.*;
/**
 *
 * @author LABORATORIOS IES
 */
public class Tlectura {
    private InputStreamReader isr = new InputStreamReader(System.in);
    private BufferedReader br = new BufferedReader(isr);
    private String cadena;
    
    public int LeerEntero(){
        int dato = 0;
        
        try{
            cadena = br.readLine();
            dato = Integer.parseInt(cadena);
        }
        catch(IOException e){}
        return dato;
    }//Fin LeerEntero
    
    
} //Fin clase Tlectura
