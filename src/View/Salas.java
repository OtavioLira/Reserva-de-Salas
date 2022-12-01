/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author edu
 */
@Entity
@Table(name = "salas", catalog = "information", schema = "")
@NamedQueries({
    @NamedQuery(name = "Salas.findAll", query = "SELECT s FROM Salas s")
    , @NamedQuery(name = "Salas.findBySalaCod", query = "SELECT s FROM Salas s WHERE s.salaCod = :salaCod")
    , @NamedQuery(name = "Salas.findBySalaNome", query = "SELECT s FROM Salas s WHERE s.salaNome = :salaNome")
    , @NamedQuery(name = "Salas.findBySalaLocal", query = "SELECT s FROM Salas s WHERE s.salaLocal = :salaLocal")
    , @NamedQuery(name = "Salas.findBySalaEstado", query = "SELECT s FROM Salas s WHERE s.salaEstado = :salaEstado")})
public class Salas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sala_cod")
    private Integer salaCod;
    @Basic(optional = false)
    @Column(name = "sala_nome")
    private String salaNome;
    @Basic(optional = false)
    @Column(name = "sala_local")
    private String salaLocal;
    @Basic(optional = false)
    @Column(name = "sala_estado")
    private String salaEstado;

    public Salas() {
    }

    public Salas(Integer salaCod) {
        this.salaCod = salaCod;
    }

    public Salas(Integer salaCod, String salaNome, String salaLocal, String salaEstado) {
        this.salaCod = salaCod;
        this.salaNome = salaNome;
        this.salaLocal = salaLocal;
        this.salaEstado = salaEstado;
    }

    public Integer getSalaCod() {
        return salaCod;
    }

    public void setSalaCod(Integer salaCod) {
        Integer oldSalaCod = this.salaCod;
        this.salaCod = salaCod;
        changeSupport.firePropertyChange("salaCod", oldSalaCod, salaCod);
    }

    public String getSalaNome() {
        return salaNome;
    }

    public void setSalaNome(String salaNome) {
        String oldSalaNome = this.salaNome;
        this.salaNome = salaNome;
        changeSupport.firePropertyChange("salaNome", oldSalaNome, salaNome);
    }

    public String getSalaLocal() {
        return salaLocal;
    }

    public void setSalaLocal(String salaLocal) {
        String oldSalaLocal = this.salaLocal;
        this.salaLocal = salaLocal;
        changeSupport.firePropertyChange("salaLocal", oldSalaLocal, salaLocal);
    }

    public String getSalaEstado() {
        return salaEstado;
    }

    public void setSalaEstado(String salaEstado) {
        String oldSalaEstado = this.salaEstado;
        this.salaEstado = salaEstado;
        changeSupport.firePropertyChange("salaEstado", oldSalaEstado, salaEstado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaCod != null ? salaCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salas)) {
            return false;
        }
        Salas other = (Salas) object;
        if ((this.salaCod == null && other.salaCod != null) || (this.salaCod != null && !this.salaCod.equals(other.salaCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Salas[ salaCod=" + salaCod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
