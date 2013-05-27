/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

/**
 *
 * @author rodrigo
 */
public class Vertice {
    
    private Integer numeroVertice;
    private Integer coordX;
    private Integer coordY;

    public Vertice(Integer numeroVertice, Integer coordX, Integer coordY) {
        this.numeroVertice = numeroVertice;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public Integer getNumeroVertice() {
        return numeroVertice;
    }

    public void setNumeroVertice(Integer numeroVertice) {
        this.numeroVertice = numeroVertice;
    }

    public Integer getCoordX() {
        return coordX;
    }

    public void setCoordX(Integer coordX) {
        this.coordX = coordX;
    }

    public Integer getCoordY() {
        return coordY;
    }

    public void setCoordY(Integer coordY) {
        this.coordY = coordY;
    }
    
    
}
