package com.dao;

import com.model.AdmEmployee;
import com.model.CommonNumAndNurse;
import com.model.Page;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by azhl on 2015/9/10.
 */
public interface CommonNumAndNurseDao {
    public void addCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse) throws DataAccessException;
    public int deleteCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse) throws DataAccessException;
    public List<AdmEmployee> getCommonNumList(String bigNurseNum,Page page)throws DataAccessException;
    public List<AdmEmployee> getNurseList(String commonNumber,Page page)throws DataAccessException;
}
