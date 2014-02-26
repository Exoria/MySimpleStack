package dcll.mdac.MySimpleTree;

import java.util.ArrayList;

public interface TreeNode {

	public ArrayList<TreeNode> getChildren();
	public TreeNode getParent();
}
