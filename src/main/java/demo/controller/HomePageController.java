package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;

/**
 * @author fanyou
 * @date 2018/12/23 23:06
 **/
@Controller
@RequestMapping("/homePage")
public class HomePageController {

    @ResourceMapping("/index")
    public String homePage() {
        return "homePage";
    }
}
