package com.test1;

public class School {
    /**
     * 多态的使用，节省具有相同功能的代码量
     * 强制类型转换时需要先用instanceof判断是否是该子类的对象实例
     * 多个对象参数时可以用...
     * @param person
     */
    public void tick(Person person) {
        person.talk();

        if (person instanceof Student) {
            Student student = (Student) person;
            student.writeHomework();
        } else if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.arrageHomework();
        }
    }

    public void tick(Person...person) {
        for (Person p : person) {
            if (p instanceof Student) {
                Student student = (Student) p;
                student.writeHomework();
            } else if (p instanceof Teacher) {
                Teacher teacher = (Teacher) p;
                teacher.arrageHomework();
            }
        }
    }

}
