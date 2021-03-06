/*
 * Copyright (c) 2018. Hunan Hisun Union Information Technology Co, Ltd. All rights reserved.
 * http://www.hn-hisun.com
 * 注意:本内容知识产权属于湖南海数互联信息技术有限公司所有,除非取得商业授权,否则不得用于商业目的.
 */

package com.hisun.saas.xx.app.console.shpc.vo;

import com.hisun.saas.xx.app.console.shtp.vo.ShtpsjVo;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by zhouying on 2017/9/8.
 */
public class Sha01Vo {
    private String id;
    private ShpcVo shpcVo;
    private String xm;
    private String xb;
    private String mz;
    private String jg;
    private String csny;
    private String csnyStr;
    private String nlStr;
    private String rdsj;
    private String rdsjStr;
    private String whcd;
    private String rxjbsj;
    private String mztjqk;
    private String ywfpjl;
    private String ntzpbyj;
    private String shyj;
    private String cjgzsj;
    private String cjgzsjStr;
    private String xgzdwjzw;
    private int px = 0;
    private String zppath;
    private String jsbs;
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private boolean isHavagbrmspbFile = false;//是否存在干部详细信息
    private boolean isHavakcclFile = false;//是否存在考察材料
    private boolean isHavaDascqkFile = false;//是否存在档案审查情况
    private boolean isHavaGrzdsxFile = false;//是否存在个人重大事项

    private List<Sha01dascqkVo> dascqks;
    private List<Sha01gbrmspbVo> gbrmspbs;
    private List<Sha01grzdsxVo> grzdsxes;
    private List<Sha01gzjlVo> gzjls;
    private List<Sha01jcVo> jcs;
    private List<Sha01kcclVo> kccls;
    private List<Sha01ndkhVo> ndkhs;
    private List<Sha01shgxVo> shgxes;

    private List<ShtpsjVo> shtpsjs;

    private int tyCount;//同意票数
    private int btyCount;//不同意票数
    private int qqCount;//弃权票数
    private String dplCount;//得票率

    private String xhXx;

    private String zzmmXx;

    private String rxsjXx;

    private String xymcXx;

    private String zymcXx;

    private String pybXx;

    private String jfxXx;

    private String dsxmXx;

    private String lunwenXx;

    private ShtpsjVo shtpsjVo;//用于投票

    private int tyNum;//同意人数
    private int btyNum;//不同意人数
    private int qqNum;//弃权人数
    private int ltNum;//漏投人数

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShpcVo getShpcVo() {
        return shpcVo;
    }

    public void setShpcVo(ShpcVo shpcVo) {
        this.shpcVo = shpcVo;
    }

    public String getXm() {
        if(jsbs!=null){
            return jsbs+xm;
        }
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getMz() {
        return mz;
    }

    public void setMz(String mz) {
        this.mz = mz;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getCsny() {
        return csny;
    }

    public void setCsny(String csny) {
        this.csny = csny;
    }

    public String getRdsj() {
        return rdsj;
    }

    public void setRdsj(String rdsj) {
        this.rdsj = rdsj;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    public String getRxjbsj() {
        return rxjbsj;
    }

    public void setRxjbsj(String rxjbsj) {
        this.rxjbsj = rxjbsj;
    }

    public String getMztjqk() {
        return mztjqk;
    }

    public void setMztjqk(String mztjqk) {
        this.mztjqk = mztjqk;
    }

    public String getYwfpjl() {
        return ywfpjl;
    }

    public void setYwfpjl(String ywfpjl) {
        this.ywfpjl = ywfpjl;
    }

    public String getNtzpbyj() {
        return ntzpbyj;
    }

    public void setNtzpbyj(String ntzpbyj) {
        this.ntzpbyj = ntzpbyj;
    }

    public String getShyj() {
        return shyj;
    }

    public void setShyj(String shyj) {
        this.shyj = shyj;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public String getZppath() {
        return zppath;
    }

    public void setZppath(String zppath) {
        this.zppath = zppath;
    }

    public List<Sha01dascqkVo> getDascqks() {
        return dascqks;
    }

    public void setDascqks(List<Sha01dascqkVo> dascqks) {
        this.dascqks = dascqks;
    }

    public List<Sha01gzjlVo> getGzjls() {
        return gzjls;
    }

    public void setGzjls(List<Sha01gzjlVo> gzjls) {
        this.gzjls = gzjls;
    }

    public List<Sha01jcVo> getJcs() {
        return jcs;
    }

    public void setJcs(List<Sha01jcVo> jcs) {
        this.jcs = jcs;
    }

    public List<Sha01kcclVo> getKccls() {
        return kccls;
    }

    public void setKccls(List<Sha01kcclVo> kccls) {
        this.kccls = kccls;
    }

    public List<Sha01ndkhVo> getNdkhs() {
        return ndkhs;
    }

    public void setNdkhs(List<Sha01ndkhVo> ndkhs) {
        this.ndkhs = ndkhs;
    }

    public List<Sha01shgxVo> getShgxes() {
        return shgxes;
    }

    public void setShgxes(List<Sha01shgxVo> shgxes) {
        this.shgxes = shgxes;
    }

    public List<Sha01gbrmspbVo> getGbrmspbs() {
        return gbrmspbs;
    }

    public void setGbrmspbs(List<Sha01gbrmspbVo> gbrmspbs) {
        this.gbrmspbs = gbrmspbs;
    }

    public List<Sha01grzdsxVo> getGrzdsxes() {
        return grzdsxes;
    }

    public void setGrzdsxes(List<Sha01grzdsxVo> grzdsxes) {
        this.grzdsxes = grzdsxes;
    }


    public List<ShtpsjVo> getShtpsjs() {
        return shtpsjs;
    }

    public void setShtpsjs(List<ShtpsjVo> shtpsjs) {
        this.shtpsjs = shtpsjs;
    }

    public String getCjgzsj() {
        return cjgzsj;
    }

    public void setCjgzsj(String cjgzsj) {
        this.cjgzsj = cjgzsj;
    }

    public String getXgzdwjzw() {
        return xgzdwjzw;
    }

    public void setXgzdwjzw(String xgzdwjzw) {
        this.xgzdwjzw = xgzdwjzw;
    }


    public String getCsnyStr() {
        //sdf.format(new Date());
        return csnyStr;
    }

    public void setCsnyStr(String csnyStr) {
        this.csnyStr = csnyStr;
    }

    public String getNlStr() {
        return nlStr;
    }

    public void setNlStr(String nlStr) {
        this.nlStr = nlStr;
    }

    public String getRdsjStr() {
        return rdsjStr;
    }

    public void setRdsjStr(String rdsjStr) {
        this.rdsjStr = rdsjStr;
    }

    public String getCjgzsjStr() {
        return cjgzsjStr;
    }

    public void setCjgzsjStr(String cjgzsjStr) {
        this.cjgzsjStr = cjgzsjStr;
    }

    public int getTyCount() {
        return tyCount;
    }

    public void setTyCount(int tyCount) {
        this.tyCount = tyCount;
    }

    public int getBtyCount() {
        return btyCount;
    }

    public void setBtyCount(int btyCount) {
        this.btyCount = btyCount;
    }

    public int getQqCount() {
        return qqCount;
    }

    public void setQqCount(int qqCount) {
        this.qqCount = qqCount;
    }

    public String getDplCount() {
        return dplCount;
    }

    public void setDplCount(String dplCount) {
        this.dplCount = dplCount;
    }

    public boolean isHavaGrzdsxFile() {
        return isHavaGrzdsxFile;
    }

    public void setHavaGrzdsxFile(boolean havaGrzdsxFile) {
        isHavaGrzdsxFile = havaGrzdsxFile;
    }

    public boolean isHavagbrmspbFile() {
        return isHavagbrmspbFile;
    }

    public void setHavagbrmspbFile(boolean havagbrmspbFile) {
        isHavagbrmspbFile = havagbrmspbFile;
    }

    public boolean isHavakcclFile() {
        return isHavakcclFile;
    }

    public void setHavakcclFile(boolean havakcclFile) {
        isHavakcclFile = havakcclFile;
    }

    public boolean isHavaDascqkFile() {
        return isHavaDascqkFile;
    }

    public void setHavaDascqkFile(boolean havaDascqkFile) {
        isHavaDascqkFile = havaDascqkFile;
    }

    public String getJsbs() {
        return jsbs;
    }

    public void setJsbs(String jsbs) {
        this.jsbs = jsbs;
    }

    public String getXhXx() {
        return xhXx;
    }

    public void setXhXx(String xhXx) {
        this.xhXx = xhXx;
    }

    public String getZzmmXx() {
        return zzmmXx;
    }

    public void setZzmmXx(String zzmmXx) {
        this.zzmmXx = zzmmXx;
    }

    public String getRxsjXx() {
        return rxsjXx;
    }

    public void setRxsjXx(String rxsjXx) {
        this.rxsjXx = rxsjXx;
    }

    public String getXymcXx() {
        return xymcXx;
    }

    public void setXymcXx(String xymcXx) {
        this.xymcXx = xymcXx;
    }

    public String getZymcXx() {
        return zymcXx;
    }

    public void setZymcXx(String zymcXx) {
        this.zymcXx = zymcXx;
    }

    public String getPybXx() {
        return pybXx;
    }

    public void setPybXx(String pybXx) {
        this.pybXx = pybXx;
    }

    public String getJfxXx() {
        return jfxXx;
    }

    public void setJfxXx(String jfxXx) {
        this.jfxXx = jfxXx;
    }

    public String getDsxmXx() {
        return dsxmXx;
    }

    public void setDsxmXx(String dsxmXx) {
        this.dsxmXx = dsxmXx;
    }

    public String getLunwenXx() {
        return lunwenXx;
    }

    public void setLunwenXx(String lunwenXx) {
        this.lunwenXx = lunwenXx;
    }


    public ShtpsjVo getShtpsjVo() {
        return shtpsjVo;
    }

    public void setShtpsjVo(ShtpsjVo shtpsjVo) {
        this.shtpsjVo = shtpsjVo;
    }

    public int getTyNum() {
        return tyNum;
    }

    public void setTyNum(int tyNum) {
        this.tyNum = tyNum;
    }

    public int getBtyNum() {
        return btyNum;
    }

    public void setBtyNum(int btyNum) {
        this.btyNum = btyNum;
    }

    public int getQqNum() {
        return qqNum;
    }

    public void setQqNum(int qqNum) {
        this.qqNum = qqNum;
    }

    public int getLtNum() {
        return ltNum;
    }

    public void setLtNum(int ltNum) {
        this.ltNum = ltNum;
    }
}
