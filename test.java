package pack;



import java.util.Scanner;     //��Ҫ�����Ǽ��ı�ɨ�衢��ȡ����̨����

public class test {

    public static void main(String[] args) {

        int flag = 1;

        courses s = null;

        while (flag == 1) {

            Scanner in = new Scanner(System.in);

            courses a = s;      //��a���г�ʼ����ֵ

            student w = new student(2019311147, "shw", 'M',a);

            System.out.println("ѧ����Ϣ");

            System.out.println(w);

            teacher b = new teacher(1, "��", 'M', "��ѧ");

            teacher c = new teacher(2, "��", 'M', "��ѧ");

            teacher d = new teacher(3, "��", 'W', "Ӣ��");

            System.out.println("��ʦ��Ϣ");

            System.out.println(b);

            System.out.println(c);

            System.out.println(d);

            courses e = new courses("��ѧ", 7, "101", 2, 2);

            courses f = new courses("Ӣ��", 8, "102", 2, 3);

            courses g = new courses("��ѧ", 9, "103", 2, 4);

            System.out.println("�γ���Ϣ");

            System.out.println(e);

            System.out.println(f);

            System.out.println(g);

            System.out.println("������1,2,3����ѡ��: ");

            int x = in.nextInt();// Scanner ������ȡ�û�������

            if (x == 1) {

                a = e;

                System.out.println("��ѡ��: " + e);

                System.out.println(b);

            } else if (x == 2) {

                a = f;

                System.out.println("��ѡ��: " + f);

                System.out.println(c);

            } else if (x == 3) {

                a = g;

                System.out.println("��ѡ��: " + g);

                System.out.println(d);

            } else {

                System.out.println("δ�鵽�γ�");

            }

            student n = new student(2019310630, "ȫ�Ӱ�", 'M',a);

            System.out.println(n);



            System.out.println("������1,2,3�����˿�: ");

            int y = in.nextInt();

            while (x == 1)      //ȷ��ֻ������ѡ�γ�

                if (y == 1) {

                    a = null;

                    System.out.println("���˿�: " + e);

                    System.out.println(b);

                    break;

                } else {

                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");

                    s = e;

                    break;

                }



            while (x == 2)

                if (y == 2) {

                    a = null;

                    System.out.println("���˿�: " + f);

                    System.out.println(c);

                    break;

                } else {

                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");

                    s = f;

                    break;

                }



            while (x == 3)

                if (y == 3) {

                    a = null;

                    System.out.println("���˿�: " + g);

                    System.out.println(d);

                    break;

                } else {

                    System.out.println("δ�鵽��ѡ�ÿγ̣��޷��˿�");

                    s = g;

                    break;

                }

            student o = new student(2019310630, "ȫ�Ӱ�", 'M',a);

            System.out.println(o);



            System.out.println("����1����2ѡ�����ѡ�˿λ����˳�");

            int z = in.nextInt();

            while (z == 1) {

                System.out.println("����ѡ��");

                break;



            }

            while (z == 2) {

                flag = 0;

                System.out.println("�˳�");

                break;

            }

        }

    }

}