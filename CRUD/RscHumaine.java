/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Hamdi
 */
@Entity
@Table(name = "rsc_humaine", catalog = "sakila", schema = "")
@NamedQueries({
    @NamedQuery(name = "RscHumaine.findAll", query = "SELECT r FROM RscHumaine r"),
    @NamedQuery(name = "RscHumaine.findById", query = "SELECT r FROM RscHumaine r WHERE r.id = :id"),
    @NamedQuery(name = "RscHumaine.findByNom", query = "SELECT r FROM RscHumaine r WHERE r.nom = :nom"),
    @NamedQuery(name = "RscHumaine.findByCin", query = "SELECT r FROM RscHumaine r WHERE r.cin = :cin"),
    @NamedQuery(name = "RscHumaine.findByBureau", query = "SELECT r FROM RscHumaine r WHERE r.bureau = :bureau"),
    @NamedQuery(name = "RscHumaine.findByNoTel", query = "SELECT r FROM RscHumaine r WHERE r.noTel = :noTel"),
    @NamedQuery(name = "RscHumaine.findByAdresse", query = "SELECT r FROM RscHumaine r WHERE r.adresse = :adresse")})
public class RscHumaine implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "cin")
    private Integer cin;
    @Column(name = "bureau")
    private String bureau;
    @Column(name = "no_tel")
    private Integer noTel;
    @Column(name = "adresse")
    private String adresse;

    public RscHumaine() {
    }

    public RscHumaine(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        String oldNom = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldNom, nom);
    }

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        Integer oldCin = this.cin;
        this.cin = cin;
        changeSupport.firePropertyChange("cin", oldCin, cin);
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        String oldBureau = this.bureau;
        this.bureau = bureau;
        changeSupport.firePropertyChange("bureau", oldBureau, bureau);
    }

    public Integer getNoTel() {
        return noTel;
    }

    public void setNoTel(Integer noTel) {
        Integer oldNoTel = this.noTel;
        this.noTel = noTel;
        changeSupport.firePropertyChange("noTel", oldNoTel, noTel);
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        String oldAdresse = this.adresse;
        this.adresse = adresse;
        changeSupport.firePropertyChange("adresse", oldAdresse, adresse);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RscHumaine)) {
            return false;
        }
        RscHumaine other = (RscHumaine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CRUD.RscHumaine[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
