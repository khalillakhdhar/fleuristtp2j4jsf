/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fleuriste;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Fleurs {
    String type,couleur;
     double prix;
    static double totale=0;
    static List<Fleurs> bouquet=new ArrayList<Fleurs>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    public List<Fleurs> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Fleurs> bouquet) {
        this.bouquet = bouquet;
    }
    public String add()
    {
        this.bouquet.add(this);
        totale+=this.prix;
        return "index.xhtml?faces-redirect=true";
       
    
    
    }
    
    
    
}
