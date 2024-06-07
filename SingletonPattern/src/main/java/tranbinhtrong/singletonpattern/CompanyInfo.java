package tranbinhtrong.singletonpattern;

public class CompanyInfo {

    private String comanyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String owner;
    private static CompanyInfo instance;

    private CompanyInfo() {
        this.comanyName = "BERSON";
        this.address = "123 Tran Binh Trong Street, Thu Dau Mot City, Binh Duong Province";
        this.email = "berson@berson.com";
        this.phoneNumber = "0357828806";
        this.owner = "Tran Binh Trong";
    }

    public static synchronized CompanyInfo getInstance() {
        if (instance == null) {
            instance = new CompanyInfo();
        }
        return instance;
    }

    public String getComanyName() {
        return comanyName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getOwner() {
        return owner;
    }

    public void setComanyName(String comanyName) {
        this.comanyName = comanyName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public static void setInstance(CompanyInfo instance) {
        CompanyInfo.instance = instance;
    }

    public void displayInfo() {
        System.out.println("Company Name: " + comanyName);
        System.out.println("Address: " + address);
        System.out.println("Contact via email: " + email);
        System.out.println("Contact via phone: " + phoneNumber);
        System.out.println("Name of the president: " + owner);
    }
}
