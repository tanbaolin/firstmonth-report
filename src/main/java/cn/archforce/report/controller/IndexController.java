package cn.archforce.report.controller;

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
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping({"/index", "/"})
    public String index(HttpServletRequest request, Model model) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null) {
                        request.getSession().setAttribute("user", user);
                    }
                    break;
                }
            }
        }

        List<QuestionDTO> questions = questionService.list();
        model.addAttribute("questions", questions);

        return "index";
    }

}
