public class Cat {
    //Attribute
    private String name;
    private int age;
    //Konstrukter
    public Cat(String neuerName,int neuerAge) {
        this.name = neuerName;
        this.age = neuerAge;
    }

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

    public void ausgabe() {
        System.out.println("meow meow");
    }

}

