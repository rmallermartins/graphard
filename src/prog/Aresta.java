/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

/**
 *
 * @author rodrigo
 */
public class Aresta {
    
    private Vertice verticeEntrada;
    private Vertice verticeSaida;

    public Aresta(Vertice verticeEntrada, Vertice verticeSaida) {
        this.verticeEntrada = verticeEntrada;
        this.verticeSaida = verticeSaida;
    }

    public Vertice getVerticeEntrada() {
        return verticeEntrada;
    }

    public void setVerticeEntrada(Vertice verticeEntrada) {
        this.verticeEntrada = verticeEntrada;
    }

    public Vertice getVerticeSaida() {
        return verticeSaida;
    }

    public void setVerticeSaida(Vertice verticeSaida) {
        this.verticeSaida = verticeSaida;
    }
    
    
}
