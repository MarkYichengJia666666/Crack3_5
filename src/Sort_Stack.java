/**
 * Created by jiayicheng on 17/7/29.
 */
import java.util.Stack;
public class Sort_Stack {
Stack<Integer> a=new Stack<Integer>();

    public Sort_Stack()//构造函数。。。
    {
        a=new Stack<Integer>();
    }

    public void sort(Stack<Integer> a)
    {Stack<Integer> s=new Stack<Integer>();
        while(!a.isEmpty())
        {
            int temp=a.pop();
            while(temp<s.peek()&&!s.isEmpty())//里面还有一个大工程，所以第一时间要想到while
            {
                a.push(s.pop());
            }
            s.push(temp);
        }

        while(!s.isEmpty())//再倒回去，所以之前暂时的顺序应该与题设顺序相反
            a.push(s.pop());
    }
}
