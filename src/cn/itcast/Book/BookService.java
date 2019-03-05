package cn.itcast.Book;

import javax.annotation.Resource;

public class BookService {

	// 得到bookdao和orderdao对象
	@Resource(name = "bookDao")
	private BookDao bookDao;

	@Resource(name = "orderDao")
	private OrderDao orderDao;

	public void add() {
		System.out.println("BookService...........");
		bookDao.book();
		orderDao.buy();
	}
}
