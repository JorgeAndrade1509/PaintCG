/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_comp_grafica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author jorgeandrade
 */




public class Metodos {

    //Variables para el metodo DDA
        float xi,yi,xf,yf;
        float deltax,deltay,k;
        float xinc,yinc;
       
        
         //Obtener colores random
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        
        //arreglo para guarda puntos en X y puntos en Y
        int[] puntosx=new int[200];
        int[] puntosy=new int[200];
        int px=0,py=0;
    
    public void DDA(Graphics t,int x1, int y1, int x2, int y2){
        
        //comienza el metodo DDA-----------------------------------------
        deltax=x2-x1;
        deltay=y2-y1;
        
        if (Math.abs(deltax) > Math.abs(deltay)){
        k=Math.abs(deltax);
        }
        else if (Math.abs(deltay) > Math.abs(deltax)){
            k=Math.abs(deltay);
        }
        else
        {
            k=Math.abs(deltax);
        }
        
        xinc=deltax/k;
        yinc=deltay/k;
       
       
     if(deltax>= 0 && deltay>= 0 )
     {
        if (deltax != 0 && deltay !=0){
            System.out.print("parte 1");
                yi=y1;
            for(xi=x1;xi<=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                yi=yi+yinc;
                
             
            } 
        }
        else if ( deltax == 0){
            System.out.print("parte 2");
            xi=x1;
            for(yi=y1;yi<=y2;yi=yi+yinc){

                yf=yi+yinc;
                xf=xi+xinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                xi=xi+xinc;
                
                
            } 
        }
        else if ( deltay == 0){
            System.out.print("parte 3");
            yi=y1;
            for(xi=x1;xi<=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                yi=yi+yinc;
                
               
            } 
        }
     }
     else{
        if (deltax != 0 && deltay !=0 && deltay>deltax){
            System.out.print("parte 4");
                yi=y1;
            for(xi=x1;xi>=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                yi=yi+yinc;
                
                
            } 
        }
        else if (deltax != 0 && deltay !=0 && Math.abs(deltay)>Math.abs(deltax)){
            System.out.print("parte 9");
                xi=x1;
            for(yi=y1;yi>=y2;yi=yi+yinc){

                yf=yi+yinc;
                xf=xi+xinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                xi=xi+xinc;
                
                
            } 
        }
        else if (deltax != 0 && deltay !=0 && deltax>deltay){
            System.out.print("parte 5");
                yi=y1;
            for(xi=x1;xi<=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                yi=yi+yinc;
                
                
            } 
        }
        else if ( deltax == 0){
            System.out.print("parte 6");
            xi=x1;
            for(yi=y1;yi>=y2;yi=yi+yinc){  //yinc es negativo aqui

                yf=yi-yinc;
                xf=xi-xinc;


                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                xi=xi-xinc;
                
                
            } 
        }
        else if ( deltay == 0){
            System.out.print("parte 7");
            yi=y1;
            for(xi=x1;xi>=x2;xi=xi+xinc){ //xinc es negativo aqui

                xf=xi-xinc;
                yf=yi-yinc;

                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                yi=yi-yinc;
                
               
            } 
        }
        else if(deltax == deltay ){
            System.out.print("parte 8");
            yi=y1;
            for(xi=x1;xi>=x2;xi=xi+xinc){ //xinc es negativo aqui

                xf=xi+xinc;
                yf=yi+yinc;

                t.drawLine(Math.round(xi), Math.round(yi), Math.round(xf), Math.round(yf));
                t.setColor(randomColor.brighter());
                yi=yi+yinc;
                
                
            } 
            }
           
            
        }
     
     
     //Termina el metodo DDA-----------------------------------------
    }
    
    public int[] puntosenx(){
        return puntosx;
    }
    public int[] puntoseny(){
        return puntosy;
    }
    
    public void ObtenerPuntos(Graphics t,int x1, int y1, int x2, int y2){
        
        //comienza el metodo DDA-----------------------------------------
        deltax=x2-x1;
        deltay=y2-y1;
        
        if (Math.abs(deltax) > Math.abs(deltay)){
        k=Math.abs(deltax);
        }
        else if (Math.abs(deltay) > Math.abs(deltax)){
            k=Math.abs(deltay);
        }
        else
        {
            k=Math.abs(deltax);
        }
        
        xinc=deltax/k;
        yinc=deltay/k;
       
       
     if(deltax>= 0 && deltay>= 0 )
     {
        if (deltax != 0 && deltay !=0){
            System.out.print("parte 1");
                yi=y1;
            for(xi=x1;xi<=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


               
                yi=yi+yinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if ( deltax == 0){
            System.out.print("parte 2");
            xi=x1;
            for(yi=y1;yi<=y2;yi=yi+yinc){

                yf=yi+yinc;
                xf=xi+xinc;


               
                xi=xi+xinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if ( deltay == 0){
            System.out.print("parte 3");
            yi=y1;
            for(xi=x1;xi<=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


               
                yi=yi+yinc;
                
               puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
     }
     else{
        if (deltax != 0 && deltay !=0 && deltay>deltax){
            System.out.print("parte 4");
                yi=y1;
            for(xi=x1;xi>=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


                
                yi=yi+yinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if (deltax != 0 && deltay !=0 && Math.abs(deltay)>Math.abs(deltax)){
            System.out.print("parte 9");
                xi=x1;
            for(yi=y1;yi>=y2;yi=yi+yinc){

                yf=yi+yinc;
                xf=xi+xinc;


               
                xi=xi+xinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if (deltax != 0 && deltay !=0 && deltax>deltay){
            System.out.print("parte 5");
                yi=y1;
            for(xi=x1;xi<=x2;xi=xi+xinc){

                xf=xi+xinc;
                yf=yi+yinc;


                
                yi=yi+yinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if ( deltax == 0){
            System.out.print("parte 6");
            xi=x1;
            for(yi=y1;yi>=y2;yi=yi+yinc){  //yinc es negativo aqui

                yf=yi-yinc;
                xf=xi-xinc;


              
                xi=xi-xinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if ( deltay == 0){
            System.out.print("parte 7");
            yi=y1;
            for(xi=x1;xi>=x2;xi=xi+xinc){ //xinc es negativo aqui

                xf=xi-xinc;
                yf=yi-yinc;

              
                yi=yi-yinc;
                
               puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
        }
        else if(deltax == deltay ){
            System.out.print("parte 8");
            yi=y1;
            for(xi=x1;xi>=x2;xi=xi+xinc){ //xinc es negativo aqui

                xf=xi+xinc;
                yf=yi+yinc;

               
                yi=yi+yinc;
                
                puntosx[px]=Math.round(xi);
                puntosy[py]=Math.round(yi);
                px++;
                py++;
            } 
            }
           
            
        }
     
     
     //Termina el metodo DDA-----------------------------------------
    }
    
}
