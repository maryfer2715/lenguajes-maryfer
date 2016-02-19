/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.ImputOutput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author T-101
 */
public class MiPrimeraConexion {
    public static void main(String[] args)throws Exception{
       
  URL url=new 
        URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();//leerlo
        InputStreamReader isr=new InputStreamReader(input);//abrir la conexion y empezar a leeer
        BufferedReader reader=new BufferedReader(isr);//buffer:acumula lo qyue va leyendo
     
        String lineaActual="No ha leido nada";
        
        boolean encontrado=false;
        int miLinea=0;
         while((lineaActual=reader.readLine())!=null){
              
             if(encontrado && miLinea<=0){
                 //vamos a despedazar la linea ..puro dato de temperatura
                int indice=  lineaActual.indexOf(">");
                int indice2= lineaActual.indexOf("</");
                String tempActual=lineaActual.substring(indice+1, indice2);
                 
                 
                 System.out.println(tempActual); 
                 miLinea++;
             }
             if(lineaActual.contains("Outside Temp")){
                   
                 encontrado=true;
              
                 System.out.println("DATO ENCONTRADO!");
                 
             }

               }
           
         
            }
         
      
          }
         
              