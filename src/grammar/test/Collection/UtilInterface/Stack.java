package grammar.test.Collection.UtilInterface;

/**
 * 栈
 */
public interface Stack<T> {
    //添加
    public void push(T t);
    //取出（查看并去除）
    public T pull();
    //查看
    public T peek();
}
