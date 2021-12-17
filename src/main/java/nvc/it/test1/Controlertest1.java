package nvc.it.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlertest1 {
    //@RequestMapping(method-Requestmethod.GET, value = "/")
    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public String Taned(){
        return"<center>This root page</center><br><a href='/name'>Go to name page</a>";

    }

    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return "<center>Taned Nu.</center><br><a href='/'>Go to Home page</a>";
    }
    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "<center>Hii Tea or me!!</center>";
    }


    
}
