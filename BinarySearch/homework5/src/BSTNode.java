// Michael Roy

public class BSTNode
{
    // data members
    private String m_value;
    private BSTNode m_left;
    private BSTNode m_right;

    // constuctor
    public BSTNode(String value)
    {
        m_value = value;
        m_left = null;
        m_right = null;
    }

    // member methods
    public String getInfo()
    {
        return m_value;
    }

    public BSTNode getLeft()
    {
        return m_left;
    }

    public BSTNode getRight()
    {
        return m_right;
    }

    public void setLeft(BSTNode left)
    {
        m_left = left;
    }

    public void setRight(BSTNode right)
    {
        m_right = right;
    }
}
