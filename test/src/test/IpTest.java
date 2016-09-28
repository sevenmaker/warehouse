package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IpTest {

	public String getGeoIp(String ip){
		// TODO Auto-generated method stub
		BufferedReader in = null;
		StringBuffer sbuf = new StringBuffer();
        try {
        	String urlStr = "http://freegeoip.net/xml/" + ip;
            URL obj = new URL(urlStr); // 호출할 url
            HttpURLConnection con = (HttpURLConnection)obj.openConnection();
 
            con.setRequestMethod("GET");
 
            Object tmep = con.getContent();
            in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
        
            String line;
            while((line = in.readLine()) != null) { // response를 차례대로 출력
                if(line.trim().startsWith("<CountryCode")){
                	System.out.println(line.trim().replaceAll("CountryCode", "").replaceAll("</", "").replaceAll("<", "").replaceAll(">", ""));
                	return line.trim().replaceAll("CountryCode", "").replaceAll("<", "").replaceAll("</", "").replaceAll(">", "");
                }
                sbuf.append(line + "\r\n") ;
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null) try { in.close(); } catch(Exception e) { e.printStackTrace(); }
        }
        
		return sbuf.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IpTest a = new IpTest();
		a.getGeoIp("172.16.16.102");

	}

}
