package edu.ijse.gdse39.microfinance.dto;

/**
 * @author Pahansith on 10/21/2017
 * @project MicroFinance
 */

public class LoginInfoDto {
    private Integer id;
    private String userName;
    private String userPrivilage;

    public LoginInfoDto() {
    }

    public LoginInfoDto(Integer  id,String userName, String userPrivilage) {
        this.id = id;
        this.userName = userName;
        this.userPrivilage = userPrivilage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPrivilage() {
        return userPrivilage;
    }

    public void setUserPrivilage(String userPrivilage) {
        this.userPrivilage = userPrivilage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
