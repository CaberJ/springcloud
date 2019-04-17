package cn.caber.springcloudeurekaprovider.po;


public class CoursePo{
	
	private static final long serialVersionUID = 1L;
	
	//alias
	public static final String TABLE_ALIAS = "Course";
	//序号
	public static final String ALIAS_SERIAL_NUM = "SERIAL_NUM";
	//机构名称
	public static final String ALIAS_ORG_NAME = "ORG_NAME";
	//课程名称
	public static final String ALIAS_COURSE_NAME = "COURSE_NAME";
	//课程分类ID
	public static final String ALIAS_COURSE_TYPE_ID = "COURSE_TYPE_ID";
	//有效期开始时间
	public static final String ALIAS_VALIDITY_DATE_BEGIN = "VALIDITY_DATE_BEGIN";
	//validityDateEnd
	public static final String ALIAS_VALIDITY_DATE_END = "VALIDITY_DATE_END";
	//课时段
	public static final String ALIAS_COURSE_TIME = "COURSE_TIME";
	//课时数
	public static final String ALIAS_COURSE_NUM = "COURSE_NUM";
	//付款金额
	public static final String ALIAS_PAYMENT_AMOUNT = "PAYMENT_AMOUNT";
	

	//columns START
    /**
     * 序号       db_column: serial_num 
     */ 	
	private Integer id;
	
	private Integer serialNum;
    /**
     * 机构名称       db_column: org_name 
     */ 	
	private String orgName;
    /**
     * 课程名称       db_column: course_name 
     */ 	
	private String courseName;
    /**
     * 课程分类ID       db_column: course_type_id 
     */ 	
	private Integer courseTypeId;
    /**
     * 有效期开始时间       db_column: validity_date_begin 
     */ 	
	private java.sql.Date validityDateBegin;
    /**
     * validityDateEnd       db_column: validity_date_end 
     */ 	
	private java.sql.Date validityDateEnd;
    /**
     * 课时段       db_column: course_time 
     */ 	
	private String courseTime;
    /**
     * 课时数       db_column: course_num 
     */ 	
	private Integer courseNum;
    /**
     * 付款金额       db_column: payment_amount 
     */ 	
	private Double paymentAmount;
	//columns END


	
	public Integer getSerialNum() {
		return this.serialNum;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setSerialNum(Integer value) {
		this.serialNum = value;
	}
	
	
	public String getOrgName() {
		return this.orgName;
	}
	
	public void setOrgName(String value) {
		this.orgName = value;
	}
	
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String value) {
		this.courseName = value;
	}
	
	
	public Integer getCourseTypeId() {
		return this.courseTypeId;
	}
	
	public void setCourseTypeId(Integer value) {
		this.courseTypeId = value;
	}
	
	
	public java.sql.Date getValidityDateBegin() {
		return this.validityDateBegin;
	}
	
	public void setValidityDateBegin(java.sql.Date value) {
		this.validityDateBegin = value;
	}
	
	
	public java.sql.Date getValidityDateEnd() {
		return this.validityDateEnd;
	}
	
	public void setValidityDateEnd(java.sql.Date value) {
		this.validityDateEnd = value;
	}
	
	
	public String getCourseTime() {
		return this.courseTime;
	}
	
	public void setCourseTime(String value) {
		this.courseTime = value;
	}
	
	
	public Integer getCourseNum() {
		return this.courseNum;
	}
	
	public void setCourseNum(Integer value) {
		this.courseNum = value;
	}
	
	
	public Double getPaymentAmount() {
		return this.paymentAmount;
	}
	
	public void setPaymentAmount(Double value) {
		this.paymentAmount = value;
	}
	

	

}

