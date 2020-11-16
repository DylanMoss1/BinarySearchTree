import java.util.LinkedList;

public class SearchSet {

    private int mElements = 0;
    BinaryTreeNode mHead = null;

    public static void main(String[] args) {
        SearchSet search = new SearchSet();
        search.insert(5);
        search.insert(7);
        search.insert(8);
        search.insert(6);
        search.insert(2);
        search.insert(3);
        search.insert(4);
        System.out.println(search.getNumberElements());
        System.out.println(search.contains(1));
        System.out.println(search.contains(4));
    }

    SearchSet(){}

    void insert(int value) {
        BinaryTreeNode currentNode = mHead;
        while(true){
            if(currentNode == null) {
                mHead = new BinaryTreeNode(value);
                break;
            } else {
                if(value == currentNode.getValue()){
                    throw new IllegalArgumentException("The value is already in the binary tree");
                } else if (value < currentNode.getValue()){
                    if(currentNode.getLeft() == null){
                        currentNode.setLeft(new BinaryTreeNode(value));
                        break;
                    } else {
                        currentNode = currentNode.getLeft();
                    }
                } else {
                    if(currentNode.getRight() == null){
                        currentNode.setRight(new BinaryTreeNode(value));
                        break;
                    } else {
                        currentNode = currentNode.getRight();
                    }
                }
            }
        }
    }

    int getNumberElements(){

        mElements = 0;

        BinaryTreeNode currentNode;
        LinkedList<BinaryTreeNode> nodeList = new LinkedList<>();
        nodeList.add(mHead);

        if(mHead == null){
            return 0;
        }

        while(nodeList.size() != 0){
            currentNode = nodeList.pollLast();
            if(currentNode.getLeft() != null){
                nodeList.push(currentNode.getLeft());
            }
            if(currentNode.getRight() != null){
                nodeList.push(currentNode.getRight());
            }
            mElements++;
        }
        return mElements;
    }

    boolean contains(int value){
        BinaryTreeNode currentNode = mHead;
        while(true){
            if(currentNode == null) {
                return false;
            } else {
                if(value == currentNode.getValue()){
                    return true;
                } else if (value < currentNode.getValue()) {
                    currentNode = currentNode.getLeft();
                } else {
                    currentNode = currentNode.getRight();
                }
            }
        }
    }
}
