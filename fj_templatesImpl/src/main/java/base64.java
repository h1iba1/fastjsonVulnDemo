import java.io.*;
import sun.misc.*;
public class base64 {
    public static void main(String[] args) {
        try {
            FileInputStream fileForInput = new FileInputStream("/Users/h11ba1/Desktop/javaSec/05cc2/code/src/test/java/HelloTemplatesImpl.class");
            String content = new String();
            byte[] bytes = new byte[fileForInput.available()];
            fileForInput.read(bytes);
            content = new BASE64Encoder().encode(bytes);
            System.out.println(content);
            fileForInput.close();
            String str = content;//编码内容
            byte[] result = new sun.misc.BASE64Decoder().decodeBuffer(str.trim());
            RandomAccessFile inOut = new RandomAccessFile("/Users/h11ba1/Desktop/javaSec/05cc2/code/src/test/java/HelloTemplatesImpl.class", "rw");
            inOut.write(result);
            inOut.close();
        } catch (Exception ex) {
            System.out.println("wrong");
        }
    }
}