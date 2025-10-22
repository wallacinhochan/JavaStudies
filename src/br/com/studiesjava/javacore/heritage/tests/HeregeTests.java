package br.com.studiesjava.javacore.heritage.tests;

import br.com.studiesjava.javacore.heritage.domain.Address;
import br.com.studiesjava.javacore.heritage.domain.Employee;
import br.com.studiesjava.javacore.heritage.domain.Person;

public class HeregeTests {
    public static void main(String[] args) {
        Person person = new Person("Wallace");
        person.setAge(20);
        person.setCpf("1234567890");
        Address address = new Address();
        address.setCity("Berlin");
        address.setCep("12345");
        address.setState("Rio de Janeiro");
        address.setStreet("Berlin");
        person.setAddress(address);
        person.printer();
        System.out.println("_____________________");

        Employee employee = new Employee("Thalia", 5000.0);
        employee.setAge(20);
        employee.setCpf("1234567890");
        employee.setAddress(address);
        employee.printer();


    }
}
