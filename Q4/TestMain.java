package Q4;
import java.util.HashMap;
import java.util.Map;



class MyRepository<T> implements Repository<T>{
    private final Map<Integer,T> map = new HashMap<>();
    private int id = 0;

    @Override
    public int save(T data) {
        map.put(id,data);
        return id++;
    }

    @Override
    public T getById(int id) {
        return map.get(id);
    }

    public void printAll(){
        for(Map.Entry<Integer,T> entry : map.entrySet()){
            System.out.println("id:" + entry.getKey() + " ,数据:" + entry.getValue());
        }
    }
}

class User {
    private final String name;
    private final int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}

public class TestMain{
    public static void main(String[] args) {
        MyRepository<String> stringRepo = new MyRepository<>();
        stringRepo.save("Java");
        stringRepo.save("Spring");
        System.out.println("=====String仓库全部数据=====");
        stringRepo.printAll();

        MyRepository<User> userRepo = new MyRepository<>();
        userRepo.save(new User("张三",18));
        userRepo.save(new User("李四",20));
        System.out.println("=====User仓库全部数据=====");
        userRepo.printAll();

        MyRepository<Integer> intRepo = new MyRepository<>();
        intRepo.save(100);
        intRepo.save(200);
        System.out.println("=====Integer仓库全部数据=====");
        intRepo.printAll();
    }
}

