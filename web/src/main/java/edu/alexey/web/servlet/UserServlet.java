package edu.alexey.web.servlet;

import java.io.IOException;
import java.util.function.Supplier;

import edu.alexey.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final UserService userService = new UserService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userService.getUser(1L);
		Supplier<String> user = () -> "Hellololo";
		System.out.println(user.get());
	}
}
