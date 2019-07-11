package jdbc;

public class TodoDAOTest {
	public static void main(String[] args) {
		TodoDAO tdao = new TodoDAO();
		//입력 확인
		//		Todo t = new Todo("사랑합니다.");
		//		t.setId(1);
		if(tdao.deleteTodo(2))
			System.out.println("success");
		else
			System.out.println("fail");
		System.out.println(tdao.selectTodo(1));
		for(Todo t: tdao.selectTodo())
			System.out.println(t);

	}
}
