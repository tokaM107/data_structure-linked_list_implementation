

public class linkedlist {
    node head;
    node tail;
    int size = 0;

    public node getHead() {
        return head;
    }


    public void setHead(node head) {
        this.head = null;
    }


    public node getTail() {
        return tail;
    }
    

    public void setTail(node tail) {
        this.tail = null;
    }

    public int traversing(node head) {
       
        node temp = head;
        while (head != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void insertfirst(int val) {
        node newnode = new node(val);
      newnode.next=head;
        head = newnode;
    }

    public void insertend(int val) {
        if (head==null) {
            insertfirst(val);
        }else{
            node newnode = new node(val);
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        }
        

    }
// it is not inserting elements in position 0
    public void insertmid(int val, int pos) {
        int size = 0;
        node newnode = new node(val);
        node temp = head;
       
        while (temp != null && (size < pos-1 || pos==0)) {
            size++;
            temp = temp.next;
        }
    
        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }
        
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void deletefirst(){
        node temp= head ;
        head= head.next;
        temp.next= null;
        temp=null;
    }
    

public void deletelast(){
    if (head == null ) {
        System.out.println(" list does not contain elements ");
    }else if (head.next==null) {
        deletefirst();
    }
    else{
         tail= head ;
    while (tail.next.next != null) {
        tail = tail.next;
    }
  tail.next=null;
    }
    
  
}




  




    

     public void display() {
        node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }



}
