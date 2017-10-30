package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/11/2017
 * @project MicroFinance
 */

public class GroupDto {
    Integer groupId;
    String groupCode;
    String groupName;

    public GroupDto() {
    }

    public GroupDto(Integer groupId, String groupCode, String groupName) {
        this.groupId = groupId;
        this.groupCode = groupCode;
        this.groupName = groupName;
    }

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
}
