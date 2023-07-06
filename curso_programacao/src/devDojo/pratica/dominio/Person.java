package devDojo.pratica.dominio;

public class Person {
    String name;
    Integer age;
    Double account;
    Person [] people;

    public Person(String name, Integer age, Double account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }
    public void tax(){
        System.out.println("Tax payed: "+(account/12));
    }
    public void withdraw(double value){
        this.account = account-value;
    }
    public void deposit(double value){
        this.account = account+value;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
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
