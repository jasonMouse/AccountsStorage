package com.mouse.accounts.storage.dao.tables;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;

/**
 * @author by YiSong
 * @date 2019/1/4
 * 用于记录单个账户信息的表
 */
@Entity
public class AccountsInfo {
    @Id(autoincrement = true)
    private long id;                        // 单项编号

    @NotNull
    private long typeId;                    // 项目的类型编号

    @NotNull
    private String projectName;             // 信息的名称

    private String aliasName;               // 信息的别名

    @NotNull
    private String accountName;             // 当前项目的用户名

    private String password;                // 当前项目的密码

    @NotNull
    private Date createDate;                // 创建时间

    @NotNull
    private Date updateDate;                // 修改时间

    @Generated(hash = 531230924)
    public AccountsInfo(long id, long typeId, @NotNull String projectName, String aliasName,
            @NotNull String accountName, String password, @NotNull Date createDate,
            @NotNull Date updateDate) {
        this.id = id;
        this.typeId = typeId;
        this.projectName = projectName;
        this.aliasName = aliasName;
        this.accountName = accountName;
        this.password = password;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Generated(hash = 2054924003)
    public AccountsInfo() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public long getTypeId() {
        return this.typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }
}
