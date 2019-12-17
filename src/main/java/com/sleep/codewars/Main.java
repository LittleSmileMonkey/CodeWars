package com.sleep.codewars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Base64;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        byte[] decode = Base64.getDecoder().decode("sPar0vQgj3zxEkyf1apLFw==");
        System.out.println(Arrays.toString(decode));
        File file = new File("/Users/zl/Desktop/9fb97eed4f0ae6fb77c099cef79df6c7.png");

        String fileMD5 = Md5.getFileMD5(file);
        System.out.println("getFileMD5 = " + fileMD5);

        byte[] encode = Base64.getEncoder().encode("f4208f7cf1124c9f".getBytes());
        System.out.println(Arrays.toString(encode));
    }
}
