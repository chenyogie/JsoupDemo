package com.yogie.domain;

/**
 * @program: JsoupDemo
 * @Date: 2019/4/11 9:55
 * @Author: Chenyogie
 * @Description: 文章实体类
 */
public class Essay {
    //文章标题
    private String title;
    //文章链接
    private String href;

    //文章内容
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "title='" + title + '\'' +
                ", href='" + href + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
