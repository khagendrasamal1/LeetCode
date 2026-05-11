# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumNumbers(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        def sumNum(root, num):
            if root is None:
                return 0

            num = num * 10 + root.val
            if root.left is None and root.right is None:
                return num

            return sumNum(root.left, num) + sumNum(root.right, num)
        return sumNum(root, 0)

        