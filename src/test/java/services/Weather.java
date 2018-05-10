package services;

import org.apache.http.message.BasicNameValuePair;

/**
 * Created by clovisolivier on 31/01/17.
 */

/**
 * Object used to call service Stats
 */
public class Weather extends Requester {

    /**
     * Path of the service
     */
    private static final String PATH = "";

    /**
     * Constructor
     */
    public Weather(){
        super(PATH);
    }

    /**
     * Add param Q
     * @param Q
     */
    public void AddValueInParam(String param, String value){
        params.add(new BasicNameValuePair(param, value));
    }

    /**
     * Add param date_from
     * @param date_from
     */
    public void AddParamDateFrom(String date_from){
        params.add(new BasicNameValuePair("date_from",date_from));
    }

    /**
     * Add param date_to
     * @param date_to
     */
    public void AddParamDateTo(String date_to){
        params.add(new BasicNameValuePair("date_to",date_to));
    }

}
