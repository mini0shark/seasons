package kr.ac.skuniv.todo.dto;

public class Todo {
	private int id;
	private String todo;
	private int done;
	
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
	public int getDone() {
		return done;
	}
	
	public void setDone(int done) {
		this.done = done;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", todo=" + todo + ", done=" + done + "]";
	}
}
