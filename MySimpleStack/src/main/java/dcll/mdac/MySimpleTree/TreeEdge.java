package dcll.mdac.MySimpleTree;

public interface TreeEdge {
	public TreeNode getSource();
	public TreeNode getTarget();
	public void setSource(TreeNode node);
	public void setTarget(TreeNode node);
}
