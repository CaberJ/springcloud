package cn.caber.springcloudeurekaprovider.po;

public class SsUserPo{
	
	private static final long serialVersionUID = 1L;
	
	//alias
	public static final String TABLE_ALIAS = "SsUser";
	//用户姓名
	public static final String ALIAS_REAL_NAME = "REAL_NAME";
	
	private Integer id;
	
	
	//columns START
    /**
     * 用户姓名       db_column: real_name 
     */ 	
	private String realName;
	//columns END


	public String getRealName() {
		return this.realName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setRealName(String value) {
		this.realName = value;
	}
	

	

}

