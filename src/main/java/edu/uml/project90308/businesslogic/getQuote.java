package edu.uml.project90308.businesslogic;

/**
 * Created with IntelliJ IDEA.
 * User: pgmartin
 * Date: 10/3/12
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
import java.net.*;
import java.io.*;

//import org.apache.commons.io.IOUtils;

public class getQuote {
    public static void main(String[] args) throws Exception {
        /*
           URL oracle = new URL("http://www.oracle.com/");
           BufferedReader in = new BufferedReader(
           new InputStreamReader(oracle.openStream()));

           String inputLine;
           while ((inputLine = in.readLine()) != null)
               System.out.println(inputLine);
           in.close();
        */

        String sym = "EMC";
        String params = "sl1d1t1c1ohgv";
        String theUrl = "http://download.finance.yahoo.com/d/quotes.csv?s=" + sym + "&f=" + params;

        /* InputStream inputStream = null;
        StringWriter stringWriter = null;
        URL url = new URL(theUrl);
        inputStream = url.openStream();
        stringWriter = new StringWriter();
        IOUtils.copy(inputStream, stringWriter);

        System.out.println(stringWriter);
        */
    }

}
