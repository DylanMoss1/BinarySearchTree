public class FunctionalArray {

    int size;
    SearchSet set = new SearchSet();

    FunctionalArray(int size){
        this.size = size;
        for(int i=0;i<size;i++){
            set.insert(i);
        }
    }

    void set(int index, int value){
        //Ran out of time - insert standard recursive set function
    }

    void get(int index) {
        //Ran out of time - insert standard recursive get function
    }
}
