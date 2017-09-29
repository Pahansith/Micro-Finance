package edu.ijse.gdse39.microfinance.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "group_mst")
public class GroupModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer groupId;
    String groupCode;
    String groupName;
    @ManyToOne(cascade = CascadeType.ALL)
    SocietyModel societyModel;







}
