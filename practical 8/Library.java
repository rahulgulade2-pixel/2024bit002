import java.util.Scanner;

public class Library
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String bookId[] = new String[100];
        String bookName[] = new String[100];
        int qty[] = new int[100];
        int count = 0;
        
        int choice;
        
        System.out.println("WELCOME TO LIBRARY SYSTEM");
        
        while(true)
        {
            System.out.println("\n1 Add Book");
            System.out.println("2 Display Book");
            System.out.println("3 Issue Book");
            System.out.println("4 Return Book");
            System.out.println("5 Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            if(choice == 1)
            {
                System.out.print("Enter Book ID: ");
                bookId[count] = sc.next();
                
                System.out.print("Enter Book Name: ");
                bookName[count] = sc.next();
                
                System.out.print("Enter Quantity: ");
                qty[count] = sc.nextInt();
                
                System.out.println("Book Added");
                count++;
            }
            
            else if(choice == 2)
            {
                if(count == 0)
                {
                    System.out.println("No Books");
                }
                else
                {
                    for(int i=0; i<count; i++)
                    {
                        System.out.println(bookId[i] + " " + bookName[i] + " " + qty[i]);
                    }
                }
            }
            
            else if(choice == 3)
            {
                System.out.print("Enter Book ID: ");
                String id = sc.next();
                
                int found = 0;
                
                for(int i=0; i<count; i++)
                {
                    if(bookId[i].equals(id))
                    {
                        found = 1;
                        if(qty[i] > 0)
                        {
                            qty[i] = qty[i] - 1;
                            System.out.println("Book Issued");
                        }
                        else
                        {
                            System.out.println("No Stock");
                        }
                    }
                }
                
                if(found == 0)
                {
                    System.out.println("Book Not Found");
                }
            }
            
            else if(choice == 4)
            {
                System.out.print("Enter Book ID: ");
                String id = sc.next();
                
                int found = 0;
                
                for(int i=0; i<count; i++)
                {
                    if(bookId[i].equals(id))
                    {
                        found = 1;
                        qty[i] = qty[i] + 1;
                        System.out.println("Book Returned");
                    }
                }
                
                if(found == 0)
                {
                    System.out.println("Book Not Found");
                }
            }
            
            else if(choice == 5)
            {
                System.out.println("Thank You");
                break;
            }
            
            else
            {
                System.out.println("Wrong Choice");
            }
        }
    }
}