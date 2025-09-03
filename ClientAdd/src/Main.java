import domain.Client;
import dao.IClient;
import dao.ClientMap;

import javax.swing.*;

public class Main {
    private static IClient iClient;

    public static void main(String[] args) {

        iClient = new ClientMap();

        String option = JOptionPane.showInputDialog(null,"Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alterar, 5 para sair", "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!validatedOption(option)) {
            if ("".equals(option)) {
                exit();

            } else {
                option = JOptionPane.showInputDialog((null, "Opção inválida, digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alterar, 5 para sair", "Inválido: ", JOptionPane.INFORMATION_MESSAGE);
            }

            while (validatedOption(option)) {
                if (exitOption(option)) {
                    exit();

                } else if (registerOption(option)) {
                    String data = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula, na seguinte ordem: Nome, CPF, Telefone, Endereço, Número da Residência, Cidade, Estado,", "Dados: ", JOptionPane.INFORMATION_MESSAGE);

                } else if (consultOption(option)) {
                    String data = JOptionPane.showInputDialog(null, "Digite o cpf: ", "Consultar: ", JOptionPane.INFORMATION_MESSAGE);
                    consult(data);

                }

                option = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alterar, 5 para sair", "Opções: ", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        private static void consult(String data) {
            Client client = iClient.consult(Long.parseLong(data));

            if (client != null) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado: " + client.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        private static boolean consultOption(String option) {
            if ("2".equals(option)) {
                return true;

            } else {
                return false;

            }
        }

        private static void register(String data) {
            String[] separateData = data.split(",");
            Client client = new Client(separateData[0], separateData[1], separateData[2], separateData[3], separateData[4], separateData[5], separateData[6]);

            Boolean registerOption = iClient.register(client);

            if (registerOption) {
                JOptionPane.showInputDialog(null, "Cliente cadastrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        private static boolean registerOption(String option) {
            if ("1".equals(option)) {
                return true;

        } else {
                return false;

            }
        }

        private static void exit() {
            JOptionPane.showMessageDialog(null, "Fechando...", "Sair", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        private static boolean validatedOption(String option) {
            if ("1".equals(option || "2".equals(option ||"3".equals(option || "4".equals(option) || "5".equals)) {
                return true;

            } else {
                return false;
            }
        }

        private static boolean registerOption(String option) {
            if ("1".equals(option)) {
                return true;

            } else {
                return false;

            }
        }
    }
}