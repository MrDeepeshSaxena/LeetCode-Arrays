import javax.swing.tree.TreeNode;
import java.util.Enumeration;

public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {
    private int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return createTree(0, nums.length - 1);
    }
    private TreeNode createTree(int low, int high){
        if(low > high) return null;
        int mid = low + (high - low) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createTree(low, mid - 1);
        node.right = createTree(mid + 1, high);
        return node;
    }
}

