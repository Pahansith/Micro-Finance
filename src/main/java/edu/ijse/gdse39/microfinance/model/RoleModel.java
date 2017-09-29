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
    @Enumerated(EnumType.ORDINAL)
    ROLE_TYPE role_type;
    @Enumerated(EnumType.ORDINAL)
    USER_PRIVILAGE privilage;

}
