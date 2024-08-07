// Michael Roy

public class SortedPersonList {
    // instance variables
    private PersonNode m_first;
    private int m_numElements; 

    // constructor
    // Do not make any changes to this method!
    public SortedPersonList() {
        m_first = null;
        m_numElements = 0;
    }

    // check whether the list is empty
    // Do not make any changes to this method!
    boolean isEmpty() {
        return m_first == null;
    }

    // return the size of the list (# of Person nodes)
    // Do not make any changes to this method!
    public int size() {
        return m_numElements;
    }

    // check whether a PersonNode associated with the given ID is in the list
    public boolean contains(int ID) {
        PersonNode current = m_first;
        while (current != null) {
            if (current.getID() == ID) {
                return true;
            }
            current = current.getLink();
        }
        return false;
    }

    // search for and return the PersonNode associated with the given ID
    public PersonNode get(int ID) {
        PersonNode current = m_first;
        while (current != null) {
            if (current.getID() == ID) {
                return current;
            }
            current = current.getLink();
        }
        return null;
    }

    // add a new PersonNode to the list with the given ID and name
    public boolean add(int ID, String name) {
        PersonNode newNode = new PersonNode(ID, name);

        if (m_first == null || m_first.getID() > ID) {
            newNode.setLink(m_first);
            m_first = newNode;
        } else {
            PersonNode current = m_first;
            while (current.getLink() != null && current.getLink().getID() < ID) {
                current = current.getLink();
            }
            if (current.getLink() != null && current.getLink().getID() == ID) {
                return false; // ID already exists
            }
            newNode.setLink(current.getLink());
            current.setLink(newNode);
        }

        m_numElements++;
        return true;
    }

    // remove a PersonNode associated with the given ID from the list
    public boolean remove(int ID) {
        if (m_first == null) {
            return false;
        }

        if (m_first.getID() == ID) {
            m_first = m_first.getLink();
            m_numElements--;
            return true;
        }

        PersonNode current = m_first;
        while (current.getLink() != null && current.getLink().getID() != ID) {
            current = current.getLink();
        }

        if (current.getLink() == null) {
            return false;
        }

        current.setLink(current.getLink().getLink());
        m_numElements--;
        return true;
    }

    // return a string representation of the list
    // Do not make any changes to this method!
    public String toString() {
        String listContent = "";
        PersonNode current = m_first;

        while (current != null) {
            listContent += "[" + current.getID() + " | " + current.getName() + "] ";
            current = current.getLink();
        }

        return listContent;
    }
}
