public class Stack<E>
{
    private Object top;
    private Object[] stack;
    private int size;

    public Stack()
    {
        stack = new Object[10];
        size = 0;
    }

    public void push(E item)
    {
        if (size < stack.length && stack[size+1] == null)
        {
            stack[size+1] = item;
            top = stack[size+1];
        }
        else
        {
            int i = 0;
            Object[] newStack = new Object[stack.length*2];
            for (int x = 0; x < size; x++)
            {
                newStack[x] = stack[x];
                i++;
            }
            stack = newStack;
            stack[size+1] = item;
            size++;
            top = stack[size-1];
        }
    }

    public E pop() 
    {

        return null;
    }

    public E peek()
    {
        return null;
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
