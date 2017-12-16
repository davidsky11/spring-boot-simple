package com.kvlt.boot.dao;

import com.kvlt.boot.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ArticleDao
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByAuthor(String author);

    @Query(value = "from Article a where a.id = :id")
    Article findByEntityId(@Param("id") int id);

    @Query("select a from Article a where a.title = :title and a.author = :author")
    Article withTitleAndAuthorQuery(@Param("title") String title, @Param("author") String author);

    // 使用 实体中NameQuery定义的查询语句，而不是根据方法名称查询
    List<Article> withAuthorQuery(String author);

}
