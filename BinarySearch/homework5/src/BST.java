// Michael Roy

import java.util.*;
public class BST
{
        // instance variables
        private BSTNode m_root;
        private int m_size;

        // constructor
        public BST()
        {
            m_root = null;
            m_size = 0;
        }

        // This method returns the number of elements in the tree.
        // Do not make any changes to this method!
        public int size()
        {
            return m_size;
        }

        // This method clears the content of the tree.
        // Do not make any changes to this method!
        public void clear()
        {
            m_root = null;
            m_size = 0;
        }

    // This non-recursive method takes a string and inserts it into the binary
    // search tree, keeping the tree ordered.
    public void add(String value)
    {
        // PUT CODE HERE: Implement method that uses Non-recursive solution
        BSTNode currentNode = m_root;
        BSTNode parentNode = null, newNode;

        //if root node is null initialize it with new Node
        if(m_root == null)
        {
            newNode = new BSTNode(value);
            newNode.setLeft(null);
            newNode.setRight(null);
            m_root = newNode;
            m_size++;
            return;
        }

        //traverse to insert the new node at appropriate position
        while (currentNode!=null)
        {
            parentNode = currentNode;
            //if the value given is less than current node value traverse
            //to left of the current node
            if(currentNode.getInfo().compareTo(value) > 0)
                currentNode = currentNode.getLeft();


                //else traverse to the right of current node
            else if(currentNode.getInfo().compareTo(value) < 0)
                currentNode = currentNode.getRight();
            else
                return;
        }

        //create the newNode and assign its value
        newNode = new BSTNode(value);
        newNode.setLeft(null);
        newNode.setRight(null);

        //if value is greater than parent node value insert to right
        if(parentNode.getInfo().compareTo(value) < 0)
            parentNode.setRight(newNode);
            //else insert to left of the parent node
        else
            parentNode.setLeft(newNode);
        m_size++;
    }

    // This non-recursive method returns a string that represents the in-order traversal
    // of the binary search tree.
    public String inOrder()
    {

        //create a stack of nodes to keep track of each node visisted
        java.util.Stack<BSTNode> stack = new java.util.Stack<>();
        BSTNode node = m_root;
        //Initialize the final string
        StringBuilder inOrderString = new StringBuilder();
        //traverse until node is null or stack is empty
        while (node != null || !stack.empty())
        {
            //if node is not null insert it into stack and go to left of its current value
            //cause in inorder we visit left node first then print and visit right node
            if(node != null)
            {
                stack.push(node);
                node = node.getLeft();
            }
            //if node is null pop the recently visited node from stack and append the string with its value
            else
            {
                node = stack.pop();
                inOrderString.append(node.getInfo()+" ");
                //then visit right side of the node
                node = node.getRight();
            }
        }
        return String.valueOf(inOrderString); // replace this statement with your own return
    }

    // This method returns the largest element in the binary search tree. You
    // are not allowed to create any additional structures, including but not
    // limited to arrays, stacks, queues, or other trees.
    public String max()
    {
        //maximum node is found at the rightmost corner of the Binary search tree
        BSTNode current = m_root;

        //visit the right most node of the tree
        while (current.getRight() != null)
        {
            current = current.getRight();
        }
        return current.getInfo(); // replace this statement with your own return
    }

    // This method takes a reference to the root of the expression, evaluates
    // the tree, and returns the result as an int.
    public int evaluate(BSTNode node)
    {

        return switch (node.getInfo()) {
            case "+" -> evaluate(node.getLeft()) + evaluate(node.getRight());
            case "-" -> evaluate(node.getLeft()) - evaluate(node.getRight());
            case "*" -> evaluate(node.getLeft()) * evaluate(node.getRight());
            case "/" -> evaluate(node.getLeft()) / evaluate(node.getRight());
            case "^" -> (int) Math.pow(evaluate(node.getLeft()), evaluate(node.getRight()));
            default -> Integer.parseInt(node.getInfo());
        };
    }

}




