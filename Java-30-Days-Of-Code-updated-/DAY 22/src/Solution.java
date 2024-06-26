import java.util.Scanner;

class Node
{
    Node left, right;
    int data;

    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class Solution
{

    public static int getHeight(Node root)
    {
        if (root == null)
        {
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static Node insert(Node root, int data)
    {
        if (root == null)
        {
            return new Node(data);
        } else
        {
            Node cur;
            if (data <= root.data)
            {
                cur = insert(root.left, data);
                root.left = cur;
            }

            else
            {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        while (n-- > 0)
        {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        sc.close();
        int height = getHeight(root);
        System.out.println(height);
    }
}