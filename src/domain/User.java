package domain;

public class User {
    private String name;
    private String password;
    private String mail;
    private String intro;
    private String image;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public String getIntro() { return intro; }
    public void setIntro(String intro) { this.intro = intro; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}
