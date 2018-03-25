package edu.ijse.gdse39.microfinance.model;

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
    @ManyToOne
    SocietyModel societyModel;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public SocietyModel getSocietyModel() {
        return societyModel;
    }

    public void setSocietyModel(SocietyModel societyModel) {
        this.societyModel = societyModel;
    }

    public GroupModel() {
    }

    public GroupModel(String groupCode, String groupName, SocietyModel societyModel) {
        this.groupCode = groupCode;
        this.groupName = groupName;
        this.societyModel = societyModel;
    }
}
