package XUANke;

public class Course {

		    String Name;
	        String getName() {
	    return Name;
	   }
	        String Num;
	        String getNum() {
	    return Num;
	   }
	        String Place;
	        String getPlace (){
	    return Place;
	   }
	        String Time;
	        String getTime(){
	    return Time;
	   }
	        String Score;
	        String getScore(){
	    return Score;
	   }
	public Course(String name,String num,String place,String time,String score) {
	        this.Name=name;
	        this.Num=num;
	        this.Place=place;
	        this.Time=time;
	        this.Score=score;
	   }
	public String toString() {
	    return "�γ����ԣ��γ����ƣ�"+Name+" �γ̱�ţ�"+Num+" �Ͽεص㣺"+Place+" �Ͽ�ʱ�䣺"+Time+" "
	   + "�γ�ѧ�֣�"+Score;
	   }

	   }


