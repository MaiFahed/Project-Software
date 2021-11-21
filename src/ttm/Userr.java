/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttm;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Google Tceh
 */
@Entity
@Table(name = "USERR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userr.findAll", query = "SELECT u FROM Userr u")
    , @NamedQuery(name = "Userr.findByUserId", query = "SELECT u FROM Userr u WHERE u.userId = :userId")
    , @NamedQuery(name = "Userr.findByFirstName", query = "SELECT u FROM Userr u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "Userr.findByMidName", query = "SELECT u FROM Userr u WHERE u.midName = :midName")
    , @NamedQuery(name = "Userr.findByLastName", query = "SELECT u FROM Userr u WHERE u.lastName = :lastName")})
public class Userr implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private BigDecimal userId;
    @Basic(optional = false)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MID_NAME")
    private String midName;
    @Basic(optional = false)
    @Column(name = "LAST_NAME")
    private String lastName;
    @JoinColumn(name = "EMAIL", referencedColumnName = "EMAIL")
    @ManyToOne(optional = false)
    private Login_1 email;

    public Userr() {
    }

    public Userr(BigDecimal userId) {
        this.userId = userId;
    }

    public Userr(BigDecimal userId, String firstName, String lastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Login_1 getEmail() {
        return email;
    }

    public void setEmail(Login_1 email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userr)) {
            return false;
        }
        Userr other = (Userr) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ttm.Userr[ userId=" + userId + " ]";
    }
    
}
