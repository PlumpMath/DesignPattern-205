package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 过滤器模式
    过滤器模式（Filter Pattern）或标准模式（Criteria Pattern）是一种设计模式，这种模式允许开发人员使用不同的标准来过滤一组对象，通过逻辑运算以解耦的方式把它们连接起来。
    这种类型的设计模式属于结构型模式，它结合多个标准来获得单一标准。
 */
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("1","Male","Single"));
        persons.add(new Person("2","female","Married"));
        persons.add(new Person("3","Male","Single"));
        persons.add(new Person("4","female","Married"));
        persons.add(new Person("5","female","Single"));
        persons.add(new Person("6","Male","Married"));
        persons.add(new Person("7","Male","Single"));
        persons.add(new Person("8","female","Single"));
        persons.add(new Person("9","Male","Single"));
        persons.add(new Person("10","Male","Married"));

        System.out.println("criteriaMale*********************************************");
        CriteriaMale criteriaMale = new CriteriaMale();
        List<Person> persons1 = criteriaMale.meetCriteria(persons);
        Main.printPersons(persons1);
        System.out.println("criteriaFemale*********************************************");
        CriteriaFemale criteriaFemale = new CriteriaFemale();
        List<Person> persons2 = criteriaFemale.meetCriteria(persons);
        Main.printPersons(persons2);
        System.out.println("criteriaSingle*********************************************");
        CriteriaSingle criteriaSingle = new CriteriaSingle();
        List<Person> persons3 = criteriaSingle.meetCriteria(persons);
        Main.printPersons(persons3);
        System.out.println("andCriteria*********************************************");
        AndCriteria andCriteria = new AndCriteria(criteriaMale,criteriaSingle);
        List<Person> persons4 = andCriteria.meetCriteria(persons);
        Main.printPersons(persons4);
        System.out.println("orCriteria*********************************************");
        OrCriteria orCriteria = new OrCriteria(criteriaFemale, criteriaSingle);
        List<Person> persons5 = orCriteria.meetCriteria(persons);
        Main.printPersons(persons5);
    }


    public static void printPersons(List<Person> persons){
        for(Person person : persons){
            System.out.println("Name: " + person.getName() + ", Gender: " + person.getGender() + ", MaritalStatus: " + person.getMaritalStatus());
        }
        System.out.println("*********************************************");
    }
}
