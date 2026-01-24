package com.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ImageByteArray {

    public static void main(String[] args) {

        String originalImage = "original.jpg";
        String copiedImage = "copied.jpg";

        try {
            byte[] imageBytes = readImageAsByteArray(originalImage);
            writeByteArrayToImage(imageBytes, copiedImage);

            boolean isSame = verifyImages(originalImage, copiedImage);

            if (isSame) {
                System.out.println("Image copied successfully. Files are identical.");
            } else {
                System.out.println("Files are not identical.");
            }

        } catch (IOException e) {
            System.out.println("Error occurred while processing the image.");
            e.printStackTrace();
        }
    }

    private static byte[] readImageAsByteArray(String filePath) throws IOException {

        FileInputStream fis = new FileInputStream(filePath);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        fis.close();
        return baos.toByteArray();
    }

    private static void writeByteArrayToImage(byte[] data, String filePath) throws IOException {

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        FileOutputStream fos = new FileOutputStream(filePath);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fos.close();
        bais.close();
    }

    private static boolean verifyImages(String file1, String file2) throws IOException {

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        byte[] img1 = fis1.readAllBytes();
        byte[] img2 = fis2.readAllBytes();

        fis1.close();
        fis2.close();

        return Arrays.equals(img1, img2);
    }
}

