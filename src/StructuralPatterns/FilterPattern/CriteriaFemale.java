package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalPersons = new ArrayList<>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("female")){
                femalPersons.add(person);
            }
        }
        return femalPersons;
    }
}
