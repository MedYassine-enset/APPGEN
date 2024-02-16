package metier;

import java.util.ArrayList;
import java.util.List;

public class StockageGenerique<T> {
    private List<T> elements;

    public StockageGenerique(List<T> elements) {
        this.elements = elements;
    }

    public void addElement(T elem){
        elements.add(elem);
    }
    public T getElement(int index){
        if (index>=0 && index<elements.size()){
            return elements.get(index);
        }else{
            throw new IndexOutOfBoundsException("Indice non valide!!!!!");
        }
    }
    public void removeElement(int index){
        if (index>=0 && index<elements.size()){
            elements.remove(index);
        }else{
            throw new IndexOutOfBoundsException("Indice non valide!!!!!");
        }
    }
    public int getSize(){
        return elements.size();
    }
}
