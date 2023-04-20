package org.example;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class encode {
    public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
        String baseUrl = "https://www.javaguides.net/search?q=";
        String query = "core+java+tutorial";
        System.out.println("Url without encoding : ");
        URL url = new URL(baseUrl + query);
        System.out.println(url);
        System.out.println("URL after encoding:");
        url = new URL(baseUrl + URLEncoder.encode(query,"UTF-8"));
        System.out.println(url);
    }
}
