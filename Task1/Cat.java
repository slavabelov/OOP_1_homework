public class Cat{
    private String name;
    private int age;
    private String ownername;

    public Cat(String name, int age){
        
        this.name = name;
        this.age = age;
        this.ownername = ownername;
    }

  
    private Cat(String name, int age) {
        
        this("", null, null);
    }

    private Cat(String name) {
        
        this("", null);
    }

    public Cat() {
        
        this("");
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

    public void greeting() {
        if (getOwnerName() != null){
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец " + getOwnerName() + ".");
        } else {
            System.out.println("Вы не указали имя владельца");
        }
    }
  
}