package COREJAVA1.level5;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Map;

public class Level5_10 {
    //TemplateString:
    //Đầu vào: một file template, và các params, nội dung file và tên các param không cố định (input.txt)
    //Đầu ra: một file mới với nội dung là template và các params được truyền vào.

    public static String templateString(String fileName, Map<String, String> params) {
        String dir = System.getProperty("user.dir") + "/src/main/resources/files/" + fileName;
        String outputDir = System.getProperty("user.dir") + "/src/main/resources/files/output/" + fileName;
        StringBuilder content = new StringBuilder();

        try (FileInputStream fis = new FileInputStream(dir)) {
            int data;
            while ((data = fis.read()) != -1) {
                content.append((char) data);
            }

            String result = content.toString();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String placeholder = "{{" + entry.getKey() + "}}";
                result = result.replace(placeholder, entry.getValue());
            }

            try (FileWriter fw = new FileWriter(outputDir)) {
                fw.write(result);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return "success";

        } catch (Exception e) {
            e.printStackTrace();
            return "Failed";
        }
    }

    public static void main(String[] args) {
        Map<String, String> txtParams = Map.of(
                "name", "John",
                "date", "2025-03-21"
        );
        Map<String, String> htmlParams = Map.of(
                "pageTitle", "Home page",
                "content", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab, consectetur"
        );

        String resultTxt = templateString("input.txt", txtParams);
        System.out.println("Result: " + resultTxt);

        String resultHtml = templateString("htmlInput.html", htmlParams);
        System.out.println("Result: " + resultHtml);
    }
}
