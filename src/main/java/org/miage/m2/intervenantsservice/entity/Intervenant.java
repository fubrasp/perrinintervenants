package org.miage.m2.intervenantsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bertran95u on 11/09/2017.
 */
@Entity
@AllArgsConstructor
// Obliger de mettre un constructeur vide (ici longbok)
@NoArgsConstructor // obligatoire pour JPA
// Getteurs, Setteurs
@Data
public class Intervenant implements Serializable {

    @Id
    private String id;
    private String nom;
    private String prenom;
    private String commune;
    private String codepostal;

    public Intervenant(String nom, String prenom, String ville, String codepostal) {
        this.nom=nom;
        this.prenom=prenom;
        this.commune=ville;
        this.codepostal=codepostal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(String codepostal) {
        this.codepostal = codepostal;
    }
}
