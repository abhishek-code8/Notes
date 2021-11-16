public class Trees{

    static void createTree(){
        Node root =null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        root.data=new Node(data);
        System.out.println("Enter data for left: "+data);
        root.left=createTree;
        System.out.println("Enter data for right: "+data);
        root.right=createTree();
        return root;
    }

    static Node levelOrderBuild(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Queue<Node> list = new Queue();
        Node root = new Node(data);
        list.add(root);
        while(!list.isEmpty()){
            Node temp = list.peek();
            list.poll();
            
            System.out.print("Enter the left");
            int dataleft= sc.nextInt();
            if(data!=-1){
                Node lefttemp = new Node(dataleft);
                temp.left= lefttemp;
                list.add(lefttemp);

            }
            else{
                temp.left=null;
            }
            System.out.print("Enter the right");
            int dataright=sc.nextInt();
            if(dataright!=-1){
                Node righttemp = new Node(dataright);
                temp.right=righttemp;
                list.add(righttemp);
            }
            else{
                temp.right=null;
            }

        }
        return root;
    }

    static levelOrder(Node root){
        
        Queue<Node> check = new Queue();
        check.add(root);
        check.add(null);
        while(!check.isEmpty()){
            Node tempNode = check.peek();
            if(tempNode.peek()==null){
                check.remove();
                System.out.println();
                if(!check.isEmpty()){
                    check.add(null);
                }
            }
            else{
                check.remove();
                System.out.println(tempNode.data);
                if(tempNode.left!=null){
                    check.add(tempNode.left);
                }
                else if(tempNode.right!=null){
                    check.add(tempNode.right);            }
            }
            
            
        }
    }

    public static void main(Strings []args){
        Node root = null;
        root = createTree();

    }


}

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}