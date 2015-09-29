package com.action;

import com.common.struts2.BaseAction;
import com.model.*;
import com.model.AdmDepartment;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdmDepartmentService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.Validate;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AdmDepartmentAction extends BaseAction {
    @Autowired
    AdmDepartmentService admDepartmentService;
    @Autowired
    Page page;
    public String getAdmDepartment() throws Exception{
        // getPara and validate
        String id = this.getJsonObject("id").toString();
        Validate.notNull(id, "参数病案号不可为空");
        // call service to query
        AdmDepartment admDepartment = new AdmDepartment();
        admDepartment.setId(Long.parseLong(id));
        admDepartment = admDepartmentService.getAdmDepartment(admDepartment);
        // construct result
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", admDepartment.getId());
        jsonObject.put("name", admDepartment.getName());
        jsonObject.put("department_direct_id", admDepartment.getDepartment_direct_id());
        jsonObject.put("inpatient_area_id", admDepartment.getInpatient_area_id());
        jsonObject.put("common_nurse_id", admDepartment.getCommon_nurse_id());
        jsonObject.put("create_time", admDepartment.getCreate_time());
        // reply message
        this.setErrorCodeAndResult("0", jsonObject);
        return SUCCESS;
    }
    public String getAdmDepartmentList() throws Exception{
        //get page info
        String sEcho = this.getJsonObject("sEcho").toString();
        Validate.notEmpty(sEcho, "参数sEcho不可为空");
        String displayStart = this.getJsonObject("iDisplayStart").toString();
        Validate.notEmpty(displayStart, "参数iDisplayStart不可为空");
        String displayLength = this.getJsonObject("iDisplayLength").toString();
        Validate.notEmpty(displayLength, "参数iDisplayLength不可为空");
        Integer iRowNumEnd=Integer.parseInt(displayStart)+Integer.parseInt(displayLength);
        page.setRowNumStart(displayStart);
        page.setRowNumEnd(iRowNumEnd.toString());
        page.setRowLength(displayLength);
        //
        List<AdmDepartment> admDepartmentList = admDepartmentService.getAdmDepartmentList(page);
        JSONArray jsonArray = new JSONArray();
        for(AdmDepartment admDepartment:admDepartmentList){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", admDepartment.getId());
            jsonObject.put("name", admDepartment.getName());
            jsonObject.put("department_direct_id", admDepartment.getDepartment_direct_id());
            jsonObject.put("inpatient_area_id", admDepartment.getInpatient_area_id());
            jsonObject.put("common_nurse_id", admDepartment.getCommon_nurse_id());
            jsonObject.put("create_time", admDepartment.getCreate_time());
            jsonArray.add(jsonObject);
        }
        // reply message
        this.setErrorCodeAndResultByPage("0",jsonArray,sEcho,displayLength);
        return SUCCESS;
    }
    public String addAdmDepartment() throws Exception{
        // getPara and validate
        String str_inpatient_area_id = this.getJsonObject("inpatient_area_id").toString();
        long inpatient_area_id = Long.parseLong(str_inpatient_area_id);
        Validate.notNull(inpatient_area_id, "参数inpatient_area_id不可为空");

        String name = this.getJsonObject("name").toString();
        Validate.notNull(name, "参数name不可为空");

        long department_direct_id = Long.parseLong(this.getJsonObject("department_direct_id").toString());
        Validate.notNull(department_direct_id, "参数department_direct_id不可为空");
        long common_nurse_id = Long.parseLong(this.getJsonObject("common_nurse_id").toString());
        Validate.notNull(common_nurse_id, "参数common_nurse_id不可为空");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 
        String create_time = df.format(new Date()).toString();//
        // set new AdmDepartment
        AdmDepartment admDepartment = new AdmDepartment();
        admDepartment.setName(name);
        admDepartment.setDepartment_direct_id(department_direct_id);
        admDepartment.setInpatient_area_id(inpatient_area_id);
        admDepartment.setCreate_time(create_time);
        admDepartment.setCommon_nurse_id(common_nurse_id);
        // save inpatientArea
        admDepartmentService.addAdmDepartment(admDepartment);
        // log and return
        String logContent = "添加部门完成(admDepartment:" + admDepartment.getId()
                + ")";
        ActionSupport.LOG.info(logContent);// 
        this.setErrorCodeAndResult("0", true);//
        return SUCCESS;
    }
    public String updateAdmDepartment() throws Exception{
        // getPara and validate
        String id = this.getJsonObject("id").toString();
        Validate.notNull(id, "参数id不可为空");

        String str_inpatient_area_id = this.getJsonObject("inpatient_area_id").toString();
        long inpatient_area_id = Long.parseLong(str_inpatient_area_id);
        Validate.notNull(inpatient_area_id, "参数inpatient_area_id不可为空");

        String name = this.getJsonObject("name").toString();
        Validate.notNull(name, "参数name不可为空");

        long department_direct_id = Long.parseLong(this.getJsonObject("department_direct_id").toString());
        Validate.notNull(department_direct_id, "参数department_direct_id不可为空");

        long common_nurse_id = Long.parseLong(this.getJsonObject("common_nurse_id").toString());
        Validate.notNull(common_nurse_id, "参数common_nurse_id不可为空");
        // set new AdmDepartment
        AdmDepartment admDepartment = new AdmDepartment();
        admDepartment.setId(Long.parseLong(id));
        admDepartment.setName(name);
        admDepartment.setDepartment_direct_id(department_direct_id);
        admDepartment.setInpatient_area_id(inpatient_area_id);
        admDepartment.setCommon_nurse_id(common_nurse_id);
        // save inpatientArea
        admDepartmentService.updateAdmDepartment(admDepartment);
        // log and return
        String logContent = "更新部门表完成(admDepartment id:" + admDepartment.getId() + ")";
        ActionSupport.LOG.info(logContent);//
        this.setErrorCodeAndResult("0", true);//
        return SUCCESS;
    }
    public String deleteAdmDepartment() throws Exception{
        // getPara and validate
        String id = this.getJsonObject("id").toString();
        Validate.notNull(id, "参数id不可为空");
        // call service to query
        AdmDepartment admDepartment = new AdmDepartment();
        admDepartment.setId(Integer.parseInt(id));
        admDepartmentService.deleteAdmDepartment(admDepartment);
        // reply message
        this.setErrorCodeAndResult("0", true);
        return SUCCESS;
    }

}
