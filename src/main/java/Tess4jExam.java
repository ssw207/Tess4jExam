import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.Tesseract1;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Tess4jExam {
    public static void main(String[] args) {

        File imageFile = new File("image.png");

        ITesseract instance = new Tesseract1();

        System.out.println("인스턴스 생성");
        System.out.println(imageFile.getName());
        try {
            String result = instance.doOCR(imageFile);

            System.out.println(result);

        } catch (TesseractException e) {

            System.err.println(e.getMessage());

        }
    }
}
