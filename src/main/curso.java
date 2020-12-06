/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Marcos
 */
public class curso {
    private String idioma;
    private double preco;
    private boolean brinde;
    private boolean material;

    public curso(String idioma, double preco, boolean brinde, boolean material) {
        this.idioma = idioma;
        this.preco = preco;
        this.brinde = brinde;
        this.material = material;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setBrinde(boolean brinde) {
        this.brinde = brinde;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public String getIdioma() {
        return idioma;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isBrinde() {
        return brinde;
    }

    public boolean isMaterial() {
        return material;
    }
    
    public Object obterDados()
    {
        return new Object[]{idioma, preco, brinde, material};
    }
}
