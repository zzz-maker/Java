/**
 * 学生交学费实验
 *
 * @author zhangyj
 * @version 1.0.0 2020-11-02
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("James");
        Student s2 = new Student("Kitty");

        Student[] unFees = new Student[]{s1, s2};
        for (Student s : unFees) {
            s.fees();
        }
        s1.show();
        s2.show();
    }
}

class Student {
    Student(String n) {
        name = n;
    }

    String name;

    Boolean isFees = false;

    void fees() {
        isFees = true;
    }

    void show() {
        System.out.println(name + "--->" + isFees);
    }
}
