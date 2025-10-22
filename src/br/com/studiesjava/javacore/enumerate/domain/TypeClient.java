package br.com.studiesjava.javacore.enumerate.domain;

public enum TypeClient {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int VALUE;
    private final String REPORT;

    TypeClient(int VALUE, String REPORT) {
        this.VALUE = VALUE;
        this.REPORT = REPORT;
    }

    public static TypeClient clientTypeByReport(String REPORT) {
        for (TypeClient typeClient : TypeClient.values()) {
            if (typeClient.REPORT.equals(REPORT)) {
                return typeClient;
            }
        }
        return null;
    }

    public int getValue() {
        return VALUE;
    }
    public String getReport() {
        return REPORT;
    }
}
