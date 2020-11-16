public class BinaryTreeNode {

    private int mValue;
    private BinaryTreeNode mLeft;
    private BinaryTreeNode mRight;

    BinaryTreeNode(int value){
        mValue = value;
    }

    int getValue(){
        return mValue;
    }

    void setValue(int newValue){
        mValue = newValue;
    }

    BinaryTreeNode getLeft(){ return mLeft; }

    BinaryTreeNode getRight(){
        return mRight;
    }

    void setLeft(BinaryTreeNode node){
        mLeft = node;
    }

    void setRight(BinaryTreeNode node){
        mRight = node;
    }
}
