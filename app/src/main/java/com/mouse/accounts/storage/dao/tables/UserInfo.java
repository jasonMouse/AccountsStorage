package com.mouse.accounts.storage.dao.tables;

import org.greenrobot.greendao.annotation.*;

import java.util.Date;

/**
 * @author by YiSong
 * @date 2019/1/4
 * 用户信息表
 */
@Entity
public class UserInfo {
    @Id(autoincrement = true)
    private long id;                        // 用户编号

    @NotNull
    @Unique
    private String phoneNum;                // 用户手机号

    @NotNull
    private String userName;                // 用户名称

    private String headIcon;                // 用户头像的地址

    @NotNull
    private int unLockMethod;               // 解锁的方式（0：数字密码解锁；1：表示九宫格解锁；2：表示指纹密码解锁）

    @NotNull
    private String unLockPwd;               // 解锁用的密码

    @NotNull
    private Date createDate;                // 创建时间

    @NotNull
    private Date updateDate;                // 修改时间

    @Generated(hash = 1338602203)
    public UserInfo(long id, @NotNull String phoneNum, @NotNull String userName,
            String headIcon, int unLockMethod, @NotNull String unLockPwd,
            @NotNull Date createDate, @NotNull Date updateDate) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.userName = userName;
        this.headIcon = headIcon;
        this.unLockMethod = unLockMethod;
        this.unLockPwd = unLockPwd;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    @Generated(hash = 1279772520)
    public UserInfo() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHeadIcon() {
        return this.headIcon;
    }

    public void setHeadIcon(String headIcon) {
        this.headIcon = headIcon;
    }

    public int getUnLockMethod() {
        return this.unLockMethod;
    }

    public void setUnLockMethod(int unLockMethod) {
        this.unLockMethod = unLockMethod;
    }

    public String getUnLockPwd() {
        return this.unLockPwd;
    }

    public void setUnLockPwd(String unLockPwd) {
        this.unLockPwd = unLockPwd;
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
}
