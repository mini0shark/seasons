package jdbc;

public class TodoDAOTest {
	public static void main(String[] args) {
		TodoDAO tdao = new TodoDAO();
		//�Է� Ȯ��
		//		Todo t = new Todo("����մϴ�.");
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
