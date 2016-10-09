package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> persons1 = criteria.meetCriteria(persons);
        List<Person> persons2 = otherCriteria.meetCriteria(persons);
        persons1.removeAll(persons2);
        persons1.addAll(persons2);
        return persons1;
    }
}
