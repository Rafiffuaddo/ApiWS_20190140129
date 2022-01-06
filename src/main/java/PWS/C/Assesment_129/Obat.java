/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PWS.C.Assesment_129;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "obat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Obat.findAll", query = "SELECT o FROM Obat o"),
    @NamedQuery(name = "Obat.findByIdObat", query = "SELECT o FROM Obat o WHERE o.idObat = :idObat"),
    @NamedQuery(name = "Obat.findByNamaObat", query = "SELECT o FROM Obat o WHERE o.namaObat = :namaObat"),
    @NamedQuery(name = "Obat.findByHarga", query = "SELECT o FROM Obat o WHERE o.harga = :harga"),
    @NamedQuery(name = "Obat.findByExpired", query = "SELECT o FROM Obat o WHERE o.expired = :expired"),
    @NamedQuery(name = "Obat.findByJumlah", query = "SELECT o FROM Obat o WHERE o.jumlah = :jumlah")})
public class Obat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Obat")
    private Integer idObat;
    @Column(name = "Nama_Obat")
    private String namaObat;
    @Column(name = "Harga")
    private String harga;
    @Column(name = "Expired")
    private String expired;
    @Column(name = "Jumlah")
    private String jumlah;

    public Obat() {
    }

    public Obat(Integer idObat) {
        this.idObat = idObat;
    }

    public Integer getIdObat() {
        return idObat;
    }

    public void setIdObat(Integer idObat) {
        this.idObat = idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idObat != null ? idObat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obat)) {
            return false;
        }
        Obat other = (Obat) object;
        if ((this.idObat == null && other.idObat != null) || (this.idObat != null && !this.idObat.equals(other.idObat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PWS.C.Assesment_129.Obat[ idObat=" + idObat + " ]";
    }
    
}
