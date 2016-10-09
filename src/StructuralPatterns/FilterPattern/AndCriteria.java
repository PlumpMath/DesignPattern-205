package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;
    public AndCriteria(Criteria criteria,Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> andPersons = new ArrayList<>();
        List<Person> first = criteria.meetCriteria(persons);
        andPersons = otherCriteria.meetCriteria(first);
        return andPersons;
    }
}
