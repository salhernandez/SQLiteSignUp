package test.sqliteloginsignup;

/**
 * Created by chava on 1/8/2017.
 */

public class Task {

    private long taskId;
    private long listId;
    private String name;
    private String notes;
    private String completedDate;
    private String hidden;
    private double fee;

    public static final String TRUE = "1";
    public static final String FALSE = "0";

    public Task() {
        name = "";
        notes = "";
        completedDate = FALSE;
        hidden = FALSE;
        fee = 0.0;
    }

    public Task(int listId, String name, String notes,
                String completed, String hidden, double fee) {
        this.listId = listId;
        this.name = name;
        this.notes = notes;
        this.completedDate = completed;
        this.hidden = hidden;
        this.fee = fee;
    }

    public Task(int taskId, int listId, String name, String notes,
                String completed, String hidden, double fee) {
        this.taskId = taskId;
        this.listId = listId;
        this.name = name;
        this.notes = notes;
        this.completedDate = completed;
        this.hidden = hidden;
        this.fee = fee;
    }

    public long getId() {
        return taskId;
    }

    public void setId(long taskId) {
        this.taskId = taskId;
    }

    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public long getCompletedDateMillis() {
        return Long.parseLong(completedDate);
    }

    public void setCompletedDate(String date_completed) {
        this.completedDate = date_completed;
    }

    public void setCompletedDate(long millis) {
        this.completedDate = Long.toString(millis);
    }

    public String getHidden(){
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public void setFee(double fee){ this.fee = fee;}

    public double getFee() {return fee;}
}
