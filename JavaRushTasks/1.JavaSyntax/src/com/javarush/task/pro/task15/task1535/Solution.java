package com.javarush.task.pro.task15.task1535;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/* 
Собираем файл
*/
//   /home/sfillhp/1/JavaRush.txt
public class Solution {
    public static void main(String[] args) throws Exception {
//        splitFile("C:\\test\\file.txt", 1024);
        splitFile("/home/sfillhp/1/file.txt", 512);
    }

    public static void splitFile(String fileName, int partSize) throws IOException {
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {
            ByteBuffer buf = ByteBuffer.allocate(partSize);
            int counter = 1;
            while (inputChannel.read(buf) > 0) {
                System.out.println(buf.limit());
                Path outputFilePath = Paths.get(getNewFileName(fileName, counter));
                counter++;
                if (Files.notExists(outputFilePath)) {
                    Files.createFile(outputFilePath);
                }
                try (FileChannel outputChannel = FileChannel.open(outputFilePath, StandardOpenOption.WRITE)) {
                    buf.flip();
                    outputChannel.write(buf);
                    buf.clear();
                }
            }
        }
    }

/*    public static void splitFile(String fileName, int partSize) throws IOException {
        Path path = Path.of(fileName);
//        System.out.println(Files.size(Path.of(fileName)));
        try (FileChannel inputChannel = FileChannel.open(Paths.get(fileName))) {

            long count = Files.size(Path.of(fileName)) / partSize;
            long ost = 0;
            for (int i = 1; i <= count; i++) {
                String fileOut = getNewFileName(fileName, i);
//                System.out.println(fileOut);
                if (!Files.exists(Paths.get(fileOut))) {
                    Files.createFile(Paths.get(fileOut));
                }
                try (  *//*FileOutputStream fos = new FileOutputStream(fileOut);
                        FileChannel writeChannel = fos.getChannel()*//*
                        RandomAccessFile writer = new RandomAccessFile(fileOut, "rw");
                        FileChannel writeChannel = writer.getChannel();

                ) {
                    ByteBuffer buf = ByteBuffer.allocate(partSize);
                    inputChannel.read(buf);
//                    System.out.println(inputChannel.position());
                    ost = inputChannel.size() - inputChannel.position();
//                    System.out.println(ost);
                    writeChannel.write(ByteBuffer.wrap(buf.array()));

                }
            }

            if (ost > 0) {

                String fileOut = getNewFileName(fileName, (int) count + 1);
//                System.out.println(fileOut);
                if (!Files.exists(Paths.get(fileOut))) {
                    Files.createFile(Paths.get(fileOut));
                }
                try (  *//*FileOutputStream fos = new FileOutputStream(fileOut);
                        FileChannel writeChannel = fos.getChannel()*//*
                        RandomAccessFile writer = new RandomAccessFile(fileOut, "rw");
                        FileChannel writeChannel = writer.getChannel();

                ) {
                    ByteBuffer buf = ByteBuffer.allocate(partSize);
                    inputChannel.read(buf);
//                    System.out.println(inputChannel.position());
                    ost = inputChannel.size() - inputChannel.position();
//                    System.out.println(ost);
                    writeChannel.write(ByteBuffer.wrap(buf.array()));

                }
            }


        }
    }*/

    public static String getNewFileName(String oldFileName, int number) {
        int dotIndex = oldFileName.lastIndexOf(".");
        return oldFileName.substring(0, dotIndex) + number + oldFileName.substring(dotIndex);
    }
}
