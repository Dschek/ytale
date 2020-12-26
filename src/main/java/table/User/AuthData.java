package table.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authData")
public class AuthData {
    @Id
    @Column(name="userId")
    private int id;
    @Column(name = "password")
    private String password;
    @Column(name = "vk")
    private String tokenVK;
    @Column(name = "mail")
    private String mail;
    @Column(name = "facebook")
    private String facebook;
    @Column(name = "twiter")
    private String twiter;
    @Column(name = "yandex")
    private String yandex;
    @Column(name = "google")
    private String google;
    @Column(name = "phone")
    private String phone;

    public AuthData() {
    }
    public AuthData(int id, String password, String tokenVK, String mail, String facebook, String twiter, String yandex, String google, String phone) {
        this.id = id;
        this.password = password;
        this.tokenVK = tokenVK;
        this.mail = mail;
        this.facebook = facebook;
        this.twiter = twiter;
        this.yandex = yandex;
        this.google = google;
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTokenVK() {
        return tokenVK;
    }
    public void setTokenVK(String tokenVK) {
        this.tokenVK = tokenVK;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getFacebook() {
        return facebook;
    }
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    public String getTwiter() {
        return twiter;
    }
    public void setTwiter(String twiter) {
        this.twiter = twiter;
    }
    public String getYandex() {
        return yandex;
    }
    public void setYandex(String yandex) {
        this.yandex = yandex;
    }
    public String getGoogle() {
        return google;
    }
    public void setGoogle(String google) {
        this.google = google;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
