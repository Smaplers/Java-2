

package pack;



public class student extends personnel {  //����

    public student(int number, String name, char sex,courses a){

        super(number,name,sex);

        this.a = a;

    }

    public String toString(){

        return  "\n" + "student(ѧ����Ϣ):  ������" + name

                + "    ѧ�ţ�" + number + "   �Ա�" + sex + "\n" + "��ѡ�γ���Ϣ:   " + a;

    }

    }