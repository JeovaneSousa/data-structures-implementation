package vector;

public class VectorTest {

    public static void main(String[] args) {
        Student student1 = new Student("Joao");
        Student student2 = new Student("Jose");
        Student student3 = new Student("Danilo");
        Student student4 = new Student("Jeovane");
        Vector list = new Vector();

        System.out.println(list.size());
        list.add(student1);
        System.out.println(list.size());
        list.add(student2);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println(list.contains(student1));
        System.out.println(list.contains(student4));

        System.out.println(list.get(0));
        list.add(1,student3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
