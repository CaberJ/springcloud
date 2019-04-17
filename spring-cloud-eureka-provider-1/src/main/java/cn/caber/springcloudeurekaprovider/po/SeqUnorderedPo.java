package cn.caber.springcloudeurekaprovider.po;

public class SeqUnorderedPo{
	
	private static final long serialVersionUID = 1L;
	
	//alias
	public static final String TABLE_ALIAS = "SeqUnordered";
	//主键
	public static final String ALIAS_SEQUENCE_ID = "SEQUENCE_ID";
	//租户
	public static final String ALIAS_BANKKEY = "BANKKEY";
	//序列名称
	public static final String ALIAS_SEQ_NAME = "SEQ_NAME";
	//最小值
	public static final String ALIAS_MIN_VAL = "MIN_VAL";
	//最大值
	public static final String ALIAS_MAX_VAL = "MAX_VAL";
	//递增值
	public static final String ALIAS_INCREASE_VAL = "INCREASE_VAL";
	//区间最小值
	public static final String ALIAS_PARTITION_MIN_VAL = "PARTITION_MIN_VAL";
	//区间最大值
	public static final String ALIAS_PARTITION_MAX_VAL = "PARTITION_MAX_VAL";
	//当前值
	public static final String ALIAS_CURRENT_VAL = "CURRENT_VAL";
	//序列字符长度,不足左补0
	public static final String ALIAS_CHAR_LENGTH = "CHAR_LENGTH";
	//prefix
	public static final String ALIAS_PREFIX = "PREFIX";
	//appendDateFormat
	public static final String ALIAS_APPEND_DATE_FORMAT = "APPEND_DATE_FORMAT";
	//是否循环,默认为y表示循环
	public static final String ALIAS_CYCLE = "CYCLE";
	//操作员
	public static final String ALIAS_OPER_ID = "OPER_ID";
	//更新时间
	public static final String ALIAS_UPDATE_TIME = "UPDATE_TIME";
	//备注
	public static final String ALIAS_REMARK = "REMARK";
	

	//columns START
    /**
     * 主键       db_column: SEQUENCE_ID 
     */ 	
	private String sequenceId;
    /**
     * 租户       db_column: BANKKEY 
     */ 	
	private String bankkey;
    /**
     * 序列名称       db_column: SEQ_NAME 
     */ 	
	private String seqName;
    /**
     * 最小值       db_column: MIN_VAL 
     */ 	
	private java.math.BigDecimal minVal;
    /**
     * 最大值       db_column: MAX_VAL 
     */ 	
	private java.math.BigDecimal maxVal;
    /**
     * 递增值       db_column: INCREASE_VAL 
     */ 	
	private java.math.BigDecimal increaseVal;
    /**
     * 区间最小值       db_column: PARTITION_MIN_VAL 
     */ 	
	private java.math.BigDecimal partitionMinVal;
    /**
     * 区间最大值       db_column: PARTITION_MAX_VAL 
     */ 	
	private java.math.BigDecimal partitionMaxVal;
    /**
     * 当前值       db_column: CURRENT_VAL 
     */ 	
	private java.math.BigDecimal currentVal;
    /**
     * 序列字符长度,不足左补0       db_column: CHAR_LENGTH 
     */ 	
	private java.math.BigDecimal charLength;
    /**
     * prefix       db_column: PREFIX 
     */ 	
	private String prefix;
    /**
     * appendDateFormat       db_column: APPEND_DATE_FORMAT 
     */ 	
	private String appendDateFormat;
    /**
     * 是否循环,默认为y表示循环       db_column: CYCLE 
     */ 	
	private String cycle;
    /**
     * 操作员       db_column: OPER_ID 
     */ 	
	private String operId;
    /**
     * 更新时间       db_column: UPDATE_TIME 
     */ 	
	private java.sql.Timestamp updateTime;
    /**
     * 备注       db_column: REMARK 
     */ 	
	private String remark;
	//columns END


	
	
	public String getSequenceId() {
		return this.sequenceId;
	}
	
	public void setSequenceId(String value) {
		this.sequenceId = value;
	}
	
	
	public String getBankkey() {
		return this.bankkey;
	}
	
	public void setBankkey(String value) {
		this.bankkey = value;
	}
	
	
	public String getSeqName() {
		return this.seqName;
	}
	
	public void setSeqName(String value) {
		this.seqName = value;
	}
	
	
	public java.math.BigDecimal getMinVal() {
		return this.minVal;
	}
	
	public void setMinVal(java.math.BigDecimal value) {
		this.minVal = value;
	}
	
	
	public java.math.BigDecimal getMaxVal() {
		return this.maxVal;
	}
	
	public void setMaxVal(java.math.BigDecimal value) {
		this.maxVal = value;
	}
	
	
	public java.math.BigDecimal getIncreaseVal() {
		return this.increaseVal;
	}
	
	public void setIncreaseVal(java.math.BigDecimal value) {
		this.increaseVal = value;
	}
	
	
	public java.math.BigDecimal getPartitionMinVal() {
		return this.partitionMinVal;
	}
	
	public void setPartitionMinVal(java.math.BigDecimal value) {
		this.partitionMinVal = value;
	}
	
	
	public java.math.BigDecimal getPartitionMaxVal() {
		return this.partitionMaxVal;
	}
	
	public void setPartitionMaxVal(java.math.BigDecimal value) {
		this.partitionMaxVal = value;
	}
	
	
	public java.math.BigDecimal getCurrentVal() {
		return this.currentVal;
	}
	
	public void setCurrentVal(java.math.BigDecimal value) {
		this.currentVal = value;
	}
	
	
	public java.math.BigDecimal getCharLength() {
		return this.charLength;
	}
	
	public void setCharLength(java.math.BigDecimal value) {
		this.charLength = value;
	}
	
	
	public String getPrefix() {
		return this.prefix;
	}
	
	public void setPrefix(String value) {
		this.prefix = value;
	}
	
	
	public String getAppendDateFormat() {
		return this.appendDateFormat;
	}
	
	public void setAppendDateFormat(String value) {
		this.appendDateFormat = value;
	}
	
	
	public String getCycle() {
		return this.cycle;
	}
	
	public void setCycle(String value) {
		this.cycle = value;
	}
	
	
	public String getOperId() {
		return this.operId;
	}
	
	public void setOperId(String value) {
		this.operId = value;
	}
	
	
	public java.sql.Timestamp getUpdateTime() {
		return this.updateTime;
	}
	
	public void setUpdateTime(java.sql.Timestamp value) {
		this.updateTime = value;
	}
	
	
	public String getRemark() {
		return this.remark;
	}
	
	public void setRemark(String value) {
		this.remark = value;
	}
	

	

}

