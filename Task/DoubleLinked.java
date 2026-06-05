class Post {
    String content;
    Post prev;
    Post next;

    public Post(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
class SocialMediaFeed {
    Post head;
    Post tail;
    Post current;
    public void addPost(String content) {
        Post newPost = new Post(content);
        if (head == null) {
            head = tail = current = newPost;
            return;
        }
        tail.next = newPost;
        newPost.prev = tail;
        tail = newPost;
    }
    public void nextPost() {
        if (current == null || current.next == null) {
            System.out.println("No next post available");
            return;
        }
        current = current.next;
        System.out.println("Current Post: "+ current.content);
    }
    public void previousPost() {
        if (current == null || current.prev == null) {
            System.out.println("No previous post available");
            return;
        }
        current = current.prev;
        System.out.println("Current Post: "+ current.content);
    }
    public void insertSponsoredPost(String content) {
        if (current == null)
            return;
        Post sponsored =new Post("[Sponsored] " + content);
        sponsored.next = current.next;
        sponsored.prev = current;
        if (current.next != null) {
            current.next.prev = sponsored;
        } else {
            tail = sponsored;
        }
        current.next = sponsored;
    }
    public void deleteCurrentPost() {
        if (current == null)
            return;
        System.out.println("Deleted: "+ current.content);
        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next;

        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev;

        if (current.next != null)
            current = current.next;
        else
            current = current.prev;
    }
    public void displayFeed() {

        Post temp = head;

        System.out.println("\nFeed:");

        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
}

public class DoubleLinked {

    public static void main(String[] args) {

        SocialMediaFeed feed =new SocialMediaFeed();
        feed.addPost("User A: Good Morning");
        feed.addPost("User B: Learning Java");
        feed.addPost("User C: Vacation Pics");
        feed.displayFeed();
        System.out.println("\nInsert Sponsored Post");
        feed.insertSponsoredPost("Buy New Smartphone");
        feed.displayFeed();
        System.out.println("\nNext Post");
        feed.nextPost();
        System.out.println("\nPrevious Post");
        feed.previousPost();
        System.out.println("\nDelete Current Post");
        feed.deleteCurrentPost();
        feed.displayFeed();
    }
}

