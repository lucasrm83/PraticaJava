package devDojo.pratica.dominio;

public class Person {
    String name;
    Integer age;
    Double account;

    public Person(String name, Integer age, Double account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }
    public void tax(){
        System.out.println("Tax payed: "+(account/12));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }

}
