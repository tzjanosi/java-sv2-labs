package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {
    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> commentsList=new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.commentsList = commentsList;
    }

    public Issue(Issue anotherIssue, CopyMode copyMode) {
        this.name = anotherIssue.name;
        this.time = anotherIssue.time;
        this.status = anotherIssue.status;
        if(copyMode==CopyMode.WITH_COMMENTS){
            for(Comment comment:anotherIssue.commentsList){
                commentsList.add(new Comment(comment));
            }
        }
    }


    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return commentsList;
    }
}
