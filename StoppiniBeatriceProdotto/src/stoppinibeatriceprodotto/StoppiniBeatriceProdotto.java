/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stoppinibeatriceprodotto;

/**
 *
 * @author stoppini.beatrice
 */
public class StoppiniBeatriceProdotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    // FILA A
    //Creazione del primo prodotto
    Prodotto p1;
    p1=new Prodotto("pasta", 400, 2, 10);
    //Stampa del messaggipo iniziale, quello senza modifiche
    System.out.println(p1.toString());
    //Chiamata al metodo vendiProdotto
    p1.vendiProdotto(5);
    //Stampa del messaggio dopo le modifiche
    System.out.println(p1.toString());
    //Chiamata al metodo rifornisci
    p1.rifornisci(24);
    //Stampa del messaggio dopo le modifiche
    System.out.println(p1.toString());
    //Creazione del secondo prodotto
    Prodotto p2;
    p2=new Prodotto("tonno", 250, 6, 12);
    //Stampa del messaggipo iniziale, quello senza modifiche
    System.out.println(p2.toString());
    //Chiamata al metodo vendiProdotto
    p2.vendiProdotto(23);
    //Stampa del messaggio dopo le modifiche
    System.out.println(p2.toString());
    //Chiamata al metodo rifornisci
    p2.rifornisci(16);
    //Stampa del messaggio dopo le modifiche
    System.out.println(p2.toString());
    //Chiamata al metodo equals e confronto tra i due prodotti
    System.out.println("-----------------------------------\nI due prodotti da te scelti sono uguali? "+p1.equals(p2));
    } 
}
