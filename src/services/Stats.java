import org.apache.http.message.BasicNameValuePair;

/**
 * Created by clovisolivier on 31/01/17.
 */

/**
 * Object used to call service Stats
 */
public class Stats extends Requester {

    /**
     * Path of the service
     */
    private static final String PATH = "";

    /**
     * Constructor
     */
    public Stats(){
        super(PATH);
    }

    /**
     * Add param account_id
     * @param account_id
     */
    public void AddParamAccountId(String account_id){
        params.add(new BasicNameValuePair("account_id",account_id));
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
