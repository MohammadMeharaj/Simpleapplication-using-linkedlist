import java.util.*;
public class simpleapplication
{
    public static void main(String[]args)
    {
        LinkedList<String>ll=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("simple a list application menu:");
            System.out.println("Add");
            System.out.println("remove");
            System.out.println("list task");
            System.out.println("EXIT");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch(choice)
            {
                case 1:
                    System.out.println("Adding element");
                    String addelement=scanner.nextLine();
                    ll.add(addelement);
                    System.out.println("Added successfully");
                    break;
                
                case 2:
                    System.out.println("Removing element");
                    String removeelement=scanner.nextLine();
                    if (ll.remove(removeelement))
                    {
                        System.out.println("REmoved successfuly and found the vlue");
                    }
                    else{
                        System.out.println("Not found");
                    }
                    break;
                    case 3:
                    if (ll.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } 
                    else {
                        System.out.println("List of stored elements:");
                        int i = 1;
                        for (String display : ll) {
                            System.out.println(i + ". " + ll);
                            i++;
                        }
                    }
                    break;
                    case 4:
                        System.out.println("Exit from application");
                        break;
                    default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        
    }
}