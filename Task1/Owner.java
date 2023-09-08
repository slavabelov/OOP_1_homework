public class Owner {
    private String ownername;

    public Owner(String name) {
        this.ownername = name;
    }

    public Owner() {
        this(null);
    }

    public String getOwnerName() {
        return ownername;
    }

    public void setOwnerName(String ownername) {
        this.ownername = ownername;
    }
}