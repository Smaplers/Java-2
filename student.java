

package pack;



public class student extends personnel {  //子类

    public student(int number, String name, char sex,courses a){

        super(number,name,sex);

        this.a = a;

    }

    public String toString(){

        return  "\n" + "student(学生信息):  姓名：" + name

                + "    学号：" + number + "   性别：" + sex + "\n" + "所选课程信息:   " + a;

    }

    }