public class Box<T> {
    T element;
    Box(T element){
        this.element = element;
    }

    T getObject(){
        return  element;
    }

    <V> boolean theContentBelongsToTheSameClass(V otherObejct){
         return element.getClass() == otherObejct.getClass();
    }
}
