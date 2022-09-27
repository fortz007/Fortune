package model;

public abstract class Person {
    private Integer id;
    private String name;
    private Character sex;
    private String contact;

    public Person (){
    }

    public Person(Integer id, String name, Character sex, String contact) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.contact = contact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", contact='" + contact + '\'' +
                '}';
    }
}
