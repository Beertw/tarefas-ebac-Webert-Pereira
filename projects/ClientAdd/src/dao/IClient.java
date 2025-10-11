package dao;

import domain.Client;
import java.util.Collection;

public interface IClient {

    Boolean register(Client client);
    void exclude(Long cpf);
    void change(Client client);
    Client consult(Long cpf);
    Collection<Client> searchAll();

}
