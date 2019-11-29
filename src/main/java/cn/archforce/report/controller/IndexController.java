package cn.archforce.report.controller;

import cn.archforce.report.dto.PaginationDTO;
import cn.archforce.report.dto.QuestionDTO;
import cn.archforce.report.mapper.QuestionMapper;
import cn.archforce.report.mapper.UserMapper;
import cn.archforce.report.model.Question;
import cn.archforce.report.model.User;
import cn.archforce.report.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: tanbaolin
 * @Date: Created in 11:35 上午 2019/11/25
 * @Description:
 * @Modified By:
 */
@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping({"/index", "/"})
    public String index(HttpServletRequest request, Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5") Integer size
                        ) {

        PaginationDTO pagination = questionService.list(page, size);
        model.addAttribute("pagination", pagination);

        return "index";
    }

}
