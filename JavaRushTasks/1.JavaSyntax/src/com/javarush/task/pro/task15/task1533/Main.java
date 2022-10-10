package com.javarush.task.pro.task15.task1533;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("line.separator"));
        System.out.println(System.getProperty("path.separator"));

        URL location = Main.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());


        System.out.println(new File(".").getCanonicalPath());
        System.out.println(Paths.get(".").toRealPath());
        System.out.println(System.getProperty("user.home"));
        String path = new File(".").getCanonicalPath();
        System.out.println(path);

        Properties properties = System.getProperties();
        Enumeration<Object> enumeration = properties.keys();
        for (int i = 0; i < properties.size(); i++) {
            Object obj = enumeration.nextElement();
            System.out.println("Key: "+obj+"\tOutPut= "+System.getProperty(obj.toString()));
        }

    }

}
