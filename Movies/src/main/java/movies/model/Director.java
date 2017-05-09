package movies.model;

public class Director {
    private String name;
    private int age;
    private int id;

    public Director (String name, int age, int id) {
        this.id = id;
        this.name = name;
        this.age = age;

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
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}