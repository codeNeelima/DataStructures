
public class BinaryTreeImplementation {
	static TreeNode rootNode;

	public TreeNode addRecursiveNode(TreeNode root,int value){
		if(root==null){
			return new TreeNode(value);
		}
			 if(root.value > value){
				 root.right_child = addRecursiveNode(root.right_child,value);
			 } else if(root.value<value){
				 root.left_child = addRecursiveNode(root.left_child,value);
			 }
			 else{
				 //value exists
				 return root;
			 }
			 return root;
		}
	
	public void add(int value){
		rootNode = addRecursiveNode(rootNode,value);
		
	}
	
	public static boolean containsNodeRecursive(TreeNode current,int value){
		if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	    	System.out.println("the Node is found"+value);
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left_child, value)
	      : containsNodeRecursive(current.right_child, value);
	}
	
	public static boolean containsNode(int value){
	return containsNodeRecursive(rootNode, value);
		
	}
	public static void main(String[] args) {
		
		BinaryTreeImplementation impl = new BinaryTreeImplementation();
		impl.add(100);
		impl.add(120);
		impl.add(65);
		impl.add(19);
		impl.add(135);
		impl.add(140);
		
		//find the node
		containsNode(135);
		
	}
}
