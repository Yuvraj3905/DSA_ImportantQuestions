public class ArrLL {
   
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
        
        
        public static Node add(Node head, int data) {
            Node newNode = new Node(data);
            if (head == null) {
                return newNode; 
            }
    
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next; 
            }
            curr.next = newNode; 
            return head;
        }
    
    
        public static void print(Node n){
            if(n==null){
                return;
            }
            Node m=n;
            while(m!=null){
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
    
      public static void main(String[] args) {
        int arr[]={1,2,3,4};

        //  Node m=new Node(3);
        // Node p=new Node(2,m);
        // Node n=new Node(1,p);
        Node n=new Node(0);
        Node updatedList=null;
        for(int i=0;i<arr.length;i++){
             updatedList = add(n, arr[i]);
        }
        print(updatedList);
        // Node ans=reverse(n);
        // print(ans);
    
      }
    
    
    
}
