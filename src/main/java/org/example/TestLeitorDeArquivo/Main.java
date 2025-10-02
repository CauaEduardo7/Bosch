package org.example.TestLeitorDeArquivo;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // DECLARE A VARIÁVEL DENTRO DO MAIN
        String nomeArquivo = "vendas_29-09-2025.dat";

        // Lê o arquivo a partir da pasta 'resources'
        // Agora o nomeArquivo está acessível
        try (InputStream is = Main.class.getClassLoader().getResourceAsStream(nomeArquivo);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o recurso: " + e.getMessage());
            e.printStackTrace();
        }
    }
}