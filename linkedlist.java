class a{
    b head;
    class b{
        int data;
        b next;

        b(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addfirst(int data){
        b newnode = new b(data);
        if (head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void addlast(int data){
        b newnode = new b(data);
        if (head == null){
            head = newnode;
            return;
        }
        b last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = newnode;
    }
    public void print(){
        if (head == null){
            System.out.print("Empty");
            return;
        }
        b current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;    
        }
        System.out.print("NULL");
        
    }
    public static void main(String[] args) {
        a obj = new a();
        obj.addfirst(5);
        obj.addfirst(98);
        obj.print();
        obj.addlast(444);
        obj.print();
    }
}
