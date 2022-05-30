import TREE;

public class tmain2 {
	public static void main(String [] args) {
BinaryTreeLL binarytree=new BinaryTreeLL();
BinaryNode n1=new BinaryNode();
n1.value="n1";
BinaryNode n2=new BinaryNode();
n2.value="n2";
BinaryNode n3=new BinaryNode();
n3.value="n3";
BinaryNode n4=new BinaryNode();
n4.value="n4";
BinaryNode n5=new BinaryNode();
n5.value="n5";
BinaryNode n6=new BinaryNode();
n6.value="n6";
BinaryNode n7=new BinaryNode();
n7.value="n7";
BinaryNode n8=new BinaryNode();
n8.value="n8";
BinaryNode n9=new BinaryNode();
n9.value="n9";
n1.left=n2;
n1.right=n3;
n2.left=n4;
n2.right=n5;
n3.left=n6;
n3.right=n7;
n4.left=n8;
n4.right=n9;
/*binarytree.preorder(binarytree.root);
binarytree.inorder(binarytree.root);
binarytree.postorder(binarytree.root);*/
binarytree.levelOrder(binarytree.root);
}
}