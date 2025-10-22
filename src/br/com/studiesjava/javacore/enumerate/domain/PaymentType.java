package br.com.studiesjava.javacore.enumerate.domain;

public enum PaymentType {
    CREDITO{
        @Override
        public double discount(double amount) {
            return amount*0.05;
        }
    }, DEBITO{
        @Override
        public double discount(double amount) {
            return amount*0.1;
        }
    };

    public abstract double discount(double amount);
}
