class Student{
Course course  = new Course();

void takeCourse(){
course.applyForCourse();
}

}
class Course{
void applyForCourse(){
System.out.println("Student has Apply for Course");
}

}
class LiskovPrinciple{
public static void main(String args[]){
Student ram = new Student();
ram.takeCourse();
}
}