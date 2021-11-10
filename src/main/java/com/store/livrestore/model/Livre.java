package com.store.livrestore.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Livre implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false, unique = true)
    private String isban;
    private String titre;
    private String auteur;
    private String description;
    private double prix;
    private String photoUrl;
    private String categorie;
    private Integer note;

    public Livre() {
    }

    public Livre(Long id, String isban, String titre, String auteur, String description, double prix, String photoUrl, String categorie, Integer note) {
        this.id = id;
        this.isban = isban;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
        this.prix = prix;
        this.photoUrl = photoUrl;
        this.categorie = categorie;
        this.note = note;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsban() {
        return isban;
    }

    public void setIsban(String isban) {
        this.isban = isban;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", isban='" + isban + '\'' +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                ", photoUrl='" + photoUrl + '\'' +
                ", categorie='" + categorie + '\'' +
                ", note=" + note +
                '}';
    }
}
