package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for(Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
