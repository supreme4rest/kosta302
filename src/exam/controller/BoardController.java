package exam.controller;

public class BoardController {
	public void select() {
		System.out.println("로컬에서 수정함");
	}
	
    public void insert() {
		  System.out.println("서버에서 수정함");
    }
	
	public void delete() {
	  System.out.println("서버에서 delete");
    }
}
