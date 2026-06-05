class HistoryNode {
    String page;
    HistoryNode next;
    HistoryNode(String page) {
        this.page = page;
        this.next = null;
    }
}
class BrowserHistory {
    HistoryNode head;
    // Visit Page
    void visitPage(String page) {
        HistoryNode newNode = new HistoryNode(page);
        if(head == null) {
            head = newNode;
            return;
        }
        HistoryNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    // Display History
    void displayHistory() {
        HistoryNode temp = head;
        System.out.println("Browser History:");

        while(temp != null) {
            System.out.println(temp.page);
            temp = temp.next;
        }
    }
    // Search Page
    void searchPage(String page) {
        HistoryNode temp = head;
        while(temp != null) {
            if(temp.page.equals(page)) {
                System.out.println("Page Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Page Not Found");
    }
    // Delete Page
    void deletePage(String page) {

        if(head == null) {
            return;
        }
        if(head.page.equals(page)) {
            head = head.next;
            return;
        }
        HistoryNode temp = head;
        while(temp.next != null && !temp.next.page.equals(page)) {
            temp = temp.next;
        }
        if(temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    // Count Pages
    int countPages() {
        int count = 0;
        HistoryNode temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class LinkedListex {
    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory();
        bh.visitPage("Google");
        bh.visitPage("YouTube");
        bh.visitPage("Instagram");
        bh.displayHistory();
        bh.searchPage("YouTube");
        bh.deletePage("YouTube");
        System.out.println("\nAfter Deletion:");
        bh.displayHistory();
        System.out.println("\nTotal Pages = "+ bh.countPages());
    }
}