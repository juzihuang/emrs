package com.dao.impl;

import com.common.dao.BaseDao;
import com.dao.CommonNumAndNurseDao;
import com.model.AdmEmployee;
import com.model.CommonNumAndNurse;
import com.model.Page;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * Created by azhl on 2015/9/10.
 */
@Component
public class CommonNumAndNurseDaoImpl extends BaseDao implements CommonNumAndNurseDao {
    @SuppressWarnings("deprecation")
    @Override
    public void addCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse)
            throws DataAccessException {
        // TODO Auto-generated method stub
        this.getSqlMapClientTemplate().insert("insertCommonNumAndNurse", commonNumAndNurse);
    }

    @Override
    public int deleteCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse)
            throws DataAccessException {
        // TODO Auto-generated method stub
        return this.getSqlMapClientTemplate().delete("deleteCommonNumAndNurse", commonNumAndNurse);
    }

    @Override
    public List<AdmEmployee> getCommonNumList(String bigNurseNum, Page page) throws DataAccessException {
        HashMap<String,String> parameters=new HashMap<String,String>();
        parameters.put("bigNurseNum",bigNurseNum);
        parameters.put("rowNumberStart",page.getRowNumStart());
        parameters.put("rowLength",page.getRowLength());
        parameters.put("rowNumEnd",page.getRowNumEnd());
        return   this.getSqlMapClientTemplate().queryForList("selectCommonNumList", parameters);
    }

    @Override
    public List<AdmEmployee> getNurseList(String commonNumber, Page page) throws DataAccessException {
        HashMap<String,String> parameters=new HashMap<String,String>();
        parameters.put("commonNumber",commonNumber);
        parameters.put("rowNumberStart",page.getRowNumStart());
        parameters.put("rowLength",page.getRowLength());
        parameters.put("rowNumEnd",page.getRowNumEnd());
        return this.getSqlMapClientTemplate().queryForList("selectNurseList", parameters);
    }
}
