package StructuralPatterns.FilterPattern;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
