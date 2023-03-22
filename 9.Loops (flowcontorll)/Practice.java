class students {
    String name ;
    String address ;
    String stream ;
    int collegeId ;

    void getInfo () {
        System.out.println(this.name);
        System.out.println(this.stream);
        System.out.println(this.address);
        System.out.println(this.collegeId);
    }


}

public class Practice {
    public static void main(String[] args) {
        students NCIT = new students();
        NCIT.name = "Anjeel";
        NCIT.address = "KTM";
        NCIT.stream = "BESE";
        NCIT.collegeId = 191736;

        students NEC = new students();
        NEC.name = "Anoj";
        NEC.address = "Bhaktapur";
        NEC.stream = "IT";
        NEC.collegeId = 191702;

        NCIT.getInfo();
        NEC.getInfo();
    }
}
