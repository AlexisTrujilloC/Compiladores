
import java.util.ArrayList;
import java.util.Iterator;
  import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brando Sanchez
 */
public class Transicion {
    
    Character simbolo;
    List<Estado> edosDestinos = new ArrayList<>();

    public Transicion(char simbolo) {
        this.simbolo = simbolo;
    }

    public Transicion() {

    }
    
    public void agregarDestino(Estado destino){
        edosDestinos.add(destino);
    }
    
    public List<Estado> getEdosDestinos() {
        return edosDestinos;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setEdosDestinos(List<Estado> edosDestinos) {
        this.edosDestinos = edosDestinos;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }
    
    private List<Integer> getIdEdos(){
        List<Integer> idEdos = new ArrayList<>();
        
        for (Iterator<Estado> iterator = edosDestinos.iterator(); iterator.hasNext();) {
            idEdos.add( iterator.next().getId() );
        }
        return idEdos;
    } 
    @Override
    public String toString() {
        return "\n\t\tSimbolo: " + simbolo + ", Estados Destinos: " + getIdEdos().toString();
    }
    
    
    
}
