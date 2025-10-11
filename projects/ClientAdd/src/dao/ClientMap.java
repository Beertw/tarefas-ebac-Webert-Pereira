package dao;

import domain.Client;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClientMap implements IClient {

    private Map<Long, Client> map;

    public ClientMap() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean register(Client client) {
        if (this.map.containsKey(client.getCpf())) {
            return false;
        }
        this.map.put(client.getCpf(), client);
        return true;
    }

    @Override
    public void exclude(Long cpf) {
        this.map.remove(cpf);
    }

    @Override
    public void change(Client client) {
        if (this.map.containsKey(client.getCpf())) {
            this.map.put(client.getCpf(), client); // substitui pelo atualizado
        }
    }

    @Override
    public Client consult(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Client> searchAll() {
        return this.map.values();
    }
}
