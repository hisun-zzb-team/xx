/*
 * Copyright (c) 2018. Hunan Hisun Union Information Technology Co, Ltd. All rights reserved.
 * http://www.hn-hisun.com
 * 注意:本内容知识产权属于湖南海数互联信息技术有限公司所有,除非取得商业授权,否则不得用于商业目的.
 */

package com.hisun.saas.xx.app.console.shpc.service.impl;

import com.hisun.base.dao.BaseDao;
import com.hisun.base.service.impl.BaseServiceImpl;
import com.hisun.saas.xx.app.console.gendata.service.GendataService;
import com.hisun.saas.xx.app.console.shpc.dao.ShpcAttsDao;
import com.hisun.saas.xx.app.console.shpc.entity.ShpcAtts;
import com.hisun.saas.xx.app.console.shpc.service.ShpcAttsService;
import com.hisun.saas.xx.app.console.shpc.service.ShpcService;
import com.hisun.util.FileUtil;
import com.hisun.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhouying on 2017/11/15.
 */
@Service
public class ShpcAttsServiceImpl extends BaseServiceImpl<ShpcAtts,String> implements ShpcAttsService{

    private ShpcAttsDao shpcAttsDao;

    @Autowired
    public void setBaseDao(BaseDao<ShpcAtts, String> shpcAttsDao) {
        this.baseDao = shpcAttsDao;
        this.shpcAttsDao = (ShpcAttsDao) shpcAttsDao;
    }


    public String toSqliteInsertSql(ShpcAtts entity){
        StringBuffer sb = new StringBuffer("");
        sb.append(" INSERT INTO ");
        sb.append(" APP_SH_PC_ATTS ");
        sb.append("(");
        sb.append("ID");
        sb.append(",SH_PC_ID");
        sb.append(",FILE_NAME");
        sb.append(",FILE_PATH");
        sb.append(")");
        sb.append(" VALUES");
        sb.append("(");
        sb.append("'"+ StringUtils.trimNull2Empty(entity.getId())+"'");
        sb.append(",'"+ StringUtils.trimNull2Empty(entity.getShpc().getId())+"'");
        sb.append(",'"+ StringUtils.trimNull2Empty(entity.getFilename())+"'");
        if (StringUtils.isEmpty(entity.getFilepath())){
            sb.append(",''");
        }else{
            String attsPath = GendataService.APP_ATTS_PATH+ ShpcAttsService.APP_ATTS_PATH
                    + FileUtil.getFileName(entity.getFilepath());
            sb.append(",'"+attsPath+"'");

        }
        sb.append(")");
        return sb.toString();
    }


}
