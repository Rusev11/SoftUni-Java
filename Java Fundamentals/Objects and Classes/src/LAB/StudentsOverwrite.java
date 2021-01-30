package LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsOverwrite {
    public static class Student {
        String firstName;
        String lastName;
        int age;
        String city;

        Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String line = scanner.nextLine();
        boolean studentExisting = false;
        while (!line.equals("end")) {
            String[] lineArray = line.split(" ");
            Student student = new Student(lineArray[0], lineArray[1], Integer.parseInt(lineArray[2]), lineArray[3]);
            for (Student studentObject : students) {
                if (studentObject.getFirstName().equals(student.getFirstName())
                        && studentObject.getLastName().equals(student.getLastName())) {
                    studentObject.setAge(student.getAge());
                    studentObject.setCity(student.getCity());
                    studentExisting = true;
                    break;
                }
            }
            if (!studentExisting) {
                students.add(student);
            }
            studentExisting = false;
            line = scanner.nextLine();
        }
        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(city)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
