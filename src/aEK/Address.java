package aEK;

public class Address extends irmao{

    private String avenue;
    private String town;
    private String country;
    private int locality;


    public Address(String avenue, String town, String country, int locality) {
        super();

        this.avenue = avenue;
        this.locality = locality;
        this.town = town;
        this.country = country;
    }
    public void setAvenue(String avenue){
        this.avenue = avenue;
    }
    public String getAvenue(){
        return this.avenue;}
        public void setTown(String town){
        this.town = town;
        }
        public String getTown(){
        return this.town;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return this.country;
    }
    public void setLocality(int locality){
        this.locality = locality;
    }
    public int getLocality(){
        return this.locality;
    }



    public String toString(){
        return "Locality: \nLocal Address :" + this.locality + "Residential Avenue :"+ this.avenue + "Town Name :"+this.town + "Country :" + this.country +"\n";

    }
}
