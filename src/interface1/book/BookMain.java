package interface1.book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImplement(); // 구현 클래스 인스턴스화
		Scanner scanner = new Scanner(System.in); // 키보드로 입력 받아주는 클래스

		while (true) {
			System.out.println("=== 도서 관리 시스템 ===");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("===================");
			System.out.print("메뉴 선택: ");
			int choiceNum = scanner.nextInt();
			System.out.println("===================");

			switch (choiceNum) {
			case 1:
				System.out.print("도서 ID: ");
				int bookId = scanner.nextInt();
				scanner.nextLine();
				System.out.print("도서 제목: ");
				String bookTitle = scanner.nextLine();
				System.out.print("저자: ");
				String bookAuthor = scanner.nextLine();

				Book book = new Book(bookId, bookTitle, bookAuthor);
				bookService.addBook(book);
				System.out.println("입력하신 도서가 추가되었습니다.");
				break;
			case 2:
				System.out.println("==== 도서 목록 조회 ====");
				for (Book i : bookService.getAllBooks()) {
					System.out.println("도서 ID: " + i.getId() + ", 도서 제목: " + i.getTitle() + ", 저자: " + i.getAuthor());
				}
				break;
			case 3:
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
//				scanner.close();
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}

		}
	}

}
