package edu.ijse.gdse39.microfinance.model;

import javax.persistence.*;
import java.util.List;

/**
 * @author Pahansith on 9/29/2017
 * @project MicroFinance
 */
@Entity
@Table(name = "member_mst")
public class MemberModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer memberId;
    String fName;
    String lName;
    String mobile;
    String nic;
    String address_1;
    String address_2;
    String address_3;
    String hometown;
    @ManyToOne
    GroupModel groupModel;

    public MemberModel() {
    }

    public MemberModel(String fName, String lName, String mobile, String nic, String address_1, String address_2, String address_3, String hometown, GroupModel groupModel) {
        this.fName = fName;
        this.lName = lName;
        this.mobile = mobile;
        this.nic = nic;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.address_3 = address_3;
        this.hometown = hometown;
        this.groupModel = groupModel;
    }



    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getAddress_3() {
        return address_3;
    }

    public void setAddress_3(String address_3) {
        this.address_3 = address_3;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public GroupModel getGroupModel() {
        return groupModel;
    }

    public void setGroupModel(GroupModel groupModel) {
        this.groupModel = groupModel;
    }
}
