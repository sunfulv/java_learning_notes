package ClassAndOOP;

public class staticAttribute {
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setId();
        System.out.println(e1);
        Employee e2 = new Employee();
        e2.setId();
        System.out.println(e2);

    }
}

class Employee{
    private int id;
    static private int nextId; //用于计数生成的员工对象的下一个id,

    public void setId(){
        this.id = Employee.nextId;
        nextId++;
    }

    @Override
    public String toString(){
        String s = String.format("当前设置的员工id为:%d,下一个员工id为:%d",this.id, Employee.nextId);
        return s;
    }


}