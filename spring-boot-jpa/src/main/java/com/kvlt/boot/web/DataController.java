package com.kvlt.boot.web;

import com.kvlt.boot.dao.ArticleRepository;
import com.kvlt.boot.dao.CommentRepository;
import com.kvlt.boot.entity.Article;
import com.kvlt.boot.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * DataController
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@RestController
public class DataController {

    // Spring Data JPA已自动为你注册bean，所以可以自动注入
    @Autowired
    private ArticleRepository articleRepository;

    @Autowired
    private CommentRepository commentRepository;

    /**
     * 保存
     * save支持批量保存： <S extends T> Iterable<S> save(Iterable<S> entities);
     * @param tag
     * @param title
     * @param author
     * @param remark
     * @return
     */
    @PostMapping("/save")
    public Article save(String tag, String title, String author, String remark) {
        Article tmp = new Article();
        tmp.setTag(tag);
        tmp.setTitle(title);
        tmp.setAuthor(author);
        tmp.setRemark(remark);
        Article a = articleRepository.save(tmp);
        return a;
    }

    @GetMapping("/queryByAuthor1")
    public List<Article> queryByAuthor1(String author) {
        List<Article> list = articleRepository.findByAuthor(author);
        return list;
    }

    @GetMapping("queryByTA")
    public Article queryBy1(String title, String author) {
        Article a = articleRepository.withTitleAndAuthorQuery(title, author);
        return a;
    }

    @GetMapping("getById")
    public Article getById(int id) {
        Article a = this.articleRepository.findByEntityId(id);
        return a;
    }

    @GetMapping("queryByAuthor2")
    public List<Article> queryByAuthor(String author) {
        List<Article> list = articleRepository.withAuthorQuery(author);
        return list;
    }

    @GetMapping("/sort")
    public List<Article> sort() {
        List<Article> list = this.articleRepository.findAll(new Sort(Sort.Direction.DESC, "title"));
        return list;
    }

    /**
     * 分页
     * @return
     */
    @GetMapping("/page")
    public Page<Article> page() {
        Page<Article> pageList = this.articleRepository.findAll(new PageRequest(1, 2));
        return pageList;
    }

    @GetMapping("/auto")
    public Page<Comment> auto(Comment comment) {
        Page<Comment> list = commentRepository.findByAuto(comment, new PageRequest(0, 10));
        return list;
    }

}
