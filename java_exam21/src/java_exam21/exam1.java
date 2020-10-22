package java_exam21;
import java.util.ArrayList;
import java.util.Scanner;

public class exam1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ids = new ArrayList<>();
		ArrayList<String> titles = new ArrayList<>();
		ArrayList<String> bodies = new ArrayList<>();
		ArrayList<Article> article = new ArrayList<Article>();
		
		int no = 1;

		while (true) {
			System.out.print("명령어 입력 : ");
			String cmd = sc.next();
			if (cmd.equals("exit")) {
				System.out.println("종료");
				break;
			}
			if (cmd.equals("add")) {

				Article a = new Article();
				a.id = no;
				ids.add(no);
				no++;
				System.out.println("게시물 제목을 입력해주세요 :");
				String title = sc.next();
				titles.add(a.title);
				System.out.println("게시물 내용을 입력해주세요 :");
				String body = sc.next();
				bodies.add(a.body);
				System.out.println("게시물이 등록되었습니다.");
			}
			if (cmd.equals("list")) {
				for (int i = 0; i < ids.size(); i++) {
					System.out.println("번호 : " + ids.get(i));
					System.out.println("제목 : " + titles.get(i));
					System.out.println("내용 : " + bodies.get(i));
					System.out.println("===================");
				}
			}
			if(cmd.equals("update")) {

				System.out.println("수정할 게시물 선택 : ");
				String targetTitle = sc.next();
				int targetId = sc.nextInt();

				for(int i = 0; i < titles.size(); i++) {
					String title = titles.get(i);
					if(title.equals(targetTitle)) {
				for(i = 0; i < ids.size(); i++) {
					int id = ids.get(i);
					if(id == targetId) {
						System.out.println("게시물 제목을 입력해주세요 :");
						String newTitle = sc.next();

						System.out.println("게시물 내용을 입력해주세요 :");
						String newBody = sc.next();
						
						titles.set(i, newTitle);
						bodies.set(i, newBody);
						break;
							}
						}
					}
				}
			}
			if(cmd.equals("delete")) {
				
				System.out.print("삭제할 게시물 선택 : ");
				int targetId = sc.nextInt();
				int existFlag = 2; // 1. 있음 2. 없음

				for(int i = 0; i < ids.size(); i++) {
					int id = ids.get(i);
					if(id == targetId) {
						
						ids.remove(i);
						titles.remove(i);
						bodies.remove(i);
						break;
							}
						}
				if(existFlag == 2) {
					System.out.println("게시물이 존재하지 않습니다.");	
				} else {
					System.out.println(targetId +"번 게시물이 삭제되었습니다.");	
				}
				
					}
				}
			}
		}

class Article {
	int id;
	String title;
	String body;
}