public class StackforSingleList {
    Node head;
    int c=0;
    int top = 20;

    public void push(int data){
        if(c ==20){
            System.out.println("Stack is full");
        }
        else{
        Node node = new Node(0,null);
        node.data = data;
        //node.next = null;
        node.next = head;
        head = node;
        c++;
        }
    }

    public int pop() {
        if(head == null){
            System.out.println("Empty Linked list");
            return 0;
        }
        else{
            int a = head.data;
            head = head.next;
            return a;
        } 
    }
    
    public int top(){
        Node n = head;
        return n.data;
    }

    public int size(){
        Node node = head;
        int c= 1;
        if(node == null){
            return 0;
        }
        while(node.next != null){
            node = node.next;
            c++;
        }
        return c;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{return false;}
    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
