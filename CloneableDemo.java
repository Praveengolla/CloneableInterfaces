class CloneableDemo implements Cloneable
{
    int id;
    String name;

    CloneableDemo(int id,String name)
    {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException{
        CloneableDemo c1 = new CloneableDemo(1, "Praveen");
        System.out.println(c1.id+" "+c1.name);

        CloneableDemo c2 = (CloneableDemo)c1.clone();
        System.out.println(c2.id+" "+c2.name);
    }
}