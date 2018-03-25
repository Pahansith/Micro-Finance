package edu.ijse.gdse39.microfinance.dto;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Pahansith on 3/24/2018
 * @project MicroFinance-master
 */
@XmlRootElement
public class AccountCreateDto {
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String telephone;
    @NotNull
    private String nic;
    @NotNull
    private String userName;
    @NotNull
    private String password;

    public AccountCreateDto() {
    }

    public AccountCreateDto(Long id, String name, String telephone, String nic, String userName, String password) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.nic = nic;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
