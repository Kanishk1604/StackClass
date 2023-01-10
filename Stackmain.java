public class Stackmain {
    public static void main(String[] args) {
        StackforSingleList stack = new StackforSingleList();
        stack.push(1);
        stack.push(2);
        stack.push(10);
        stack.push(20);
        stack.push(100);
        stack.push(200);

        stack.show();
        int c = stack.size();
        System.out.println("size: "+c);
        stack.pop();
        stack.show();
        int m = stack.size();
        System.out.println("size: "+m);
        stack.top();
        stack.pop();
        int p = stack.size();
        System.out.println("size: "+p);
        stack.pop();
        int x = stack.size();
        System.out.println("size: "+x);
        boolean a = stack.isEmpty();
        System.out.println(a);


    }
}
