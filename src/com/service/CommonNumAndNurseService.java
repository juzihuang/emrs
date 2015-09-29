package com.service;

import com.model.AdmEmployee;
import com.model.CommonNumAndNurse;
import com.model.Page;

import java.util.List;

/**
 * Created by azhl on 2015/9/10.
 */
public interface CommonNumAndNurseService {
    public void addCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse);
    public void deleteCommonNumAndNurse(CommonNumAndNurse commonNumAndNurse);
    public List<AdmEmployee> getCommonNumList(String bigNurseNum,Page page);
    public List<AdmEmployee> getNurseList(String commonNumber,Page page);
}
