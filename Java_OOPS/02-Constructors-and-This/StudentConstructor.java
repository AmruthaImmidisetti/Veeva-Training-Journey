class StudentConstructor {
    String name;
    int age;

    StudentConstructor() {
        name = "Not assigned";
        age = 0;
    }

    StudentConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor();
        StudentConstructor s2 = new StudentConstructor("Anu", 20);

        s1.display();
        s2.display();
    }
}
