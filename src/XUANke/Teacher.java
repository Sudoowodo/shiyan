package XUANke;

	public class Teacher extends Father {
        String Lesson;
		private String Age;
        String getlesson() {
    return Lesson;
	  }
	 
public Teacher(String name,String num,String sex,String lesson,String age) {
	    this.Name=name;
	    this.Num=num;
	    this.Sex=sex;
	    this.Lesson=lesson;
	    this.Age=age;
	 }
public String toString() {
    return "教师信息：姓名:"+Name+" 工号:"+Num+" 性别:"+Sex+" 所授课程:"+Lesson+" 年龄："+Age;
	 }
public void setAge(String age) {
	    Age=age;
	 }
public void setName(String name) {
	    Name=name;
	 }

     }
