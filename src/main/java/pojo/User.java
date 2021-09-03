package pojo;

import java.io.Serializable;

/**
 * @Author dll
 * @Date 2021/9/3 8:49
 * @Email 137578736@qq.com
 * @Version 1.0
 **/
public class User implements Serializable {
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
