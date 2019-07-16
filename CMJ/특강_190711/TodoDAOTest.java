package CMJ.특강_190711;

public class TodoDAOTest {
	public static void main(String[] args) throws Exception {
		TodoDTO todoDao = new TodoDTO("study");
		
		TodoDAO.selectTodo(todoDao);
	}
}