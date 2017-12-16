package com.kvlt.boot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Comment
 *
 * @author KVLT
 * @date 2017-12-17.
 */
@Entity(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String objectType;

    @Column
    private Integer objectId;

    @Column
    private Integer userId;

    @Column
    private String content;

    @Column
    private Date createdTime;

    public Comment() {

    }

    public Comment(String objectType, Integer objectId, Integer userId, String content, Date createdTime) {
        this.objectType = objectType;
        this.objectId = objectId;
        this.userId = userId;
        this.content = content;
        this.createdTime = createdTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
