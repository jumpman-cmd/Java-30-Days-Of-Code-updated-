// To print elements according to their level order.

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class SolutionLevelOrder{

public static List<List<Integer>> levelOrder(Node root)
{
      //Write your code here
      
      // A List of list.
      List<List<Integer>> result = new ArrayList<>();
      if(root == null)
      {
          return result;
      }
      
      else
      {
          Queue<Node> qu = new LinkedList<>();
          qu.offer(root);
          
          while(!qu.isEmpty())
          {
              int size = qu.size();
              List<Integer> currentL = new ArrayList<>();
              
              while(size-- > 0)
              {
                  Node cur = qu.poll();
                  currentL.add(cur.data);
                  
                  if(cur.left != null)
                  {
                      qu.offer(cur.left);
                  }
                  
                  if(cur.right != null)
                  {
                      qu.offer(cur.right);
                  }
              }
              result.add(currentL);
          }    
      }
      System.out.print(result);
      return result;
}

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
