package cn.buk.api.airskyhk.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

public class PassengerInfo {

    /**
     * 旅客姓名
     */
    private String surname;

    /**
     * 性别：男：Male   女：Female
     */
    private String gender;

    /**
     * 生日
     */
    private String birthdate;

    /**
     * 证件类型：身份证:NI  护照:PP  其他:ID
     */
    private String identityType;

    /**
     * 证件号码
     */
    private String identityNumber;

    /**
     * 旅客类型：ADT、CHD、INF
     */
    private String passengerType;

    /**
     * 携带的婴儿姓名
     */
    @JsonIgnore
    private String infantName;

    @JsonIgnore
    private String mobile;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getInfantName() {
        return infantName;
    }

    public void setInfantName(String infantName) {
        this.infantName = infantName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
