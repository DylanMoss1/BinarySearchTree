public class FunctionalArray {

    int size;
    SearchSet set = new SearchSet();

    FunctionalArray(int size){
        this.size = size;
        for(int i=0;i<size;i++){
            set.insert(i);
        }
    }
}
