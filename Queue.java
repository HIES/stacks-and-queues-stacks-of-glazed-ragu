import java.util.NoSuchElementException;
public class Queue<E>
{
    private Stack queue;
    private Node first;
    private int size;
    private class Node
    {
        private Node next;
        public Node()
        {}
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
        return true;
    }

    public void enqueue(E item)
    {
        Node current = first;
        if (size == 0)
        {
            first = (Node) item;
            size++;
        }
        else 
        {
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = (Node) item;
            size++;
        }
    }

    public E dequeue()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        return null;
    }

    public E peek()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        else
        {
            //return first; ?
        }
        return null;
    }

}