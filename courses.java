
package pack;



public class courses {

    int number;

    String coursesname;

    String place;

    float time;

    float score;





    public courses(String coursesname, int number, String place, float time, float score) {

        this.coursesname = coursesname;

        this.number = number;

        this.place = place;

        this.time = time;

        this.score = score;



    }



    public String toString() {

        return   coursesname+    "(�γ���Ϣ)" + "     �γ̱�ţ�" + number + "   �Ͽεص㣺" + place

                + "    �γ�ʱ�䣺" + time + "Сʱ" + "     �γ�ѧ�֣�" + score + "��";

    }

}