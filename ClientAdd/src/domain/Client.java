package domain;

import java.util.Objects;

public class Client {

    private String name;
    private Long cpf;
    private Long tell;
    private String address;
    private Integer houseNumber;
    private String city;
    private String state;

    public Client(String name, String cpf, String tell, String address, String houseNumber, String city, String state) {
        this.name = name;
        this.cpf = Long.valueOf(cpf.trim());
        this.tell = Long.valueOf(tell.trim());
        this.address = address;
        this.houseNumber = Integer.valueOf(houseNumber.trim());
        this.state = state;

    }

   public String getName() {
        return name;
   }
   public void setName(String name) {
        this.name = name;
   }

    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getTell() {
        return tell;
    }
    public void setTell(Long tell) {
        this.tell = tell;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }
    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(cpf, client.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }

    @Override
    public String toString() {
        return "domain.Client{" +
                "name='" + name + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}
