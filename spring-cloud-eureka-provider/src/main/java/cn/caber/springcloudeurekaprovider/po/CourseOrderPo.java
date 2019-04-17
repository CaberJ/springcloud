package cn.caber.springcloudeurekaprovider.po;


import java.io.Serializable;


public class CourseOrderPo implements Serializable{


	private Integer id;

	private Integer userId;
	private String orderNo;
    /**
     * 机构名称       db_column: real_name 
     */ 	
	private String realName;
    /**
     * 课程名称       db_column: course_name 
     */ 	
	private String courseName;
    /**
     * 课程分类ID       db_column: course_id 
     */ 	
	private Integer courseId;
    /**
     * 创建时间       db_column: create_time 
     */ 	
	private java.sql.Timestamp createTime;
    /**
     * 课程时间       db_column: course_time 
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
    /**
     * 付款状态 0未付款 1已付款       db_column: payment_status 
     */ 	
	private Integer paymentStatus;
    /**
     * 评价状态 0未评价 1已评价       db_column: evaluation_status 
     */ 	
	private Integer evaluationStatus;
    /**
     * 删除状态 0正常 1删除       db_column: isdel 
     */ 	
	private Integer isdel;
	//columns END


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(Integer value) {
		this.userId = value;
	}
	
	
	public String getRealName() {
		return this.realName;
	}
	
	public void setRealName(String value) {
		this.realName = value;
	}
	
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void setCourseName(String value) {
		this.courseName = value;
	}
	
	
	public Integer getCourseId() {
		return this.courseId;
	}
	
	public void setCourseId(Integer value) {
		this.courseId = value;
	}
	
	
	public java.sql.Timestamp getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.sql.Timestamp value) {
		this.createTime = value;
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
	
	
	public Integer getPaymentStatus() {
		return this.paymentStatus;
	}
	
	public void setPaymentStatus(Integer value) {
		this.paymentStatus = value;
	}
	
	
	public Integer getEvaluationStatus() {
		return this.evaluationStatus;
	}
	
	public void setEvaluationStatus(Integer value) {
		this.evaluationStatus = value;
	}
	
	
	public Integer getIsdel() {
		return this.isdel;
	}
	
	public void setIsdel(Integer value) {
		this.isdel = value;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	

	

}

