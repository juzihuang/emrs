package com.action;

import com.common.struts2.BaseAction;
import com.model.AdmEmployee;
import com.model.CommonNumAndNurse;
import com.model.Page;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CommonNumAndNurseService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by azhl on 2015/9/10.
 */
public class CommonNumAndNurseAction extends BaseAction {
    private static final long serialVersionUID = 1L;
    @Autowired
    private CommonNumAndNurseService commonNumAndNurseService;
    @Autowired
    Page page;
    /*
     *2015/9/10
     */
    public String addCommonNumAndNurse() {
        // getPara and validate
        String commonNumber = this.getJsonObject("commonNumber").toString();
        Validate.notNull(commonNumber, "参数commonNumber不可为空");
        String nurseNumber = this.getJsonObject("nurseNumber").toString();
        Validate.notNull(nurseNumber, "参数nurseNumber不可为空");
        String bigNurseNumber = this.getJsonObject("bigNurseNumber").toString();
        Validate.notNull(bigNurseNumber, "参数bigNurseNumber不可为空");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String createTime =  df.format(new Date()).toString();
        // set new CommonNumAndNurse
        CommonNumAndNurse commonNumAndNurse = new CommonNumAndNurse();
        commonNumAndNurse.setCommonNumber(Long.parseLong(commonNumber));
        commonNumAndNurse.setNurseNumber(Long.parseLong(nurseNumber));
        commonNumAndNurse.setBigNurseNumber(Long.parseLong(bigNurseNumber));
        commonNumAndNurse.setCreateTime(createTime);
        // save commonNumAndNurse
        commonNumAndNurseService.addCommonNumAndNurse(commonNumAndNurse);
        // log and return
        String logContent = "添加完成(commonNumAndNurse:" + commonNumAndNurse.getCommonNumber()
                + "_"+commonNumAndNurse.getNurseNumber()+"by bigNurseNumber"+commonNumAndNurse.getBigNurseNumber()+")";
        ActionSupport.LOG.info(logContent);
        this.setErrorCodeAndResult("0", true);
        return SUCCESS;
    }

    public String deleteCommonNumAndNurse() throws Exception {
        // getPara and validate
        String commonNumber = this.getJsonObject("commonNumber").toString();
        Validate.notNull(commonNumber, "参数commonNumber不可为空");
        String nurseNumber = this.getJsonObject("nurseNumber").toString();
        Validate.notNull(nurseNumber, "参数nurseNumber不可为空");
        String bigNurseNumber = this.getJsonObject("bigNurseNumber").toString();
        Validate.notNull(bigNurseNumber, "参数nurseNumber不可为空");
        // call service to query
        CommonNumAndNurse commonNumAndNurse = new CommonNumAndNurse();
        commonNumAndNurse.setCommonNumber(Long.parseLong(commonNumber));
        commonNumAndNurse.setNurseNumber(Long.parseLong(nurseNumber));
        commonNumAndNurse.setBigNurseNumber(Long.parseLong(bigNurseNumber));
        //
        commonNumAndNurseService.deleteCommonNumAndNurse(commonNumAndNurse);
        // reply message
        this.setErrorCodeAndResult("0", true);
        return SUCCESS;
    }
    //
    public String getCommonNumList() throws Exception {
        //get page info
        String sEcho = this.getJsonObject("sEcho").toString();
        Validate.notEmpty(sEcho, "参数sEcho不可为空");
        String displayStart = this.getJsonObject("iDisplayStart").toString();
        Validate.notEmpty(displayStart, "参数displayStart不可为空");
        String displayLength = this.getJsonObject("iDisplayLength").toString();
        Validate.notEmpty(displayLength, "参数displayLength不可为空");
        Integer iRowNumEnd=Integer.parseInt(displayStart)+Integer.parseInt(displayLength);
        page.setRowNumStart(displayStart);
        page.setRowNumEnd(iRowNumEnd.toString());
        page.setRowLength(displayLength);
        //
        String bigNurseNumber = this.getJsonObject("bigNurseNumber").toString();
        Validate.notNull(bigNurseNumber, "参数bigNurseNumber不可为空");
        //
        //
        List<AdmEmployee> commonNumAndNurseList = commonNumAndNurseService.getCommonNumList(bigNurseNumber,page);
        JSONArray jsonArray = new JSONArray();
        for(AdmEmployee commonNum:commonNumAndNurseList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userNumber", commonNum.getUserNumber());//
            jsonObject.put("password", commonNum.getPassword());//
            jsonObject.put("realName", commonNum.getRealName());//
            jsonObject.put("roolName", "大大大");//
            jsonObject.put("createTime", commonNum.getCreateTime());
            jsonObject.put("updateTime", commonNum.getUpdateTime());
            jsonArray.add(jsonObject);
        }
        // reply message
        this.setErrorCodeAndResultByPage("0", jsonArray, sEcho, displayLength);
        return SUCCESS;
    }

    //
    public String getNurseList() throws Exception {
        //get page info
        String sEcho = this.getJsonObject("sEcho").toString();
        Validate.notEmpty(sEcho, "参数sEcho不可为空");
        String displayStart = this.getJsonObject("iDisplayStart").toString();
        Validate.notEmpty(displayStart, "参数displayStart不可为空");
        String displayLength = this.getJsonObject("iDisplayLength").toString();
        Validate.notEmpty(displayLength, "参数displayLength不可为空");
        Integer iRowNumEnd=Integer.parseInt(displayStart)+Integer.parseInt(displayLength);
        page.setRowNumStart(displayStart);
        page.setRowNumEnd(iRowNumEnd.toString());
        page.setRowLength(displayLength);
        //
        String commonNumber = this.getJsonObject("commonNumber").toString();
        Validate.notNull(commonNumber, "参数commonNumber不可为空");
        //
        List<AdmEmployee> commonNumAndNurseList = commonNumAndNurseService.getNurseList(commonNumber,page);
        JSONArray jsonArray = new JSONArray();
        for(AdmEmployee commonNum:commonNumAndNurseList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("userNumber", commonNum.getUserNumber());//
            jsonObject.put("password", commonNum.getPassword());//
            jsonObject.put("realName", commonNum.getRealName());//
            jsonObject.put("roolName", "大大大");//
            jsonObject.put("createTime", commonNum.getCreateTime());
            jsonObject.put("updateTime", commonNum.getUpdateTime());
            jsonArray.add(jsonObject);
        }
        // reply message
        this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
        return SUCCESS;
    }
}
