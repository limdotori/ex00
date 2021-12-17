package lecture.p03core;

public class MyServlet {
	MyDao dao = new MyDao();

	public void doGet() {
		// 0. 사전 작업
		
		// 2. request handle

		// 3. business logic
		dao.update();
		// 4. add attribute

		// 5. forward / redirect
	}

}
