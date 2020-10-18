
import java.util.ArrayList;
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
public class AFN {
    
    int id;
    Estado edoInicial;
    List<Character> alfabeto;
    List<Estado> edosAceptacion;
    List<Estado> edosAFN;

    public AFN() {
    }

    public AFN(int id, Estado edoInicial, List<Character> alfabeto, List<Estado> edosAceptacion, List<Estado> edosAFN) {
        this.id = id;
        this.edoInicial = edoInicial;
        this.alfabeto = alfabeto;
        this.edosAceptacion = edosAceptacion;
        this.edosAFN = edosAFN;
    }
    
    //-----------------  BLOQUE GET  -----------------
    public int getId() {
        return id;
    }
    
    public Estado getEdoInicial() {
        return edoInicial;
    }

    public List<Character> getAlfabeto() {
        return alfabeto;
    }

    public List<Estado> getEdosAceptacion() {
        return edosAceptacion;
    }

    public List<Estado> getEdosAFN() {
        return edosAFN;
    }
    
    //-----------------  BLOQUE SET  -----------------

    public void setId(int id) {
        this.id = id;
    }

    public void setEdoInicial(Estado edoInicial) {
        this.edoInicial = edoInicial;
    }

    public void setAlfabeto(List<Character> alfabeto) {
        this.alfabeto = alfabeto;
    }

    public void setEdosAceptacion(List<Estado> edosAceptacion) {
        this.edosAceptacion = edosAceptacion;
    }

    public void setEdosAFN(List<Estado> edosAFN) {
        this.edosAFN = edosAFN;
    }
    
    //Metodos
    
    public AFN crearBasico(Character c){
        return new AFN();
    }
    
    public AFN unir(AFN unAFN){
        return new AFN();
    }
    
    public AFN concatenar(AFN unAFN){
        return new AFN();
    }
    
    public AFN cerrarTransitiva(){
      return new AFN();  
    }
    
    public AFN cerrarKleen(){
        return new AFN();
    }
    
    public AFN opcional(){
        return new AFN();
    }
    
    public List<Estado> cerrarEpsilon(List<Estado> estados){
        return new ArrayList<>();
    }
    
    public List<Estado> cerrarEpsilon(Estado unEstado){
        return new ArrayList<>();
    }
    
    public List<Estado> mover(List<Estado> estados, Character simbolo){
        return new ArrayList<>();
    }
    
    public List<Estado> mover(Estado unEstado, Character simbolo){
        return new ArrayList<>();
    }
    
    public  List<Estado> irA(List<Estado> estados, Character simbolo){
        return cerrarEpsilon(mover(estados, simbolo));
    }
    
    public int analizarCadena(String cadena){
        return -1;
    }
    
    public AFD convertirAFN(){
        return new AFD();
    }
    @Override
    public String toString() { 
        return String.format("ID: " + id + "\n" +
                             "Estado inicial: " + edoInicial + "\n" +
                             "Alfabeto: " + alfabeto + "\n" +
                             "Estados de aceptacion: " + edosAceptacion + "\n" +
                             "Estados del ANF: " + edosAFN +"\n" 
        ); 
    }
    
    
}
