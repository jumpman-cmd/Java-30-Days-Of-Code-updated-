import java.util.*;

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
    public static void levelOrder(Node root)
     {
        if (root == null)
         {
            return;
         }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) 
        {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null)
             {
                queue.add(current.left);
             }
            if (current.right != null)
             {
                queue.add(current.right);
             }
        }
    }

    public static Node insert(Node root, int data)
    {
        if (root == null) 
        {
            return new Node(data);
        } 
        
        else 
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
        levelOrder(root);
    }
}