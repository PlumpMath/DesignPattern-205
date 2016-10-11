package BehavioralPatterns.IteratorPattern;

/**
 * Created by Administrator on 2016/10/11.
 */
public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for(Iterator iterator = nameRepository.getIterator();iterator.hasNext();){
            String next = (String) iterator.next();
            System.out.println("next:" + next);
        }
    }
}
