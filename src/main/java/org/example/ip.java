package org.example;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ip {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println("InetAddress of Local Host :"+address1);

        InetAddress address2 = InetAddress.getByName("45.22.30.39");
        System.out.println("InetAddress of Named Host :"+address2);

        InetAddress address3[] = InetAddress.getAllByName("www.facebook.com");
        for (int i = 0; i < address3.length; i++){
            System.out.println("All InetAddresses of Named Host : "+address3[i]);
        }
    }
}
