package conureface;

/**
 * Created by Dost Muhammad on 5/31/2018.
 */
public class Student {
    private String firsname;
    private String lastname;

    public Student() {
    }

    public Student(String firsname, String lastname) {
        this.firsname = firsname;
        this.lastname = lastname;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
