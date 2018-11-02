package cn.hgf.eurekacustomer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class Department implements java.io.Serializable
{

	private Integer id;
	private String departmentName;

	public Department(int i, String string) {
		this.id = i;
		this.departmentName = string;
	}


}
