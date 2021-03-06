/*
 * Copyright (c) 2018. Hunan Hisun Union Information Technology Co, Ltd. All rights reserved.
 * http://www.hn-hisun.com
 * 注意:本内容知识产权属于湖南海数互联信息技术有限公司所有,除非取得商业授权,否则不得用于商业目的.
 */

package com.hisun.saas.xx.app.console.gendata.vo;

import java.util.Date;

/**
 * Created by zhouying on 2017/11/23.
 */
public class AppDataVo {

    private String name;
    private String md5;
    private String url;
    private String contentLength;
    private Date createDate;

    public AppDataVo() {
        this.name = "";
        this.md5 = "";
        this.url = "";
        this.contentLength = "";
        this.createDate = null;
    }

    public String getName() { return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
