package br.com.studiesjava.javacore.enumerate.test;

import br.com.studiesjava.javacore.enumerate.domain.Client;
import br.com.studiesjava.javacore.enumerate.domain.TypeClient;
import br.com.studiesjava.javacore.enumerate.domain.PaymentType;

public class ClientTests {
    public static void main(String[] args) {
        Client client = new Client("Jão", TypeClient.PESSOA_FISICA, PaymentType.CREDITO);
        Client client2 = new Client("Thalia", TypeClient.PESSOA_JURIDICA, PaymentType.DEBITO);

        System.out.println(client);
        System.out.println(client2);

        System.out.println(PaymentType.CREDITO.discount(100));

        TypeClient typeClient = TypeClient.clientTypeByReport("Pessoa Fisica");
        System.out.println(typeClient);

    }
}
