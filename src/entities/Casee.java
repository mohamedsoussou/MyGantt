/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Aimad.JAOUHAR
 */
@Entity
public class Casee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int numCase;
    private int numOrdre;
    @ManyToOne
    private Exploitation exploitation;
    @ManyToOne
    private Niveau niveauPre;
    @ManyToOne
    private Tranche tranche;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tranche getTranche() {
        return tranche;
    }

    public void setTranche(Tranche tranche) {
        this.tranche = tranche;
    }

    public int getNumCase() {
        return numCase;
    }

    public void setNumCase(int numCase) {
        this.numCase = numCase;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
    }

    public Exploitation getExploitation() {
        return exploitation;
    }

    public void setExploitation(Exploitation exploitation) {
        this.exploitation = exploitation;
    }

    public Niveau getNiveauPre() {
        return niveauPre;
    }

    public void setNiveauPre(Niveau niveauPre) {
        this.niveauPre = niveauPre;
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
        if (!(object instanceof Casee)) {
            return false;
        }
        Casee other = (Casee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return numCase+"";
    }

}
