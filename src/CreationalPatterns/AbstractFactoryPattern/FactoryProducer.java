package CreationalPatterns.AbstractFactoryPattern;

/**
 * Created by Administrator on 2016/10/8.
 */
public class FactoryProducer {

        public static AbstractFactory getFactory(String factory){
            AbstractFactory abstractFactory = null;
            if(factory == null){
                return abstractFactory;
            }
            if(factory.equalsIgnoreCase("SHAPE")){
                abstractFactory = new ShapeFactory();
            }else if(factory.equalsIgnoreCase("COLOR")){
                abstractFactory = new ColorFactory();
            }
            return abstractFactory;
        }
}
