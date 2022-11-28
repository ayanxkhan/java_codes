class employee{
    int id;
    String name;
    public void info(){
        System.out.println("Employee id="+id);
        System.out.println("Employee name="+name);
    }
}
public class first_class {
    public static void main(String[] args)
    {
        employee ayan=new employee();
        employee aatif=new employee();
        ayan.id=12;
        ayan.name="Ayan Khan";
        aatif.id=24;
        aatif.name="Aatif Shaikh";
        ayan.info();
        aatif.info();

    }
}
