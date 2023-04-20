package org.example;

import java.net.MalformedURLException;
import java.net.URL;


public class url {
    public static void main(String[] args) throws MalformedURLException {
        URL u = new URL("https://www.google.com/");
        System.out.println("authority"+u.getAuthority());
        System.out.println("file"+u.getFile());
        System.out.println("host"+u.getHost());
        System.out.println("protocol"+u.getProtocol());
        System.out.println("path"+u.getPath());
        System.out.println("port"+u.getPort());
//        System.out.println("url"+u.getAuthority());
//        System.out.println("url"+u.getAuthority());
    }
}
