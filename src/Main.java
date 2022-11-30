import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MyException{
        List<Student> students = new ArrayList<>();
        try {
            students.add(new Student("ali", 5));
            students.add(new Student("ali", 10));
            students.add(null);
            System.out.println(students.get(10));
        }catch (MyException | IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println(students);

    }
}