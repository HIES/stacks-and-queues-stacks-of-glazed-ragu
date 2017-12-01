import java.util.NoSuchElementException;
public class Queue<E>
{
    private Stack queue;
    private Node first;
    private int size;
    private class Node
    {
        private Node next;
        private E nodeStuff;
        public Node(E stuff)
        {
            this.nodeStuff = stuff;
        }
    }

    public Queue()
    {
        Stack queue = new Stack();
        first = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        if (size > 0)
        {
            return false;
        }

        return true;
    }

    public void enqueue(E item)
    {
        Node nItem = new Node(item);
        Node current = first;
        if (size == 0)
        {
            first = nItem;
            size++;
        }
        else 
        {
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = nItem;
            size++;
        }
    }

    public E dequeue()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        else
        {
        Node temp = first;
        first = first.next;
        size--;
        return temp.nodeStuff;
        }
    }
    
    public E peek()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return first.nodeStuff; 
        }
    }
}