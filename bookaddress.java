import java.util.*;
class bookaddress{
    static String[][] bookAddress = new String[100][100];
    static int shelfCount = 100;
    static int loccount = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book b1 = new book(1, "Harry Potter & Goblet of Fire");
        book b2 = new book(2, "Harry Potter & Deathly Hollows - I");
        book b3 = new book(3, "Harry Potter & Deathly Hollows - II");
        book b4 = new book(4, "Harry Potter & prisoner of azkaban");
        b1.address = hashAddress(b1);
        b2.address = hashAddress(b2);
        b3.address = hashAddress(b3);
        b4.address = hashAddress(b4);
        HashMap<Integer, book> bookMap = new HashMap<>();
        bookMap.put(b1.id, b1);         
        bookMap.put(b2.id, b2);
        bookMap.put(b3.id, b3);
        bookMap.put(b4.id, b4);
        System.out.println("Book Search by id:");
        int id=sc.nextInt();
        book searchbook=bookMap.get(id);  
        System.out.println(searchbook);
    }
        static String hashAddress(book b) {
            int shelf = b.id % shelfCount;
            for (int loc = 0; loc < loccount; loc++) {
                if (bookAddress[shelf][loc] == null) {
                    bookAddress[shelf][loc] ="book: " + b.id;
                    return b.id + "#" + "Shelf: " + (shelf+1) + "#" + " Location: " + (loc+1);
                }
            }  
            return null;
    }

}