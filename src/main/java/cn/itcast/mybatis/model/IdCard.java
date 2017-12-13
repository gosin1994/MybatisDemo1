package cn.itcast.mybatis.model;

import java.io.Serializable;

/**
 * @Author: Gosin
 * @Date: 2017/12/13 16:46
 */
public class IdCard implements Serializable {
    private String cardId;
    private String province;
    private String city;
    private Integer userid;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "cardId='" + cardId + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", userid=" + userid +
                '}';
    }
}
