package br.com.studiesjava.javacore.heritage.domain;

public class Address {
    private String cep;
    private String street;
    private String city;
    private String state;

    public void printer(){
        System.out.println(cep);
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
