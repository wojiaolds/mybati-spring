package mybatis.spring;

/**
 * @Author: lds
 * @Date: 2019/6/12 9:38
 */
public class User {
	
	private Integer Id;
	
	private String name;
	
	public Integer getId () {
		
		return Id;
	}
	
	public void setId ( Integer id ) {
		
		Id = id;
	}
	
	public String getName () {
		
		return name;
	}
	
	public void setName ( String name ) {
		
		this.name = name;
	}
}
