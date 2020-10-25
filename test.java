package pack;



import java.util.Scanner;     //主要功能是简化文本扫描、获取控制台输入

public class test {

    public static void main(String[] args) {

        int flag = 1;

        courses s = null;

        while (flag == 1) {

            Scanner in = new Scanner(System.in);

            courses a = s;      //对a进行初始化赋值

            student w = new student(2019311147, "shw", 'M',a);

            System.out.println("学生信息");

            System.out.println(w);

            teacher b = new teacher(1, "王", 'M', "数学");

            teacher c = new teacher(2, "李", 'M', "化学");

            teacher d = new teacher(3, "张", 'W', "英语");

            System.out.println("教师信息");

            System.out.println(b);

            System.out.println(c);

            System.out.println(d);

            courses e = new courses("数学", 7, "101", 2, 2);

            courses f = new courses("英语", 8, "102", 2, 3);

            courses g = new courses("化学", 9, "103", 2, 4);

            System.out.println("课程信息");

            System.out.println(e);

            System.out.println(f);

            System.out.println(g);

            System.out.println("请输入1,2,3进行选课: ");

            int x = in.nextInt();// Scanner 类来获取用户的输入

            if (x == 1) {

                a = e;

                System.out.println("已选课: " + e);

                System.out.println(b);

            } else if (x == 2) {

                a = f;

                System.out.println("已选课: " + f);

                System.out.println(c);

            } else if (x == 3) {

                a = g;

                System.out.println("已选课: " + g);

                System.out.println(d);

            } else {

                System.out.println("未查到课程");

            }

            student n = new student(2019310630, "全子昂", 'M',a);

            System.out.println(n);



            System.out.println("请输入1,2,3进行退课: ");

            int y = in.nextInt();

            while (x == 1)      //确保只能退已选课程

                if (y == 1) {

                    a = null;

                    System.out.println("已退课: " + e);

                    System.out.println(b);

                    break;

                } else {

                    System.out.println("未查到已选该课程，无法退课");

                    s = e;

                    break;

                }



            while (x == 2)

                if (y == 2) {

                    a = null;

                    System.out.println("已退课: " + f);

                    System.out.println(c);

                    break;

                } else {

                    System.out.println("未查到已选该课程，无法退课");

                    s = f;

                    break;

                }



            while (x == 3)

                if (y == 3) {

                    a = null;

                    System.out.println("已退课: " + g);

                    System.out.println(d);

                    break;

                } else {

                    System.out.println("未查到已选该课程，无法退课");

                    s = g;

                    break;

                }

            student o = new student(2019310630, "全子昂", 'M',a);

            System.out.println(o);



            System.out.println("输入1或者2选择继续选退课或者退出");

            int z = in.nextInt();

            while (z == 1) {

                System.out.println("继续选课");

                break;



            }

            while (z == 2) {

                flag = 0;

                System.out.println("退出");

                break;

            }

        }

    }

}