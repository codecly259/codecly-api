package top.codecly.api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.codecly.api.common.JsonResult;
import top.codecly.api.service.HtmlService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/html")
@Slf4j
@CrossOrigin("*")
public class HtmlController {

    @Autowired
    private HtmlService htmlService;

    @RequestMapping("/title")
    @ResponseBody
    public JsonResult title(String url) {
        try {
            String title = htmlService.title(url);
            return JsonResult.success("解析成功", title);
        } catch (Exception e) {
//            log.error("解析title异常", e);
            return JsonResult.failure("解析title异常:" + e.getMessage());
        }
    }
}
