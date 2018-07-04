
package urlconnectionreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class URLConnectionReader {

   
  public static void main(String[] args) throws Exception {
      URL example = new URL("http://powersms.banglaphone.net.bd/httpapi/sendsms?userId=rawntech&password=Rawntech12345&smsText=himahedi&commaSeperatedReceiverNumbers=01675000717&maskText=Mahedi");
      URLConnection ex = example.openConnection();
      BufferedReader in = new BufferedReader(
                              new InputStreamReader(
                              ex.getInputStream()));

      String inputLine;

      while ((inputLine = in.readLine()) != null)
         System.out.println(inputLine);

      in.close();
  }
}
