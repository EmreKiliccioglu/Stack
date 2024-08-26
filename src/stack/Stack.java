package stack;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public Stack(int size)
    {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }
    
    public void push(int value) // Yigina elaman ekleme metodu
    {
        if(isFull())
        {
            System.out.println("Yigin dolu!");
        }
        else
        {
            stackArray[++top] = value; 
            System.out.println(value + " yigina eklendi.");
        }
    }
    
    public int pop() // Yigindan eleman cikarma metodu
    {
        if(isEmpty())
        {
            System.out.println("Yigin bos!");
            return -1;
        }
        else
        {
            int value = stackArray[top--];
            System.out.println(value + " yigindan cikarildi.");
            return value;
        }
    }
    
    public int peek() // Yiginin en ustundeki elemani gorme metodu
    {
        if(isEmpty())
        {
            System.out.println("Yigin Bos!");
            return -1;
        }
        else
        {
            return stackArray[top];
        }
    }
    
    public boolean isEmpty() // Yigin bos mu kontrol metodu
    {
        return(top == -1);
    }
    
    public boolean isFull() // Yigin dolu mu kontrol metodu
    {
        return (top == maxSize - 1);
    }
    
    public static void main(String[] args) {
        
        Stack stack = new Stack(5);
        
        stack.push(6);
        stack.push(18);
        stack.push(52);
        
        System.out.println("Yiginin en ustteki elemani : " + stack.peek());
        
        stack.pop();
        
        System.out.println("Yiginin en ustteki elemani : " + stack.peek());
        
        stack.pop();
        
        System.out.println("Yiginin en ustteki elemani : " + stack.peek());
        
        stack.pop();
        
        System.out.println("Yiginin en ustteki elemani : " + stack.peek());
        
    }
    
}
