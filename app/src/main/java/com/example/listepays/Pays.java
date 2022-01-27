package com.example.listepays;

public class Pays
{
    private String nom;
    private int drapeau;
    private int superficie;
    private String capital;
    private int photo;

    public Pays(String nom, int drapeau, int superficie, String capital, int photo) {
        this.nom = nom;
        this.drapeau = drapeau;
        this.superficie = superficie;
        this.capital = capital;
        this.photo = photo;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDrapeau() {
        return drapeau;
    }

    public void setDrapeau(int drapeau) {
        this.drapeau = drapeau;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }



}
