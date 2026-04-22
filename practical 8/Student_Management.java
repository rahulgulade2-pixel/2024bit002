/*
1. Create a blueprint of how a basic Student Management System would be, having classes Student, Managament and SMS, atleast these elements in the Student class- Name, Reg.no., Contact no. 
*/
class Student
{
    String name;
    String regno;
    long cntno;

    Student()
    {
        this("Aseel","2025BIT505",9730150126L);
    }

    Student(String name,String regno,long cntno)
    {
        this.name=name;
        this.regno=regno;
        this.cntno=cntno;
    }

    void dispStudent()
    {
        System.out.println(name+"\n"+regno+"\n"+cntno);
    }
}

class Management
{
    Student s;

    Management()
    {
        s = new Student();
    }

    void showStudent()
    {
        s.dispStudent();
    }
}

class SMS
{
    public static void main(String args[])
    {
        Management m = new Management();
        m.showStudent();
    }
}