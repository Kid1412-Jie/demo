package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

/**
 * 描述：
 *
 * @author 黄志杰
 * @date 2022/6/28 星期二 14:40
 */
public class Base64Util {
    /**
     * 文件转base64
     * @param filePath 文件地址
     * @return
     */
    public static String encryptToBase64(String filePath) {
        if (filePath == null) {
            return null;
        }
        try {
            byte[] b = Files.readAllBytes(Paths.get(filePath));
            return Base64.getEncoder().encodeToString(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    /**
     * base64转文件
     * @param base64 base64
     * @param filePath 生成后的文件地址
     * @return
     */
    public static String decryptByBase64(String base64, String filePath) {
        if (base64 == null && filePath == null) {
            return "生成文件失败，请给出相应的数据。";
        }
        try {
            Files.write(Paths.get(filePath), Base64.getDecoder().decode(base64), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "指定路径下生成文件成功！";
    }
    
    public static void main(String[] args) {
        String res = Base64Util.encryptToBase64("E:\\Desktop\\未进港清单.xlsx");
        System.out.println(res);
        //Base64Util.decryptByBase64(res,"E:\\Desktop\\客户VGM样本1.XLS");
    }
}