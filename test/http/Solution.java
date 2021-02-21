package test.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        try {
            String urlName="http://www.baidu.com";
            URL url=new URL(urlName);
            URLConnection connection=url.openConnection();
            connection.connect();
            Map<String, List<String>> headers=connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry :
                    headers.entrySet()) {
                String key = entry.getKey();
                for (String value :
                        entry.getValue()) {
                    System.out.println(key+": "+value);
                }
            }
            System.out.println("----------------------");
            System.out.println(connection.getContentType());
            System.out.println(connection.getContentLength());
            System.out.println(connection.getContentEncoding());
            System.out.println(connection.getDate());
            System.out.println(connection.getExpiration());
            System.out.println(connection.getLastModified());

            BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line="";
            while ((line=br.readLine())!=null)
                System.out.println(line);
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
