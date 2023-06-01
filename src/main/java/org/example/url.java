package org.example;

import java.net.MalformedURLException;
import java.net.URL;


public class url {
    public static void main(String[] args) throws MalformedURLException {
//        URL u = new URL("https://www.google.com/");
//        System.out.println("authority"+u.getAuthority());
//        System.out.println("file"+u.getFile());
//        System.out.println("host"+u.getHost());
//        System.out.println("protocol"+u.getProtocol());
//        System.out.println("path"+u.getPath());
//        System.out.println("port"+u.getPort());
//        System.out.println("url"+u.getAuthority());
//        System.out.println("url"+u.getAuthority());


        String protocol = "https";
        String hostname = "www.google.com";
        int port = 8080;
        String path = "/api";
        String query = "param1=value1&param2=value2";
        URL url = new URL(protocol, hostname, port, path + "?" + query);
        System.out.println("URL: " + url.toString());
    }
}
