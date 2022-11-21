package org.example;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    private static HttpURLConnection connection;

    public static void main(String[] args) {
//        Solution solution = new Solution();
//        File fileInput = new File("input.txt");
//        solution.readingFromFile(fileInput);
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("https://localhost:9000");
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
//            connection.setConnectTimeout(5000);
//            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if(status>299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responseContent.append(line);
                }
                reader.close();
            }
            System.out.println(responseContent.toString());

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            connection.disconnect();
        }


    }
}