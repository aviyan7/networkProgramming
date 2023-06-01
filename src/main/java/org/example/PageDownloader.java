package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class PageDownloader {
//    public static void main(String[] args) {
//        String baseUrl = "https://en.wikipedia.org/wiki/";
//        String[] pageNames = {"Main_Page", "Talk:Main_Page", "Page3"};  // Add the names of the pages you want to download
//
//        for (String pageName : pageNames) {
//            String url = baseUrl + pageName;
//
//            try {
//                Document document = Jsoup.connect(url).get();
//                Element contentElement = document.selectFirst("#content");
//                String pageContent = contentElement.text();
//
//                String fileName = pageName + ".txt";
//                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//                    writer.write(document.html());
//                    System.out.println("Page '" + pageName + "' downloaded successfully.");
//                } catch (IOException e) {
//                    System.out.println("Error saving page '" + pageName + "'.");
//                    e.printStackTrace();
//                }
//            } catch (IOException e) {
//                System.out.println("Error downloading page '" + pageName + "'.");
//                e.printStackTrace();
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String url = "https://en.wikipedia.org/wiki/Main_Page";
//        String outputDirectory = "C:\\Users\\Dell\\Documents\\studyHtml";
//
//        try {
//            Document document = Jsoup.connect(url).get();
//
//            String htmlContent = document.html();
//            saveHtmlContent(htmlContent, outputDirectory, "index.html");
//
//            Elements imageElements = document.select("img[src]");
//            for (Element imageElement : imageElements) {
//                String imageUrl = imageElement.absUrl("src");
//                downloadImage(imageUrl, outputDirectory);
//            }
//
//            System.out.println("Web page downloaded successfully.");
//        } catch (IOException e) {
//            System.out.println("Error downloading web page: " + e.getMessage());
//        }
//    }
//
//    private static void saveHtmlContent(String htmlContent, String outputDirectory, String filename) throws IOException {
//        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputDirectory + "/" + filename))) {
//            outputStream.write(htmlContent.getBytes());
//        }
//    }
//
//    private static void downloadImage(String imageUrl, String outputDirectory) throws IOException {
//        URL url = new URL(imageUrl);
//        String fileName = imageUrl.substring(imageUrl.lastIndexOf('/') + 1);
//
//        try (InputStream inputStream = url.openStream();
//             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputDirectory + "/" + fileName))) {
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = inputStream.read(buffer)) != -1) {
//                outputStream.write(buffer, 0, bytesRead);
//            }
//        }
//    }

    public static void main(String[] args) throws AWTException, InterruptedException {
        if (Desktop.isDesktopSupported()) {

            //making a desktop object
            Desktop desktop = Desktop.getDesktop();
            try {
                URI uri = new URI("https://www.tutorialspoint.com/index.htm");
                desktop.browse(uri);
                Thread.sleep(4000);
            } catch (IOException excp) {
                excp.printStackTrace();
            } catch (URISyntaxException excp) {
                excp.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                Robot robot = new Robot();
                robot.mouseMove(20,150);
                robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
                robot.mouseMove(29,225);
//                robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//                robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
                robot.mouseWheel(2000);
//                Thread.sleep(1000);
            }
        }
    }
}
