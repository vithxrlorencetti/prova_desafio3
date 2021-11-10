package DAO;

import Model.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClienteDAO {

    public void gerarLog(Cliente cliente) {

        File log = new File("log.txt");

        if(!log.isFile()){
            try {
                log.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(log, true);
            PrintWriter printWriter  = new PrintWriter(fileWriter);

            printWriter.println("Novo cliente cadastrado no ID > " + cliente.getIdCLiente() + " < : " + cliente.getNomeCliente());

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
