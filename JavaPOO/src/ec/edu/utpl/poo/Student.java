package ec.edu.utpl.poo;

public class Student {
    // Atributo de clase
    private static String university;
    // Atributo de instancia
    private String name;
    private int age;
    private int semester;
    private String carreer;

    // Constructor

    public Student(String name, int age, int semester) {
        this.setName(name);
        this.setAge(age);
        this.setSemester(semester);
        setUniversity("UTPL");
    }

    // Sobrecarga de constructor

    public Student(String name, int age, int semester, String carreer) {
        this.setName(name);
        this.setAge(age);
        this.setSemester(semester);
        this.setCarreer(carreer);
        setUniversity("UTPL");
    }

    // Getters y setters atributos de instancia

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCarreer() {
        return carreer;
    }

    public void setCarreer(String carreer) {
        this.carreer = carreer;
    }

    // Getter y setter atributos de clase

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }
}
