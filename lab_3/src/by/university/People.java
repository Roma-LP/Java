package by.university;

public class People {
    String name;        // имя
    String secName;     // фамилия
    int age;            // возраст
    boolean sex;        // пол true-м false-ж

    public People(String name, String secName, int age, boolean sex) {
        this.name = name;
        this.secName = secName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSecName() {
        return secName;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", secName='" + secName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
