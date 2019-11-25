package cn.archforce.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: tanbaolin
 * @Date: Created in 11:35 上午 2019/11/25
 * @Description:
 * @Modified By:
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {

        model.addAttribute("name", name);
        return "hello";
    }

}
