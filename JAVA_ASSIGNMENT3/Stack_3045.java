import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Stack_3045 {
    Node top;
    public Stack_3045(){
        top=null;
    }
    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    public void push(int data,Stack_3045 stack){
        Node newNode=new Node(data);
        if(stack.isEmpty()){
            top=newNode;
        }
        else{
            Node current=top;
            newNode.next=current;
            top=newNode;
        }
    }
    public void pop(Stack_3045 stack){
        if(stack.isEmpty()){
            System.out.println("list is empty");
        }
        else{
            System.out.println("popped  the element "+top.data);
            top=top.next;
        }
    }
    public void display(Stack_3045 stack){
        if(stack.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            Node current=top;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public void peek(Stack_3045 stack){
        if(!stack.isEmpty()){
            System.out.println(top.data+" is the peek element");
        }
        else{
            System.out.println("stack is empty");
        }
    }
    public static void main(String[] args){
        Stack_3045 stack =new Stack_3045();
        System.out.println("\nSivaranjani - 2022503045 ");
        System.out.println("1.push\n2.pop\n3.display\n4.peek element\n5exit");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the option:");
        int opt=sc.nextInt();
        int data;
        while(opt!=5){
            switch(opt){
                case 1:{
                    System.out.println("enter the data:");
                    data=sc.nextInt();
                    stack.push(data,stack);
                    System.out.println(data+" is pushed");
                    break;
                }
                case 2:{
                   stack.pop(stack);
                   break;
                }
                case 3:{
                    stack.display(stack);
                    break;
                }
                case 4:
                    stack.peek(stack);
                    break;
            }
            System.out.println("\n1.push\n2.pop\n3.display\n4.peek element\n5.exit");
            System.out.println("\nenter the option:");
            opt=sc.nextInt();
        }
        System.out.println("exited..");
        sc.close();
    }
}
