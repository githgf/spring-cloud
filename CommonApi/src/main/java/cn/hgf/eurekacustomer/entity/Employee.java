package cn.hgf.eurekacustomer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data//get、set方法
@NoArgsConstructor//无参构造器
@Accessors(chain = true)//这个注解让类支持链式编程，也就是说set方法返回为this，而不是void
@ToString
public class Employee implements java.io.Serializable
{

	private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Date birth;
    private Department department;


    public Employee(Integer id, String lastName, String email, Integer gender,
                    Department department) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }


}
