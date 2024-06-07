package tranbinhtrong.singletonpattern;

public class SingletonPattern {

    public static void main(String[] args) {
        CompanyInfo Berson = CompanyInfo.getInstance();
        Berson.displayInfo();
        Berson.setPhoneNumber("(VietNam) (+89)357828806 ");
        Berson.displayInfo();
    }
}
