import java.util.ArrayList;
import java.util.List;

public class LibraryNotification {
    private List<String> notifications;

    public LibraryNotification() {
        this.notifications = new ArrayList<>();
    }

    public void notifyStudent(Student student, String book) {
        notifications.add("Student " + student.getName() + " (" + student.getId() + ") has an overdue book: " + book);
    }

    public List<String> getNotifications() {
        return notifications;
    }

    @Override
    public String toString() {
        return "Library Notifications: " + notifications;
    }
}
