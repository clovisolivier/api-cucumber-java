package services;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by clovisolivier on 31/01/17.
 */
public abstract class Requester {

    private static final String BASEURL = "http://openweathermap.org/data";

    private final CloseableHttpClient httpClient = HttpClients.createDefault();

    public List<NameValuePair> params = new LinkedList<NameValuePair>();

    private HttpResponse httpResponse;

    private String responseString ;

    private String path;

    /**
     * Constructor
     * @param path Path of the service
     */
    public Requester(String path){
        this.path = path;
    }

    /**
     * Standard function to call a get WS
     * @throws IOException
     */
    public void callGetWS() throws IOException{

        String paramString = URLEncodedUtils.format(params, "utf-8");

        HttpGet request = new HttpGet(BASEURL + path + "/?"+ paramString);
        System.out.println(request.toString());
        httpResponse = httpClient.execute(request);
        responseString = convertResponseToString(httpResponse);

    }

    /**
     * Control status code expected
     * @param status_code
     */
    public void assertStatusCode(int status_code){
        assert (httpResponse.getStatusLine().getStatusCode() == status_code);
    }

    public static String getBASEURL() {
        return BASEURL;
    }

    public CloseableHttpClient getHttpClient() {
        return httpClient;
    }

    public List<NameValuePair> getParams() {
        return params;
    }

    public void setParams(List<NameValuePair> params) {
        this.params = params;
    }

    public HttpResponse getHttpResponse() {
        return httpResponse;
    }

    public void setHttpResponse(HttpResponse httpResponse) {
        this.httpResponse = httpResponse;
    }

    public String getResponseString() {
        return responseString;
    }

    public void setResponseString(String responseString) {
        this.responseString = responseString;
    }

    /**
     * Convert response body in string
     * @param response
     * @return request body
     * @throws IOException
     */
    private String convertResponseToString(HttpResponse response) throws IOException {
        InputStream responseStream = response.getEntity().getContent();
        Scanner scanner = new Scanner(responseStream, "UTF-8");
        String responseString = scanner.useDelimiter("\\Z").next();
        scanner.close();
        return responseString;
    }

}
