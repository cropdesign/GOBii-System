package org.gobiiproject.gobiidao.entity.pojos;
// Generated Mar 31, 2016 1:44:38 PM by Hibernate Tools 3.2.2.GA


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name = "contact"
        , schema = "public"
)
//@NamedStoredProcedureQueries({
//        @NamedStoredProcedureQuery(
//                name = "getContacts",
//                procedureName = "get_contacts",
//                resultClasses = Contact.class,
//                parameters = {
//                        @StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = void.class),
//                        @StoredProcedureParameter(mode = ParameterMode.IN, type = String.class)
//                }
//        )
//})
public class Contact implements java.io.Serializable {


    private int contactId;
    private String lastname;
    private String firstname;
    private String code;
    private String email;
    private Serializable roles;
    private int createdBy;
    private Date createdDate;
    private Integer modifiedBy;
    private Date modifiedDate;

    public Contact() {
    }

    public Contact(int contactId, String lastname, String firstname, String email, String code ) {
        this.contactId = contactId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.code = code;
        this.email = email;
    }

//    public Contact(int contactId, String lastname, String firstname, String code, String email, int createdBy, Date createdDate) {
//        this.contactId = contactId;
//        this.lastname = lastname;
//        this.firstname = firstname;
//        this.code = code;
//        this.email = email;
//        this.createdBy = createdBy;
//        this.createdDate = createdDate;
//    }
//
//    public Contact(int contactId, String lastname, String firstname, String code, String email, Serializable roles, int createdBy, Date createdDate, Integer modifiedBy, Date modifiedDate) {
//        this.contactId = contactId;
//        this.lastname = lastname;
//        this.firstname = firstname;
//        this.code = code;
//        this.email = email;
//        this.roles = roles;
//        this.createdBy = createdBy;
//        this.createdDate = createdDate;
//        this.modifiedBy = modifiedBy;
//        this.modifiedDate = modifiedDate;
//    }

    @Id

    @Column(name = "contact_id", unique = true, nullable = false)
    public int getContactId() {
        return this.contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    @Column(name = "lastname", nullable = false)
    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name = "firstname", nullable = false)
    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "code", nullable = false)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "roles")
    public Serializable getRoles() {
        return this.roles;
    }

    public void setRoles(Serializable roles) {
        this.roles = roles;
    }

    @Column(name = "created_by", nullable = false)
    public int getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date", nullable = false, length = 13)
    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "modified_by")
    public Integer getModifiedBy() {
        return this.modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "modified_date", length = 13)
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


}


