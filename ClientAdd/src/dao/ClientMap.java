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

        } else {
            this.map.put(client.getCpf(), client);
            return true;
        }
    }

    @Override
    public void exclude(Long cpf) {
        Client clientRegistered = this.map.get(cpf);

        if (clientRegistered != null) {
            this.map.remove(clientRegistered.getCpf(), clientRegistered);
        }
    }

    @Override
    public void change(Client client) {
        Client clientRegistered = this.map.get(client.getCpf());

        if (clientRegistered != null) {
            clientRegistered.setName(client.getName());
            clientRegistered.setTell(client.getTell());
            clientRegistered.setHouseNumber(client.getHouseNumber());
            clientRegistered.setAddress(client.getAddress());
            clientRegistered.setCity(client.getCity());
            clientRegistered.setState(client.getState());
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
