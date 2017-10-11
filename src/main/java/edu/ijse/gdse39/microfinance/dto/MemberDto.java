package edu.ijse.gdse39.microfinance.dto;

import edu.ijse.gdse39.microfinance.model.MemberModel;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author Pahansith on 10/9/2017
 * @project MicroFinance
 */

public class MemberDto {

    private Integer memberId;
    private String fulName;
    private String nic;
    private String hometown;
    private String group;

    public MemberDto(Integer memberId, String fulName, String nic, String hometown, String group) {
        this.memberId = memberId;
        this.fulName = fulName;
        this.nic = nic;
        this.hometown = hometown;
        this.group = group;
    }

    public MemberDto() {
    }



    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
