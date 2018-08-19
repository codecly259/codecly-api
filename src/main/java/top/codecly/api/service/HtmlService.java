package top.codecly.api.service;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@Slf4j
public class HtmlService {

    public String title(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        log.info("解析出url:[{}]对应的title为:[{}]", url, title);
        return title;
    }

}
