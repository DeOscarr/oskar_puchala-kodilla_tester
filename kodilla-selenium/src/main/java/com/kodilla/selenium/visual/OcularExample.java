////package com.kodilla.selenium.visual;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.nio.file.Paths;
//
//public class OcularExample {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/apple/Desktop/szymon_pirecki-kodilla_tester/chromedriver-kopia");
//        WebDriver webDriver = new ChromeDriver();
//
//        Ocular.config()
//                .resultPath(Paths.get("/Users/apple/Desktop/results"))
//                .snapshotPath(Paths.get("/Users/apple/Desktop/snapshots"))
//                .globalSimilarity(95)
//                .saveSnapshot(true);
//
//        WorldTimePage page = new WorldTimePage(webDriver);
//
//        page.open();
//        page.compare();
//        page.close();
//
//    }
//}
