// The CharStack class that implements a stack of characters
// Michael Roy

public class CharStack
{
    // instance variables
    private char[] m_array;
    private int m_index;
    
    // constructor
    public CharStack(int cap)
    {
        m_array = new char[cap];
        m_index = 0;
    }

    // check whether the stack is empty
    public boolean isEmpty()
    {
        if (m_index == 0)
            return true;
        else
            return false;
    }

    // return the element at the top of the stack
    public char top()
    {
        if (isEmpty())
            throw new RuntimeException("top attempted on an empty stack");
        else
            return m_array[m_index - 1];
    }
            
    // push a character onto the stack
    public void push(char c)
    {
        m_array[m_index] = c;
        m_index++;
    }
    
    // remove and return the element at the top of the stack
    public char pop()
    { 
        if (isEmpty())
            throw new RuntimeException("pop attempted on an empty stack");
        else
        {
            char c = m_array[m_index - 1];
            m_index--;

            return c;
        }
    }

    // return the number of elements on the stack
    public int size()
    {
        return m_index;
    }

    // return a string representation of the stack
    @Override
    public String toString()
    {
        String stackContent = "";
        
        for (int i = m_index - 1; i >= 0; i--)
            stackContent += m_array[i];
        
        return stackContent;  
    }
}
