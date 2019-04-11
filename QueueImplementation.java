import java.util.*; 

class QueueImplementation
{ 
static class Queue 
{ 
    static Stack<Integer> s1 = new Stack<Integer>(); 
    static Stack<Integer> s2 = new Stack<Integer>(); 

    static void enQueue(int x) 
    { 
        while (!s1.isEmpty()) 
        { 
            s2.push(s1.pop());
        } 
        s1.push(x); 
        while (!s2.isEmpty()) 
        { 
            s1.push(s2.pop()); 
        } 
    } 
    static void deQueue() 
    {
        s1.pop();  
    } 
    static int printQ()
    {
        int temp=s1.pop();
        s1.push(temp);
        return temp;
    }
} 
public static void main(String[] args) 
{   Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    Queue q = new Queue();
    while(n-->0)
    {
        int ch=scan.nextInt();
        if(ch==1){
            int val=scan.nextInt();
            q.enQueue(val);}
       else if(ch==2)
        q.deQueue();
        else
        System.out.println(q.printQ());
    }
}
}  