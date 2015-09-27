/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author VIAC
 */
public class Circunferencia {
    private int radio;
    private int diametro;

    public Circunferencia() {
    }

    public Circunferencia(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }
    
    
    
}
