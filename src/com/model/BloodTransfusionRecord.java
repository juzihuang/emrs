package com.model;

public class BloodTransfusionRecord {

		private String  id;  //主键
		private String  patient_id;  //病案号
		private String  history_blood_trans;  //既往输血史,1表示有，0表示无
		private int  pregnancies;  //怀孕次数
		private int  labors;  //生产次数
		private String  patient_blood_trans_type;  //输血性质,1表示常规，2表示紧急，3表示大量，4表示特殊
		private String  donor_name;   //供血者姓名
		private String  donor_blood_type;  //供血者血型
		private String  donor_blood_num;  //供血者血袋号
		private String  donor_blood_breed;  //血液品种
		private String  donor_blood_volume;  //供血量
		private String  recheck_blood_result;  //复检血液结果
		private String  cross_match_test_and_result;  //交叉配血试验方法及结果
		private String  irregular_antibody_screen_res;  //不规则抗体筛选结果
		private String  other_examination_result;  //其他检查结果
		private String  rechecker_id;   //复检者
		private String  cross_matcher_id;   //配血者
		private String  blood_pickup_id;  //发血者
		private String  blood_get_id;  //取血者
		private String  pickup_date;  //发血时间
		
		public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }
	    
	    public String getPatient_id() {
	        return patient_id;
	    }

	    public void setPatient_id(String patient_id) {
	        this.patient_id = patient_id;
	    }

	    public String getPickup_date() {
	        return pickup_date;
	    }

	    public void setPickup_date(String pickup_date) {
	        this.pickup_date = pickup_date;
	    }
	    
	    public String getHistory_blood_trans() {
	        return history_blood_trans;
	    }

	    public void setHistory_blood_trans(String history_blood_trans) {
	        this.history_blood_trans = history_blood_trans;
	    }
	    
	    public int getPregnancies() {
	        return pregnancies;
	    }

	    public void setPregnancies(int pregnancies) {
	        this.pregnancies = pregnancies;
	    }
	    
	    public int getLabors() {
	        return labors;
	    }

	    public void setLabors(int labors) {
	        this.labors = labors;
	    }
	    
	    public String getPatient_blood_trans_type() {
	        return patient_blood_trans_type;
	    }

	    public void setPatient_blood_trans_type(String patient_blood_trans_type) {
	        this.patient_blood_trans_type = patient_blood_trans_type;
	    }
	    
	    public String getDonor_name() {
	        return donor_name;
	    }

	    public void setDonor_name(String donor_name) {
	        this.donor_name = donor_name;
	    }
	    
	    public String getDonor_blood_type() {
	        return donor_blood_type;
	    }

	    public void setDonor_blood_type(String donor_blood_type) {
	        this.donor_blood_type = donor_blood_type;
	    }
	  
	    public String getDonor_blood_num() {
	        return donor_blood_num;
	    }
	    
	    public void setDonor_blood_num(String donor_blood_num) {
	        this.donor_blood_num = donor_blood_num;
	    }
	    
	    public String getDonor_blood_breed() {
	        return donor_blood_breed;
	    }
	    
	    public void setDonor_blood_breed(String donor_blood_breed) {
	        this.donor_blood_breed = donor_blood_breed;
	    }
	   
	    public String getDonor_blood_volume() {
	        return donor_blood_volume;
	    }
	    
	    public void setDonor_blood_volume(String donor_blood_volume) {
	        this.donor_blood_volume = donor_blood_volume;
	    }
	    
	    public String getRecheck_blood_result() {
	        return recheck_blood_result;
	    }
	    
	    public void setRecheck_blood_result(String recheck_blood_result) {
	        this.recheck_blood_result = recheck_blood_result;
	    }
	    
	    public String getCross_match_test_and_result() {
	        return cross_match_test_and_result;
	    }

	    public void setCross_match_test_and_result(String cross_match_test_and_result) {
	        this.cross_match_test_and_result = cross_match_test_and_result;
	    }
	    
	    public String getIrregular_antibody_screen_res() {
	        return irregular_antibody_screen_res;
	    }

	    public void setIrregular_antibody_screen_res(String irregular_antibody_screen_res) {
	        this.irregular_antibody_screen_res = irregular_antibody_screen_res;
	    }

	    public String getOther_examination_result() {
	        return other_examination_result;
	    }

	    public void setOther_examination_result(String other_examination_result) {
	        this.other_examination_result = other_examination_result;
	    }
	    
	    public String getRechecker_id() {
	        return rechecker_id;
	    }

	    public void setRechecker_id(String rechecker_id) {
	        this.rechecker_id = rechecker_id;
	    }
	    
	    public String getCross_matcher_id() {
	        return cross_matcher_id;
	    }

	    public void setCross_matcher_id(String cross_matcher_id) {
	        this.cross_matcher_id = cross_matcher_id;
	    }

	    public String getBlood_pickup_id() {
	        return blood_pickup_id;
	    }

	    public void setBlood_pickup_id(String blood_pickup_id) {
	        this.blood_pickup_id = blood_pickup_id;
	    }

	    public String getBlood_get_id() {
	        return blood_get_id;
	    }

	    public void setBlood_get_id(String blood_get_id) {
	        this.blood_get_id = blood_get_id;
	    }


}
