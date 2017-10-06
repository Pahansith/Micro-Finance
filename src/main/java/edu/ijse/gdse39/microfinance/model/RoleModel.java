package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "role_mst")
public class RoleModel {
    public enum ROLE_TYPE{
        MANAGER,ADMIN,CREDIT_MANAGER
    }

    public enum USER_PRIVILAGE{
        VIEW_ONLY, VIEW_ADD, FULL_ACCESS
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Enumerated(EnumType.STRING)
    ROLE_TYPE role_type;
    @Enumerated(EnumType.STRING)
    USER_PRIVILAGE privilage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ROLE_TYPE getRole_type() {
        return role_type;
    }

    public void setRole_type(ROLE_TYPE role_type) {
        this.role_type = role_type;
    }

    public USER_PRIVILAGE getPrivilage() {
        return privilage;
    }

    public void setPrivilage(USER_PRIVILAGE privilage) {
        this.privilage = privilage;
    }

    public RoleModel(ROLE_TYPE role_type, USER_PRIVILAGE privilage) {
        this.role_type = role_type;
        this.privilage = privilage;
    }
}
