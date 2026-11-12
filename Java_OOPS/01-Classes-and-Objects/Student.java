class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anu";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Ravi";
        s2.age = 21;

        s1.display();
        s2.display();
    }
}
