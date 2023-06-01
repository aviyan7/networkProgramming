package org.example;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ip {
    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println("Ip Address of Local Host :"+address1.getHostAddress());
        System.out.println("Host name:"+ address1.getHostName());
        System.out.println("Full domain name"+address1.getCanonicalHostName());

        byte[] macAddress = NetworkInterface.getByInetAddress(address1).getHardwareAddress();
        StringBuilder macAddressString = new StringBuilder();
        if (macAddress != null) {
            for (byte b : macAddress) {
                macAddressString.append(String.format("%02X-", b));
            }
            macAddressString.setLength(macAddressString.length() - 1); // Remove the last '-'
            System.out.println("MAC Address: " + macAddressString);
        }

        InetAddress address2 = InetAddress.getByName("45.22.30.39");
        System.out.println("InetAddress of Named Host :"+address2);

        InetAddress address3[] = InetAddress.getAllByName("www.facebook.com");
        for (int i = 0; i < address3.length; i++){
            System.out.println("All InetAddresses of Named Host : "+address3[i]);
        }
    }
}
