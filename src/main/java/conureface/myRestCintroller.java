package conureface;

import FaceUtil.ImageUtil;
import org.opencv.core.Mat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;


/**
 * Created by Dost Muhammad on 5/31/2018.
 */
@RestController
public class myRestCintroller {
    private static final String template = "Hello, %s!";

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public Student chk(){
        Student obj=new Student("dost","ali");



        return obj;
    }

    @RequestMapping(value = "base",method = RequestMethod.POST)
    public String base(@RequestParam(value="name", defaultValue="World") String name){

        BufferedImage img= ImageUtil.decodeToImage(name);




        int s=name.length();

        return ""+s;
    }
}
