package com.yogie.main;

import com.yogie.spider.EssaySpider;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @program: JsoupDemo
 * @Date: 2019/4/10 23:35
 * @Author: Chenyogie
 * @Description:
 */
public class MainDemo {
    public static void main(String[] args) throws IOException {
        //网页地址
        String url = "http://www.huanyue123.com/book/37/37849/";
        EssaySpider spider = new EssaySpider();
        //获取网址的文档对象
        Document doc = spider.getDoc(url);
        //遍历list集合，将list的文章对象写入本地文件
        spider.writeEssay(doc);
    }
}
