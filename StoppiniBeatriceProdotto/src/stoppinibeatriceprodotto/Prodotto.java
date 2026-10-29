/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stoppinibeatriceprodotto;

import java.util.Objects;

/**
 * 
 * @author stoppini.beatrice
 */
public class Prodotto {
    private String nome;
    private double peso;
    private float prezzo;
    private int numeroPezziPresenti;
    
/**
 * motedo costruttore
 * @param nome nome del prodotto
 * @param peso peso del prodotto
 * @param prezzo prezzo del prodotto
 * @param numeroPezziPresenti numero di pezzi presenti di quello specifico rodotto
 */
    public Prodotto(String nome, double peso, float prezzo, int numeroPezziPresenti){
        this.nome=nome;
        this.peso=peso;
        this.prezzo=prezzo;
        this.numeroPezziPresenti=numeroPezziPresenti;
    }
    
    /**
     * metodo di tipo void che calcola e decrementa il numero tatale di pezzi a seconda del numero inserito dall'utente
     * @param quantitaDaVendere numero intero inserito dall'utente che mi indica quanti prodotti l'utente vende
     */
    public void vendiProdotto(int quantitaDaVendere){
        if (numeroPezziPresenti>0&&quantitaDaVendere<=numeroPezziPresenti&&quantitaDaVendere>0) numeroPezziPresenti=numeroPezziPresenti-quantitaDaVendere;
        else if (quantitaDaVendere>numeroPezziPresenti) numeroPezziPresenti=numeroPezziPresenti;
    }
    
    /**
     * metodo di tipo void che calcola e incrementa il numero totale di pezzi a seconda del numero inserito dall'utente
     * @param quantitaDaRifornire numero intero inserito dall'utente che mi indica quanti prodotti l'utente rifornisce
     */
    public void rifornisci(int quantitaDaRifornire){
        numeroPezziPresenti=numeroPezziPresenti+quantitaDaRifornire;
    }
    
    /**
     * metodo toString che ritorna un messaggio
     * @return messaggio che contiene tutte le informazioni del prodotto
     */
    @Override
    public String toString(){
        return "-----------------------------------\nNome del prodotto scelto: "+nome+"\nPeso del prodotto: "+peso+" grammi\nPrezzo del prodotto: "+prezzo+" euro\nNumero totale di pezzi presenti: "+numeroPezziPresenti;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prodotto other = (Prodotto) obj;
        return Objects.equals(this.nome, other.nome);
    }
}
