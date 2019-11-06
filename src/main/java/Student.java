class Student {
    private String name;
    private int age;
    private String gender;
    private double grade;

    //Student s = new Student("Remi Jonathan", 21, "Male", 92.5);
    public Student(String n, int a, String gen, double gd) {
        name = n;
        age = a;
        gender = gen;
        grade = gd;
    }

    //String studentName = student.getName();
    public String getName() {
        return name;
    }

    //student.setName("Pedro");
    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}