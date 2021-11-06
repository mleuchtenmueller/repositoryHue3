package hue3;

import java.util.List;

public interface Mapper<S, T>{
    abstract StringConverter(S, T);
    
    default List<String> mapAll(List<String> S){
        List<String> newList = S;
        return newList;
    }
}
