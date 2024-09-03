package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
    public static void main(String[] args) {

        // try-with-resources
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\456.jpg");
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image.jpg")) {
            int data = 0;

            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
