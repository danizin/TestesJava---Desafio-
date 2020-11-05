package br.com.codar.robos.notificador;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import br.com.codar.robos.excecoes.ErroNotificacaoVencedorException;
import br.com.codar.robos.modelo.Robo;

public class NotificadorVencedor {

    public void notificarVencedor(Robo robo) {
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            HttpPost httpPost = new HttpPost("http://www.example.com");
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setEntity(new StringEntity(getRoboJson(robo)));
            client.execute(httpPost);
            client.close();
        } catch (Exception e) {
            throw new ErroNotificacaoVencedorException();
        }
    }

    private static String getRoboJson(Robo robo) {
        return "{ \"poder\" : " + robo.getPoder() +" }";
    }

}
