class Student {
    String USN;
    String Name;
    String Marks;

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.USN = "4NI23CS001";
        s1.Name = "Dev Tiwary";
        s1.Marks ="90";

        System.out.println("Student Details:");
        System.out.println("USN: " + s1.USN);
        System.out.println("Name: " + s1.Name);
        System.out.println("Marks: " + s1.Marks);
    }
}
