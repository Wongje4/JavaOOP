import model.Student;

public class main {
    public static void  main(String[] args)
    {
        Student abc = new Student("Jennifer",20,"F",12345678);
        System.out.println(abc.getName());
        System.out.println(abc.getAge());
        System.out.println(abc.getGender());
        System.out.println(abc.getId());
    }
}
