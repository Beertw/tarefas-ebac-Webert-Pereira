package dao;

import domain.Client;

import java.util.Collection;

public interface IClient {

    public Boolean register(Client client);
    public void exclude(Long cpf);
    public void change(Client client);
    public Client consult(Long cpf);
    public Collection<Client> searchAll();

}
