package beans.wishbee.anas.app;

/**
 * Created by Anasmp on 4/3/17.
 */

public class Blog {

    private String title;
    private String desc;
    private String image;

    public String getPrf() {
        return prf;
    }

    public void setPrf(String prf) {
        this.prf = prf;
    }

    private String prf;
    private String loc;



    private String username;

    public Blog()
    {


    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Blog(String title, String desc, String image , String loc) {
        this.title = title;
        this.loc=loc;
        this.desc = desc;
        this.image = image;
        this.username=username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
