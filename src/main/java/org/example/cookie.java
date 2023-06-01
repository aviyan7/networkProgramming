package org.example;

import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class cookie {
    public static void main(String[] args){
        HttpCookie cookie = new HttpCookie("myCookie", "cookieValue");
        cookie.setDomain("google.com");
        cookie.setPath("/");
        cookie.setMaxAge(3600);

        URI uri = URI.create("http://google.com");
        CookieManager cookieManager = new CookieManager();
        cookieManager.getCookieStore().add(uri, cookie);

        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookies = cookieStore.get(uri);
        for (HttpCookie c : cookies) {
            System.out.println("Cookie Name: " + c.getName());
            System.out.println("Cookie Value: " + c.getValue());
            System.out.println("Cookie Domain: " + c.getDomain());
            System.out.println("Cookie Path: " + c.getPath());
            System.out.println("Cookie Max Age: " + c.getMaxAge());
        }
        cookieStore.removeAll();
        System.out.println("Cookies deleted.");
    }
}
