package algorithmsAndDataStructure.domain;


public class Airport {


    private  String city;
    private  String coutry;
    private  String threeLetterCode;


    public Airport() {
    }


    public Airport(String threeLetterCode,String city, String coutry) {
        this.city = city;
        this.coutry = coutry;
        this.threeLetterCode = threeLetterCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public String getThreeLetterCode() {
        return threeLetterCode;
    }

    public void setThreeLetterCode(String threeLetterCode) {
        this.threeLetterCode = threeLetterCode;
    }
}
