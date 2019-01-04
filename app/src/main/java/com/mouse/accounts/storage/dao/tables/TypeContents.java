package com.mouse.accounts.storage.dao.tables;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;

/**
 * @author by YiSong
 * @date 2019/1/4
 * 针对账户执行分类总结操作的表
 */
@Entity
public class TypeContents {
    @Id(autoincrement = true)
    private long id;                        // 类型编号

    @NotNull
    private long userId;                    // 对应的用户编号

    @NotNull
    private String typeName;                // 类型名称

    @NotNull
    private Date createDate;                // 创建时间

    @NotNull
    private Date updateDate;                // 修改时间

    @Generated(hash = 1501252836)
    public TypeContents(long id, long userId, @NotNull String typeName, @NotNull Date createDate,
            @NotNull Date updateDate) {
        this.id = id;
        this.userId = userId;
        this.typeName = typeName;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Generated(hash = 621164845)
    public TypeContents() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
