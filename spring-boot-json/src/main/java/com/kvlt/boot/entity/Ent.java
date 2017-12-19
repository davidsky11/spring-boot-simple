package com.kvlt.boot.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Ent
 *
 * @author KVLT
 * @date 2017-12-18.
 */
public class Ent {

    private int id;
    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createTime;

    /**
     * serialize: 是否需要序列化
     */
    @JSONField(serialize = false)
    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
