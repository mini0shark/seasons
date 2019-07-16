package CMJ.특강_190711;

public class TodoDTO {
	private int id;
	private String todo;
	private boolean done;
	
	public TodoDTO(String todo) {
		this.todo = todo;
		this.done = false;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTodo() {
		return todo;
	}
	
	public void setTodo(String todo) {
		this.todo = todo;
	}
	
	public boolean isDone() {
		return done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}
}
