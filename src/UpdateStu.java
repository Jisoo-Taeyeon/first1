import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu  implements  Comparable<Object> {

    String name;
    long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UpdateStu(String name, long id) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Object o) {
        UpdateStu upstu = (UpdateStu) o;
        int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
        return result;

    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("李同学", 01011);
        UpdateStu stu2 = new UpdateStu("王同学", 01012);
        UpdateStu stu3 = new UpdateStu("魏同学", 01013);
        TreeSet<UpdateStu> tree = new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        Iterator<UpdateStu> it = tree.iterator();
        System.out.println("集合中所有的元素：");
        while (it.hasNext()) {
            UpdateStu stu = (UpdateStu) it.next();
            System.out.println(stu.getName() + " " + stu.getId());

        }
    }
}