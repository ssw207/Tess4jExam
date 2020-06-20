import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Tess4jExam {
    public static void main(String[] args) {

        File file = new File("D:\\image.PNG");
        if (!file.exists()) {
            System.out.println("파일을 읽을 수 없음");
        }

        System.out.println(file.getName());
        ITesseract instance = new Tesseract();
        //instance.setDatapath(); // tessdata의 경로를 지정. 디폴트값 ./

        try {
            String result = instance.doOCR(file);
            System.out.println(result);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
