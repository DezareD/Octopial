import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Fuzz fuzz = new Fuzz();
        fuzz.dirScan("google.com");

        //HttpPost httpPost = new HttpPost(yandexSite);
        //httpPost.setHeader("qwe", "qwe");
        //httpResponse = httpClient.execute(httpPost);
        //body = EntityUtils.toString(httpResponse.getEntity());
        //System.out.println(body);
    }
}