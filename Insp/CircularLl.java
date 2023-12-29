public class CircularLl {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            next=null;
        }
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
            
    }   
    
    public static void print(Node n){
        if(n==null){
            return;
        }
        Node m=n;
        System.out.println(n.data);
        m=n.next;
        while(m!=null && m!=n){
            System.out.println(m.data);
            m=m.next;
        }
    }
    public static Node reverse(Node n){
        if(n==null){
            return null;
        }
        Node cur=n;
        Node prev=null,up=null;
        while(cur!=null){
            up=cur.next;
            cur.next=prev;
            prev=cur;
            cur=up;
        }
        return prev;
    }
    
    public static Node middle(Node n){
         if(n==null){
            return null;
        }
        Node s=n,f=n;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
  public static void main(String[] args) {
      Node m=new Node(3);
    Node p=new Node(2,m);
    Node n=new Node(1,p);
    m.next=n;
    print(n);
    
  }

}
