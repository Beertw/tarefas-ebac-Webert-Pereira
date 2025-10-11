import dao.ClientMap;
import dao.IClient;
import domain.Client;

import javax.swing.*;

public class Main {
    private static IClient iClient = new ClientMap();

    public static void main(String[] args) {
        while (true) {
            String option = JOptionPane.showInputDialog(null,
                    "Menu:\n" +
                            "1 - Cadastrar cliente\n" +
                            "2 - Consultar cliente\n" +
                            "3 - Excluir cliente\n" +
                            "4 - Alterar cliente\n" +
                            "5 - Listar todos\n" +
                            "0 - Sair",
                    "Sistema de Cadastro",
                    JOptionPane.INFORMATION_MESSAGE);

            if (option == null || option.equals("0")) {
                exit();
            }

            switch (option) {
                case "1" -> register();
                case "2" -> consult();
                case "3" -> exclude();
                case "4" -> change();
                case "5" -> listAll();
                default -> JOptionPane.showMessageDialog(null,
                        "Opção inválida!", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void register() {
        String data = JOptionPane.showInputDialog(null,
                "Digite os dados separados por vírgula:\n" +
                        "Nome, CPF, Telefone, Endereço, Número, Cidade, Estado");

        if (data == null || data.isBlank()) return;

        try {
            String[] separateData = data.split(",");
            Client client = new Client(separateData[0], separateData[1], separateData[2],
                    separateData[3], separateData[4], separateData[5], separateData[6]);

            if (iClient.register(client)) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Já existe cliente com este CPF!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar. Verifique os dados!");
        }
    }

    private static void consult() {
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente:");
        if (cpf == null || cpf.isBlank()) return;

        Client client = iClient.consult(Long.valueOf(cpf));
        if (client != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado:\n" + client);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
        }
    }

    private static void exclude() {
        String cpf = JOptionPane.showInputDialog("Digite o CPF para excluir:");
        if (cpf == null || cpf.isBlank()) return;

        iClient.exclude(Long.valueOf(cpf));
        JOptionPane.showMessageDialog(null, "Cliente excluído (se existia).");
    }

    private static void change() {
        String cpf = JOptionPane.showInputDialog("Digite o CPF do cliente que deseja alterar:");
        if (cpf == null || cpf.isBlank()) return;

        Client existing = iClient.consult(Long.valueOf(cpf));
        if (existing == null) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
            return;
        }

        String data = JOptionPane.showInputDialog(null,
                "Digite os novos dados separados por vírgula:\n" +
                        "Nome, CPF, Telefone, Endereço, Número, Cidade, Estado");

        if (data == null || data.isBlank()) return;

        try {
            String[] separateData = data.split(",");
            Client client = new Client(separateData[0], separateData[1], separateData[2],
                    separateData[3], separateData[4], separateData[5], separateData[6]);

            iClient.change(client);
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar cliente!");
        }
    }

    private static void listAll() {
        StringBuilder sb = new StringBuilder("Clientes cadastrados:\n");
        for (Client client : iClient.searchAll()) {
            sb.append(client).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
        System.exit(0);
    }
}
