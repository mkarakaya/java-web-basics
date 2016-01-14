package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;

import com.sofwaredesign.Dog;

/**
 * Servlet implementation class DogCreatorServlet
 */
@WebServlet(name = "fowDogCreatorServlet", description = "creates dog object and forwards to jsp page", urlPatterns = { "/fowDogCreatorServlet" })
public class DogCreatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DogCreatorServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * creates dog object
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(!StringUtils.hasText(request.getParameter("age")) || !StringUtils.hasText(request.getParameter("breed"))){
			throw new IllegalArgumentException("parameters age and breed are mandatory.");
		}
		int age = Integer.valueOf(request.getParameter("age"));
		String breed=request.getParameter("breed");
		Dog dog= new Dog(breed,age);
		request.setAttribute("dog", dog);
		getServletContext().getRequestDispatcher("/WEB-INF/pages/createDog.jsp").forward(request, response);
	}
}
