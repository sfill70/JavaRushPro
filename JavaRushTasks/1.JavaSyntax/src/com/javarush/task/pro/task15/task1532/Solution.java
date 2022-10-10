package com.javarush.task.pro.task15.task1532;

/*
Шифр
*/

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

//    Прошел не сразу
    public static ByteArrayOutputStream encrypt(String message) {
        byte[] out = message.getBytes(StandardCharsets.UTF_8);
        byte[] bytes = new byte[out.length];
        int j = 0;
        for (int i = 0; i < bytes.length / 2; i++) {
            bytes[j] = out[i];
            bytes[j + 1] = out[bytes.length - i - 1];
            j = j + 2;
        }
        if (bytes.length % 2 == 1) {
            bytes[bytes.length - 1] = out[bytes.length / 2];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.writeBytes(bytes);
        return byteArrayOutputStream;
    }

//    Не проходит
    /*public static ByteArrayOutputStream encrypt(String message) {
        String script = "";
        for (int i = 0; i < message.length() / 2; i++) {
            script = script + message.charAt(i);
            script = script + message.charAt((message.length() - i - 1));
        }
        if (message.length() % 2 == 1) {
            script = script + message.charAt(message.length() / 2);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.writeBytes(script.getBytes(StandardCharsets.UTF_8));
        return byteArrayOutputStream;
    }*/
// Решение  JavaRash
     /* public static ByteArrayOutputStream encrypt(String message) {

          ByteArrayOutputStream stream = new ByteArrayOutputStream();
          byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
          int length = bytes.length;
          for (int i = 0; i < length / 2; i++) {
              stream.write(bytes[i]);
              stream.write(bytes[length - i - 1]);
          }
          if (length % 2 == 1) {
              stream.write(bytes[length / 2]);
          }
            return stream;
      }*/

}


