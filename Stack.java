import java.util.EmptyStackException;
public class Stack<E>
{
    private E top;
    private Object[] stack;
    private int size;

    public Stack()
    {
        stack = new Object[10];
        size = 0;
    }

    public void push(E item)
    {
        if (size < stack.length)
        { 
            if (stack[size+1] == null)

            {
                stack[size+1] = item;
                top = item;
                size++;
            }
        }
        else
        {
            Object[] newStack = new Object[size*4];
            for (int x = 0; x < size; x++)
            {
                newStack[x] = stack[x];
            }
            stack = newStack;
            stack[size+1] = item;
            size++;
            top = item;
        }
    }

    public E pop() 
    {
        if (size == 0)
        {
            throw new EmptyStackException();
        }
         E temp = top;
        if (size != 1)
        {
            top = (E) stack[size-1];
        }
        stack[size-1] = null;
        size--;
        return temp;
    }

    public E peek() 
    {
        if (size == 0)
        {
            throw new EmptyStackException();
        }
        return top;
    }

    public boolean isEmpty()
    {
        for (int i = 0; i < stack.length; i++)
        {
            if(stack[i] != null)
            {
                return false;
            }
        }
        return true;
    }

    public int size()
    {
        return size;
    }
}
