package net.shagie.sbecho;

public class Echo {
    private String value;

    public Echo(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "net.shagie.sbecho.Echo{" +
            "value='" + value + '\'' +
            '}';
    }

    public String getValue() {
        return value;
    }

    public Echo setValue(String value) {
        this.value = value;
        return this;
    }
}
