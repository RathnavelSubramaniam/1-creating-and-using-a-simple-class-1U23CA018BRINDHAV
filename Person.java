class Persona
{
    String firstname;
    String lastname;
    int age;
    Persona(String fname,String lname,int a)
    {
        firstname = fname;
        lastname = lname;
        age = a;
    }
    String getfullname()
    {
        return firstname + " "+ lastname;
    }
}
class Person{
    public static void main(String arg[]){
    Persona a1 = new Persona("Jhon","Doe",30);
    Persona a2 = new Persona("Alice","Smith",25);

    System.out.println("Person 1:"+a1.getfullname());
    System.out.println("Person 2:"+a2.getfullname());
    double average = ((a1.age + a2.age)/2.0);
    System.out.println("Average Age:" +average);
}
}

    

