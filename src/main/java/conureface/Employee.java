package conureface;

import lombok.Data;

/**
 * Created by Dost Muhammad on 6/1/2018.
 */
@Data
public class Employee {
    private int id;
    private String name;
    private String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}
