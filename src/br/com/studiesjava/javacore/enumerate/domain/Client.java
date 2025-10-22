package br.com.studiesjava.javacore.enumerate.domain;

import br.com.studiesjava.javacore.enumerate.domain.PaymentType;

public class Client {

    private String name;
    private TypeClient typeClient;
    private PaymentType paymentType;

    public Client(String name, TypeClient typeClient, PaymentType paymentType) {
        this.name = name;
        this.typeClient = typeClient;
        this.paymentType = paymentType;
    }

    public Client(String name, TypeClient typeClient) {
        this.name = name;
        this.typeClient = typeClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", typeClient=" + typeClient +
                ", paymentType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeClient getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }
}

