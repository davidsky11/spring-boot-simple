package com.kvlt.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Article
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Entity
@NamedQuery(name = "Article.withAuthorQuery",
    query = "select a from Article a where a.author = ?1")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "tag")
    private String tag;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "content")
    private String content;

    @Column(name = "thumbUp")
    private Integer thumbUp;  // 点赞量

    @Column(name = "reading")
    private Integer reading;  // 阅读量

    @Column(name = "remark")
    private String remark;  // 备注

    public Article() {
    }

    public Article(String tag, String title, String author, String content, String remark) {
        this.tag = tag;
        this.title = title;
        this.author = author;
        this.content = content;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    public Integer getReading() {
        return reading;
    }

    public void setReading(Integer reading) {
        this.reading = reading;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", tag='" + tag + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", thumbUp=" + thumbUp +
                ", reading=" + reading +
                ", remark='" + remark + '\'' +
                '}';
    }

}
