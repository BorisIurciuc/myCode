package InteractionObjects.association.oneToMany02;

class Student {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Course {
    private Student[] students;
    int n;
    int count; // Добавлен счетчик для отслеживания количества добавленных студентов

    public Course(int n) {
        this.n = n;
        students = new Student[n];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < n) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Course is full, cannot add more students.");
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " student " + students[i].getName());
        }
    }
}

public class Main
{
    public static void main(String[] args) {
        Student student1 = new Student("Jon");
        Student student2 = new Student("Don");
        Student student3 = new Student("Shon");
        Course course = new Course(3);

        // Устанавливаем связь, добавляя студентов в курс
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);

        course.print();
    }
}